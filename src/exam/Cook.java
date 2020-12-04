package exam;

public final class Cook {
	static class Vegetable {
		float vitamins() { return 8f; }
	}
	final class Carrot extends Vegetable {
		final float vitamins() { return 4; }
	}
	public final static void main(String[] unused) {
		final Carrot c = new Cook().new Carrot() {}; 
		System.out.println(c.vitamins());
	} 
}
