package generics;

public class TutorialExercise2 {
	
	public static <T> void switchPositions(T[] anArray, int i, int j) {
		if ((i < 0) || (j < 0)) throw new IllegalArgumentException("incoming index was negative");
		if ((i > anArray.length) || (j > anArray.length)) throw new IllegalArgumentException("incoming index too large");
		T temp = anArray[j];
		anArray[j] = anArray[i];
		anArray[i] = temp;
	}

	public static void main(String[] args) {
		String[] series = {"zero", "two", "one", "three"};
		TutorialExercise2.switchPositions(series, 1, 2);
		for (String s: series) {
			System.out.print(s + ":");
		}
		System.out.println(System.lineSeparator());
		
		Integer[] intArray = {10, 12, 11, 13};
		TutorialExercise2.switchPositions(intArray, 1, 2);
		for (int s: intArray) {
			System.out.print(s + ":");
		}
		System.out.println(System.lineSeparator());		
	}

}
