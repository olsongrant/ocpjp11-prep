package interview;

import java.util.stream.IntStream;

public class Multiples {	

	public static String writeEquation(int lowerBound, int higherBound) {
		IntStream myStream = IntStream.range(lowerBound, higherBound);
		StringBuilder sb = new StringBuilder();
		int sum = myStream.filter((x) -> (x % 5 == 0) || (x % 3 == 0)).peek(j -> {
			sb.append(j);
			sb.append("+");
			return;
		}).sum();
		// 3+5+6+9+, so replace the last character with an = sign
		sb.replace(sb.length() - 1, sb.length(), "=");
		sb.append(sum);
		return sb.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String equationString = Multiples.writeEquation(1, 100);
		System.out.println(equationString);
	}

}
