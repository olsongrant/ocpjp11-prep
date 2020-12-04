package exam;

interface A {
	void m();
}

interface B {
	default void m() {
		System.out.println("B");
	}
}

interface E {
	void m();
}

abstract class C implements A, B { }

abstract class G implements A, E {}

public class AmbiguousInterfacesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
