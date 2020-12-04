package exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

class Base {
	public <T extends CharSequence> Collection<String> transform(Collection<T> list) {     
		System.out.println("Base: transform");
		return new ArrayList<String>();    
	}

}

public class Derived extends Base {
	public <T extends CharSequence> Collection<String> transform(Collection<T> list) { 
		System.out.println("Derived::transform(Collection)");
		return new ArrayList<String>(); 
	};
	

	public <T extends CharSequence> Collection<T> transform(List<T> list) { 
		return new HashSet<T>(); 
	};
	
	public static void main(String[] args) {
		Base base = new Derived();

	}

}
