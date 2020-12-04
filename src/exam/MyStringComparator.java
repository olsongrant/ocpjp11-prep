package exam;
import java.util.*;

public class MyStringComparator implements Comparator {     
	public int compare(Object o1, Object o2)     {
		int s1 = ((String) o1).length();       
		int s2 = ((String) o2).length();       
		return s1 - s2;    
	} 

	public static void main(String[] args) {
		String[] sa = { "d", "bbb", "aaaa", "ufg" };
		int response = Arrays.binarySearch(sa, "abc", new MyStringComparator());
		System.out.println("binarySearch for abc: " + response);
		List<Double> dList = Arrays.asList(10.0, 12.0); 
		dList.forEach(x->{ x = x + 10; }); 
		dList.forEach(x->System.out.println(x)); 
		MyStringComparator.compareToWithIntegers();
	}
	
	public static void compareToWithIntegers() {
		Integer two = Integer.valueOf(2);
		Integer five = Integer.valueOf(5);
		int answer = two.compareTo(five);
		System.out.println("two.compareTo(five): " + answer);
		int[] a = { 'h', 'e', 'l'};         
		int[] b = { 'h', 'e', 'l', 'l', 'o', 'o'};  
		int[] c = { 'h', 'e', 'l', 'p' };
		int x = Arrays.compare(a, b);         
		int y = Arrays.mismatch(a, b);         
		System.out.println(x+" "+y);
		System.out.println("Integer.compare(2, 5): " + Integer.compare(2, 5));
		System.out.println("Arrays.compare h-e-l-p to h-e-l-l-o-o: " + Arrays.compare(b, c));
	}

}
