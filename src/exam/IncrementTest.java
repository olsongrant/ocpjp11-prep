package exam;

import java.util.List;

public class IncrementTest {
	String color;
	public IncrementTest(String color) {
		color = color; // this assignment has no effect
	}
  public static void main(String args[ ] ){
	  IncrementTest t = new IncrementTest("white");
	  System.out.println(t.color);
     int i = 1;
     int[] iArr = {1};
     incr(i) ;
     incr(iArr) ;
     System.out.println( "i = " + i + "  iArr[0] = " + iArr [ 0 ] ) ;
     IncrementTest.loop();
     var y = 4;
     int x = 10 - ++y / 5;
     System.out.println(x % y);
     IncrementTest.assignInsideInitializer();
  }
  public static void incr(int   n ) { n++ ; }
  public static void incr(int[ ] n ) { n [ 0 ]++ ; }
  
  public static void loop() {
	  List<String> myStrings = List.of("Apple", "Banana", "Carrot");
	  for (final var s: myStrings) {
		  System.out.println(s);
	  }
	  // final doesn't work, here
	  for (/* final */ int i = 0; i < myStrings.size(); i++) {
		  System.out.println(myStrings.get(i));
	  }
  }
  
  public static void assignInsideInitializer() {
	  int x = (x = 4) * 3;
	  System.out.println("int x = (x = 4) * 3: " + x);
  }
}
