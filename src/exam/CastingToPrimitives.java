package exam;

import java.time.LocalDate;

public class CastingToPrimitives {

	public static void main(String[] args) {
		Object fiveObject = Integer.valueOf(5);
		try {
			int five = (int) fiveObject;
			System.out.println("five: " + five);
			Object nowObject = LocalDate.now();
			short nowShort = (short) nowObject;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
