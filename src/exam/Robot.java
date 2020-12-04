package exam;

public class Robot {
	private final int cpuCount;
	private final boolean reboot;

	public Robot() throws Exception {
		// LINE X
		this(3);
//		reboot = false;
		// LINE Z
	}

	public Robot(int numberBags) throws Exception {
		this.cpuCount = numberBags;
		reboot = true;
	}

	public static void main(String[] args) throws Exception {
		Robot seed = new Robot();
		System.out.println(seed.cpuCount);
		System.out.println(hidePhone());
	}
	
	public static String hidePhone() {
		String fullPhoneNumber = "507-867-5309";
		return new StringBuilder("xxx-xxx-")+fullPhoneNumber.substring(8);
	}
}
