package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class SerializationManager {

	public static void main(String[] args) {
		try {
			SerializationManager.cleanUp();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Complicated myComplicated = new Complicated();
		try (ObjectOutputStream outStream = new ObjectOutputStream(
				new FileOutputStream("complicated.ser"))) {

			outStream.writeObject(myComplicated);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (ObjectInputStream inStream = new ObjectInputStream(
				new FileInputStream("complicated.ser"))) {
			Complicated c = (Complicated) inStream.readObject();
			System.out.println(c);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	public static void cleanUp() throws IOException {
		Files.deleteIfExists(Path.of("complicated.ser"));
	}

}
