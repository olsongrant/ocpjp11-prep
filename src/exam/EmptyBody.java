package exam;

public class EmptyBody {

	public static void main(String[] args) {
		if (true);
		// switch(5); won't compile without a body
		//do while(true); apparently this must have a body
		while(args.length > 0);
		for(;;);
		
		

	}

}
