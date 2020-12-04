package exam;

import java.util.function.Predicate;

class Foo {
	int i;
	Foo(int i) {
		this.i = i;
	}
}

public class UntypedPredicateTest {

	static boolean compare(Foo foo, Predicate predicate) {
		return predicate.test(foo);
	}
	
	public static void main(String[] args) {
		Predicate p = f -> f.i > 0;
		p = p.or(f -> f.i > 0).and(f -> f.i < 0);
		boolean b = compare(new Foo(1), p);
		System.out.println(b);

	}

}
