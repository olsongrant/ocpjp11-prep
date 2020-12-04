package exam;

interface Koo {
	int calculate(int i1, int i2);
}
public class AnotherUntypedLambda {

	public static void main(String[] args) {
		Koo foo1 = (i1, i2) -> i1 + i2;
		foo1.calculate(3, 4);
	}

}
