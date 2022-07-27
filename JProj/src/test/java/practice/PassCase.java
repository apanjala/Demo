package practice;

import org.testng.annotations.Test;

public class PassCase {

@Test

public void testcase2() {
		
		int a = 10;
		int b = 20;
		int c= a+b;
		if(c==30) {
			System.out.println("passing case");
		}
		else {
			System.out.println("failing case");
		}

	}

}
