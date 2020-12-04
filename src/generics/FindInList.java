package generics;

import java.util.List;
import java.util.function.Predicate;

public class FindInList {

	public static <T>
    int findFirst(List<T> list, int begin, int end, Predicate<T> p) {
		return 0;
	}
	public static void main(String[] args) {
		List<Integer> myList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Predicate<Integer> myTester = (k) -> k % 2 == 0;
		FindInList.findFirst(myList, 0, 4, myTester);

	}

}
