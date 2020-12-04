package exam;

import exam.RaceCar.Door;
import exam.RaceCar.Window;

public class AreTheyEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RaceCar r = new RaceCar() {};
	    Window w = new Window() {};
	    Door d = new Door();
	    if (r.equals(w)) {  // trying r==w does not compile
	    	System.out.println("unexpected");
	    } else {
	    	System.out.println("duh");
	    }
	    if (1 == 1.0) {
	    	System.out.println("int == double");
	    }
	    int myInt = 1;
	    double mydouble = 1;
	    if (myInt == mydouble) {
	    	System.out.println("myInt == mydouble");
	    }
	    another();
	}
	
	public static void another() {
			String str = "10";        
			int iVal = 0;         
			Double dVal = 0.0;         
			try{             
				iVal = Integer.parseInt(str);  
				//1             
				if((dVal = Double.parseDouble(str)) == iVal){ //2                 
					System.out.println("Equal");            
				}        
			}catch(NumberFormatException e){            
				System.out.println("Exception in parsing");        
			}         
			System.out.println(iVal+" "+dVal);             
	}
}
