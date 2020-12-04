package functional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByWithCounting {

	public static void main(String[] args) {
		List l1 = List.of(1);
		List l2 = List.of(1, 2);
		List l3 = List.of(2, 3);
		List l4 = List.of(3, 4, 5);
		Map<Object, Long> result = Stream.of(l1, l2, l3, l4)
				.collect(Collectors.groupingBy(List::size, Collectors.counting()));
				

	}

}
