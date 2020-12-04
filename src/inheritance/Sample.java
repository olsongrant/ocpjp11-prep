package inheritance;

public class Sample implements IInt{    
	public static void main(String[] args){       
		Sample s = new Sample();  //1       
		int j = s.thevalue;       //2       
		int k = IInt.thevalue;    //3       
		int l = thevalue;         //4
		Sample.sing();
	} 

} 
interface IInt {       
	int thevalue = 0; 
	
	static void sing() {
		System.out.println("Sing a song.");
	};
}


