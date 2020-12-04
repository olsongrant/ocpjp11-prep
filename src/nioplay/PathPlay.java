package nioplay;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PathPlay {

	public static void main(String[] args) throws IOException {
		Path root = Path.of("root");
		Path b = Path.of("root/a/b");
		Path c = Path.of("root/c");
		Files.createDirectories(b);
		Files.createDirectory(c);
		Files.walk(root).forEach(System.out::println);
	}

}
