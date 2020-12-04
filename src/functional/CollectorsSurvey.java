package functional;

import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsSurvey {

	public static void main(String[] args) {
		Collector<CharSequence, ?, String> aCollector = Collectors.joining();
		Set<Collector.Characteristics> characteristics = aCollector.characteristics();
		for (var item: characteristics) {
			System.out.println(item);
		}
		Predicate even = (Object i) -> i.hashCode()%2==0;  // if your functional interface is untyped, then you must treat the variable as an Object
	}

}
