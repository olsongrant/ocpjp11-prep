package exam;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Relativize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Relativize.example1();
	}
	
	public static void example1() {
		Path relative = Paths.get("zoo.txt");
//		Path base1 = Paths.get("..", "..", "temp", "delete", "dictionary.txt");
		Path base1 = Paths.get("a", "b", "c");
		Path base2 = Paths.get("a",  "b",  "c",    "d",      "e");

		Path relativized1 = base1.relativize(relative);
		System.out.println("relativized1: "+relativized1);
		Path relativized2 = base2.relativize(relative);
		System.out.println("relativized2: "+relativized2);

		Path resolved1 = base1.resolve(relativized1).normalize();
		System.out.println("resolved1="+resolved1);
		Path resolved2 = base2.resolve(relativized2).normalize();
		System.out.println("resolved2="+resolved2);
		System.out.println("zoo.txt as an absolute path: " + relative.toAbsolutePath());
		Path baseWithRoot = relative.toAbsolutePath();
		try {
			Path relativeToRoot = baseWithRoot.relativize(base1);
			System.out.println(baseWithRoot.toString() + "relativized to " + relativeToRoot.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		Path base1WithRoot = base1.toAbsolutePath();
		Path relativizedWithRootPaths = baseWithRoot.relativize(base1WithRoot);
		System.out.println("base path: " + baseWithRoot);
		System.out.println("input to relativize(): " + base1WithRoot);
		System.out.println("relativized: " + relativizedWithRootPaths);
	}

}
