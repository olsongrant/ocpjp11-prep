package functional;

import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RandomStreamPlay {
	static Random myDieRandom = new Random();

	public static void main(String[] args) {
		Random aRandom = new Random();
		IntStream dieRolls = aRandom.ints(1, 7);
		OptionalInt myMax = dieRolls.limit(30).peek(System.out::println).max();
		int theMax = myMax.orElse(12);
		System.out.println("max die roll: " + theMax);
		System.out.println("nextGaussian: " + aRandom.nextGaussian());
		System.out.println("nextInt(10): " + aRandom.nextInt(10));
		
		Stream<Integer> twoDiceStream = Stream.generate(() -> (
				RandomStreamPlay.nextDieRoll() + RandomStreamPlay.nextDieRoll()));
		IntSummaryStatistics stats = twoDiceStream.limit(100).
				collect(Collectors.summarizingInt(x->x));
		System.out.println(stats);
	}
	
	public static int nextDieRoll() {
		return myDieRandom.nextInt(6) + 1;
	}
}
