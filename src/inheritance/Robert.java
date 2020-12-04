package inheritance;

public interface Robert {

	default String identifySelf() {
		return "I am Robert.";
	}
	
}
