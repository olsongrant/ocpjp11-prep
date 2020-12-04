package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Complicated implements Serializable {
	protected String name = "complicated";
	protected int age = 49;
	protected char letter = 'z';
	protected List<String> strings = new ArrayList<>(List.of("hi", "hello", "hola"));

	public static void main(String[] args) {
		

	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name);
		sb.append(" -- ");
		sb.append(this.age);
		sb.append(" -- ");
		sb.append(this.letter);
		sb.append(" -- ");
		sb.append(this.strings);
		sb.append(".");
		return sb.toString();
	}

	private void writeObject(ObjectOutputStream stream) throws IOException {
		System.out.println("Complicated::writeObject");
		ObjectOutputStream.PutField fields = stream.putFields();
		fields.put("name", "Rodrigo");
		fields.put("age", 15);
		fields.put("letter", 'v');
		stream.writeFields();
	}
	
	protected Object writeReplace() throws ObjectStreamException {
		System.out.println("Complicated::writeReplace");
		Complicated blankComplicated = new Complicated();
		blankComplicated.setAge(1);
		blankComplicated.setLetter('o');
		blankComplicated.setName("blank");
		return blankComplicated;
	}
	
	protected Object readResolve() throws ObjectStreamException {
		System.out.println("Complicated::readResolve");
		Complicated standin = new Complicated();
		standin.setAge(50);
		standin.setLetter('b');
		standin.setName("replacement");
		return standin;
	}
	
	private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
		ObjectInputStream.GetField fields = in.readFields();
		String aName = (String) fields.get("name", "DEFAULT");
		System.out.println("name: " + aName);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public List<String> getStrings() {
		return strings;
	}

	public void setStrings(List<String> strings) {
		this.strings = strings;
	}

}
