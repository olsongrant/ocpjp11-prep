package generics;

import java.util.ArrayList;
import java.util.List;

public class TutorialExercise3 {

	public static void main(String[] args) {
		List<? extends Object> aList = new ArrayList<String>();
		List<String> myStrings = List.of("one", "two", "three", "four", "five");
		String maxString = TutorialExercise3.max(myStrings, 0, 3);
		System.out.println("maxString: " + maxString);
	}

	public static <T extends Comparable<? super T>> T max(
			List<? extends T> list, int begin, int end) {

		T maxElem = list.get(begin);

		for (++begin; begin < end; ++begin)
			if (maxElem.compareTo(list.get(begin)) < 0)
				maxElem = list.get(begin);
		return maxElem;
	}
}
