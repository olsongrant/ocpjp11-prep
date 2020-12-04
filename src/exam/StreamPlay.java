package exam;

import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;

public class StreamPlay {

	public static void main(String[] args) {
	//	doubleFindAny();	

	//	sampleQuestionBrokenDown();
//		numStream.forEach(s -> System.out.println(s));
//		StreamPlay.tryMapMerge();
		StreamPlay.tryStreamWithMerge();
//		StreamPlay.exam3merge1();
	}
	
	private static void exam3merge1() {
		var map = new HashMap<Integer, Integer>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, null);
		map.put(4, 11);
		map.put(5, 8);
		BiFunction<Integer, Integer, Integer> useDefaultIfEvenAndNullifyIfOdd 
			= (Integer x, Integer y) -> { return (x % 2 != 0) ? null : y; };
//		map.merge(1, 3, v -> v);
//		map.merge(3, 3, v -> v);
		map.merge(1, 5, useDefaultIfEvenAndNullifyIfOdd);
		map.merge(3, 7, useDefaultIfEvenAndNullifyIfOdd);
		map.merge(4, 9, useDefaultIfEvenAndNullifyIfOdd);
		map.merge(5, 6, useDefaultIfEvenAndNullifyIfOdd);
		System.out.println(map);
	}
	
	private static void tryMapMerge() {
		
		BiFunction<String, String, String> chooseTheLonger 
			= (v1, v2) -> v1.length() > v2.length() ? v1: v2;
		Map<String, String> favorites = new HashMap<>();
		favorites.put("key1", null);
		favorites.put("key2", "aValue2");
		favorites.put("key3", "value3IsLong");
		String newValue1 = favorites.merge("key1", "Skyride", chooseTheLonger);
		String newValue2 = favorites.merge("key2", "Skyride", chooseTheLonger);
		String newValue3 = favorites.merge("key3", "Skyride", chooseTheLonger);
		System.out.println(favorites);
	}
	
	private static void tryStreamWithMerge() {
		List<String> stringsList = new ArrayList<>();
		stringsList.add("keyUno");
		stringsList.add("keyZwei");
		stringsList.add("keyThree");
		stringsList.add("keyFour");
		Map<String, String> aMap = stringsList.stream()
					.collect(
					Collectors.toMap(s -> s, String::toUpperCase));
		System.out.println("Using collect(Collectors.toMap()): " + aMap);
		Map<String, List<String>> map2 = stringsList.stream()
				.collect(Collectors.groupingBy(StreamPlay::hashMarkLength));
		System.out.println(map2);
		Set<Entry<String, List<String>>> entries = map2.entrySet();
		for (Entry<String, List<String>> entry: entries) {
			entry.getValue().forEach(System.out::println);
		}
		
		map2.entrySet().stream()
			.flatMap(StreamPlay::convertEntry)
			.forEach(System.out::println);
		
		Map<String, String> endingMap = map2.entrySet().stream()
			.flatMap(StreamPlay::convertEntry)
			.collect(Collectors.toMap(x -> (String) x.getKey(), y -> (String) y.getValue()));
		System.out.println(endingMap);		
	}
	
	private static Stream<Entry<String, String>> convertEntry(Entry<String, List<String>> entryWithList) {
		String key = entryWithList.getKey();
		HashMap<String, String> myMap = new HashMap<>();
		for (String aValue: entryWithList.getValue()) {
			myMap.put(key, aValue);
		}
		return myMap.entrySet().stream();
	}
	
	private static String hashMarkLength(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			sb.append("I");
		}
		return sb.toString();
	}

	private static void sampleQuestionBrokenDown() {
		Stream<Integer> numStream = Stream.of(10, 20, 30);
		numStream = numStream.map(n -> n + 10).peek(s -> System.out.print(s));
		Optional<Integer> op = numStream.min(Integer::compare);
		System.out.println(System.lineSeparator() + op.orElse(-1));
	}

	private static void doubleFindAny() {
		var ds = DoubleStream.empty();
		var opt = ds.findAny();
		System.out.println(opt.orElse(9));
	}

}
