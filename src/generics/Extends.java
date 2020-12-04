package generics;

import java.util.List;

public class Extends {
	
	public static void print(List<? extends Number> list) {
	    for (Number n : list)
	        System.out.print(n + " ");
	    System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
