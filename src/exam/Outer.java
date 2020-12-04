package exam;

public class Outer {
	private String name = "Hi";
	protected int age = 100;
	
	public class InnerNested {
		private String title = "King";
		private Integer number = Integer.valueOf(age);
		
		private static final int identifier = 1;  // only compiles if this static variable is final
		
		{ System.out.println("instance initializer InnerNested"); }
		
	/*	public static void callMe() {
			System.out.println("Yo");
		} */ // Won't compile because static methods aren't allowed in inner classes
		
		public int provideIdentifier() {
			System.out.println("entry into InnerNested::provideIdentifier");
			class MyLocal extends InnerNested {
				public int repeatIdentifier() {
					return number;
				}
			}
			MyLocal l = new MyLocal();
			System.out.println("MyLocal::repeatIdentifier(): " + l.repeatIdentifier());
			return identifier * 5;
		}
	}
	
	public static class StaticNested {
		private String handle = "Tomb Raider";
		public static void callMe() {
			System.out.println("Yo from StaticNested");
		}
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		InnerNested innerNested = outer.new InnerNested();
		innerNested.provideIdentifier();
		Outer.StaticNested.callMe();

	}

}
