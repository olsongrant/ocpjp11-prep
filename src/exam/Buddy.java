package exam;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Buddy {     
	Buddy upper;     
	String name;     
	public Buddy(){ }          
	public Buddy(String name){         
		this.name = name;     
	}     
	public Buddy(String name, Buddy upper){         
		this.name =  name;         
		Buddy b = new Buddy(upper.name);//1         
		upper = b; //2     
	}          
	public static void main(String[] args) {         
		Buddy b1 = new Buddy("A");     //3         
		Buddy b2 = new Buddy("B", b1); //4         
		System.out.println(b1); //5     
		Collection<Number> col = new HashSet<>(); 
		col.add(1); 
		var list1 = List.of(col); //1
		col.add(2); //2 
		var list2 = List.copyOf(col); //3
		System.out.println(list1+", "+list2);
	} 
}

