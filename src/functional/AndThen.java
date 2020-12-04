package functional;

import java.util.function.Function;

public class AndThen {

	public static void main(String[] args) {
		Function<String, Integer> lengthFunction = String::length;
		Function<String, Integer> lengthTimes2 = lengthFunction.andThen((i) -> i * 2);
		Integer result = lengthTimes2.apply("Howdy");
		System.out.println("Result: " + result);
	}

}
