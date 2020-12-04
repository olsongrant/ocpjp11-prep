package exam;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.net.ssl.SSLException;

class MyBase {
	public void go() throws IOException {
		System.out.println("Base::go");
	}
}
class OneLevelUp extends MyBase {
	
	public void go() throws RuntimeException {
		System.out.println("OneLevelUp::go");
	}
}
class TwoLevelsUp extends OneLevelUp {
	public void go() throws IOException {
		System.out.println("TwoLevelsUp::go");
	}
}
public class OverridesAndExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
