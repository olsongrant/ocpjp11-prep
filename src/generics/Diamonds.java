package generics;

import java.util.ArrayList;
import java.util.List;

public class Diamonds {

	public static void main(String[] args) {
		List untyped = new ArrayList();
		List withDiamond = new ArrayList<>();
		untyped.add("First");
		withDiamond.add(Integer.valueOf(5));
		List temp = untyped;
		untyped = withDiamond;
		withDiamond = temp;
		System.out.println("The String list: " + withDiamond);
		System.out.println("The Integer list: " + untyped);
		withDiamond.add(Integer.valueOf(1));
		untyped.add("Second");
		System.out.println("The String list: " + withDiamond);
		System.out.println("The Integer list: " + untyped);
		var ListByVar = new ArrayList<>();
	}

}
