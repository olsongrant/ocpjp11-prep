package exam;

public class ThrowingNull {

	public static void main(String[] args) {
		try {
			throw null;
		} catch (NullPointerException npe) {
			System.out.println(npe);
		}
		throw null;

	}

}
