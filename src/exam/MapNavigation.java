package exam;

import java.util.Map;
import java.util.TreeMap;

public class MapNavigation {

	public static void main(String[] args) {
		TreeMap<String, Integer> tMap1 = new TreeMap<>();
		String sentence = "Now is the time for every good man to come to the aid of his country.";
		String[] pieces = sentence.split(" ");
		for (String s: pieces) {
			tMap1.put(s, s.length());
		}
		Map.Entry<String, Integer> ceiling = tMap1.ceilingEntry("fo");
		System.out.println("ceiling entry for fo: " + ceiling);
		Map.Entry<String, Integer> first = tMap1.firstEntry();
		System.out.println("first entry: " + first);
		Map.Entry<String, Integer> floor = tMap1.floorEntry("co");
		System.out.println("floor entry for co: " + floor);
		Map.Entry<String, Integer> higher = tMap1.higherEntry("dog");
		System.out.println("higher entry for dog: " + higher);
		tMap1.compute("howdy", (x, i) -> x.length());
		System.out.println(tMap1);
		tMap1.computeIfAbsent("soccer", y -> y.length());
		tMap1.computeIfPresent("soccer", (m, j) -> j + m.length());
		tMap1.merge("good", 6, (i, j) -> Math.max(i, j));
		tMap1.merge("bad", -9, (x, y) -> Math.max(x, y));
		tMap1.forEach((k, v) -> System.out.println(k + " --> " + v));
	}

}
