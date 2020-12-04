package exam;

@FunctionalInterface
public interface PlayDnD {
	public static void roll() { roll(); }
	private int takeBreak() { roll(); return 1; }
	void startGame();
	default void win();
	static void end() { win(); }
	boolean equals(Object o);
}
