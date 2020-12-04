package exam;

import java.util.function.Predicate;

class FFoo {
	int i;
	FFoo(int i) {
		this.i = i;
	}
}

public class Bar {
	
	static boolean compare(FFoo foo, Predicate predicate) {
		return predicate.test(foo);
	}
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append(' '); // if you add another space within the single-quotes, it won't compile
		String text = "abcdefghijkl";
		int index = text.lastIndexOf("d", 5);
		System.out.println("'abcdefghijkl'.lastIndexOf(\"d\", 5): " + index);
		float addend1 = 4L / 2;
//		int a2 = 4L / 2;
		float long2Float = 500L;
		float f2 = (float) 1e0;
//		Predicate p = f -> f.i > 0;
//		boolean b = compare(new Foo(1), p);
	}
}