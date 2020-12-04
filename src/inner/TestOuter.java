package inner;

public class TestOuter
{
   public void myOuterMethod()
   {
      TestInner anInstance = new TestOuter().new TestInner();

   }
   public class TestInner {
	   static final int innerVal = 0;
	//   static String className = "TestInner"; // will not compile
   }
   public static void main(String[] args)
   {
      var to = new TestOuter();
      TestOuter.TestInner inner = to.new TestInner();
      TestInner inner2 = to.new TestInner();
      new to.TestInner();
   }
}

