package com.example.demo;

public class TestController {

	public static void main(String[] args) {
		TestSky testSky = new TestSky("fieldValue");
		
		testSky.testPublic("testPublic");
		
		testSky.testProtected(0);
		
		String res = testSky.returnString(100);
		
		String a = res + 100;
		System.out.println(a);
		
		LoginEntity loginEntity = new LoginEntity();
		testSky.login(loginEntity);

	}
}
