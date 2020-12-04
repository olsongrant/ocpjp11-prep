package functional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalPlay {
	static boolean causeNull = true;

	public static void main(String[] args) {
		Optional<String> messageOptional = Optional.ofNullable(OptionalPlay.getMessage());
		try {
			System.out.println(messageOptional.get());
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		System.out.println("orElse: " + messageOptional.orElse("Substitute Value"));
		System.out.println("orElseGet: " + messageOptional.orElseGet(() -> "Supplied"));
		OptionalPlay.causeNull = false;
		try {
			System.out.println("filtered: " + messageOptional.filter((s) -> s.length() > 6));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			OptionalPlay.causeNull = true;
			Optional<String> straightOptional = Optional.ofNullable(OptionalPlay.getMessage());
			System.out.println("Trying orElseThrow: " + straightOptional.orElseThrow(() 
					-> new StringIndexOutOfBoundsException("nothing there")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		OptionalPlay.testEquals();
	}

	private static String getMessage() {
		if (OptionalPlay.causeNull) {
			return null;
		} else {
			return "Howdy";
		}
	}

	private static void testEquals() {
		Optional<String> myStringOptional = Optional.of("machine");
		Optional myUnspecifiedOptional = Optional.of("machine");
		if (myStringOptional.equals(myUnspecifiedOptional)) {
			System.out.println("they are equal");
		} else {
			System.out.println("not equal");
		}
	}
}
