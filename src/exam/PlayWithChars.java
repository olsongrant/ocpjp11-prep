package exam;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlayWithChars {

	static boolean keepGoing = false;
	public static void main(String[] args) throws IOException {
		int m = 2;
		char c2 = (char) m;
		System.out.println("char c2 based on 2: " + c2);
		int j = 98;
		char d = (char) j;
		System.out.println("char d based on 98: " + d);
		
        try(var fis = new FileInputStream("c:\\code\\java\\ocp11\\sbox\\ocp-prep\\numbers.txt");             
        	var isr = new InputStreamReader(fis)){
        	while(isr.ready()){
        		isr.skip(1);
        		int i = isr.read();
        		char c = (char) i;
        		System.out.print(c);
        	}
        }
        while (keepGoing) {
	        for (int j = 0; j < 3; j++) {
	        	System.out.println(j);
	        }
        }
	}

}
