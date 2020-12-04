package exam;

public class OperatorPrecedence {

	public static void main(String[] args) {
		int a = 5;
		 int b = -2;
		 int c = 2;
		 boolean exp1 = a + b * c <= a + c * b; //_________ (value of exp1)
		 boolean exp2 = !(c + a > b); //_________ (value of exp2)
		 boolean exp3 = b - a >= c; // _________ (value of exp3)
		 boolean z = exp1 && exp2 || exp3;
		 System.out.println( "z = " + z ); 
		 z = exp3 || exp1 && !exp2;
		 System.out.println( "z = " + z ); 
		 b = --b + ++a % 4 * c++ * 2;
		 System.out.println( "a = " + a ); 
		 System.out.println( "b = " + b ); 
		 System.out.println( "c = " + c ); 
		 
		 System.out.println("((true) | (true)): " + ((true) | (true)));
	}

}
