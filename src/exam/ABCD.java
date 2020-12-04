package exam;

class ABase {
   int x = 10;
   static int y = 20;
}
class MNOP extends ABase {
   int x = 30;
   static int y = 40;
}

public class ABCD {
   public static void main(String[] args) {
	  System.out.println(new MNOP().x+", "+new MNOP().y);
	  ABase base = new MNOP();
	  System.out.println(base.x+", "+ base.y);
   }
}
