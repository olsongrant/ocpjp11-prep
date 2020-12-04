package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class TutorialExercise1 {
	
	public static <T> long countMatches(Collection<T> collection, Predicate<T> tester) {
		return collection.stream().filter(tester).count();
	}

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		Predicate<Integer> myPredicate = (x) -> x % 3 == 0;
		long count = TutorialExercise1.countMatches(myList, myPredicate);
		System.out.println("Count: " + count);
	}

}
