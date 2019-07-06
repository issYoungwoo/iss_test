package src.main.java.com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.TestSky;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	
		TestSky testSky = new TestSky("fieldValue");
		
		testSky.testPublic("testPublic");
		
		
//		int iA = 0;
//		Integer iB = 0;
//		
//		boolean flgA = true;
//		
//		Boolean flgB = false;
//		
//		String strA = "test";
//		
//		String strB = "test";
//		
//		if (iA == iB) {
//			System.out.println(iA);
//		}
//	
//		if (strA.equals(strB)) {
//			System.out.println(strA);
//		}
	
	}

}
