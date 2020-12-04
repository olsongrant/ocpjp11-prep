package exam;

import java.util.function.Function;

public class IntToLong {
	static long calculate(int factor, Function func) {
		return func.apply(factor);
	}

	public static void main(String[] args) {
		int factor = 2;
		System.out.println(calculate(3, x -> factor * x ));

	}

}
