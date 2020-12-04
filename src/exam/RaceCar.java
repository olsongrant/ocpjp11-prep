/* no comment here? */
package exam;

import java.io.*;

public class RaceCar {
   static class Door implements AutoCloseable {
      public void close() { System.out.print("D"); }
   }
   static class Window implements Closeable {
      public void close() { System.out.print("W"); }
   }
   public static void main(String[] args) {
	  RaceCar r = new RaceCar() {};
      Window w = new Window() {};
      Door d = new Door();
      try (w; d) {
         System.out.print("T");
      } catch (Exception e) {
         System.out.print("E");
      } finally {
         System.out.print("F");
      }
      RaceCar.goofyUnrelated();
   }
   public static void goofyUnrelated() {
	   int[] nums = new int[] { 1, 0, 2 };
	   Object p = nums;
	   int[] two = (int[]) p;
	   System.out.println(10 / two[2]);	   
   }
}
