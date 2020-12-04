package exam;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;
import java.util.function.BiConsumer;

class Persona {
	String name;
	
	int age;
	
	Persona(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class PersonBiConsumer {

	public static void main(String[] args) {
		Persona john = new Persona("John", 30);
		Persona jane = new Persona("Jane", 20);
		Map people = Stream.of(john, jane)
				.collect(Collectors.toMap(p -> p.name,  p -> p.age));
		BiConsumer consumer = (s, i) -> {
			if (i > 25) {
				System.out.println(s);
			}
		};
	}

}
