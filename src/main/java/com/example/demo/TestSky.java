package com.example.demo;

public class TestSky {
	String field;
	
	public TestSky() {
		field = "test"; 
	}

	public TestSky(String filed) {
		super();
		this.field = filed;
	}

	// 전역변수와 지역변수 차이 Start
	public void testField(String str) {
		String var = null;
		
		System.out.println(var);
		System.out.println(field);
		
	}
	
	private void testVar(int i) {
		System.out.println(field);
	}
	// 전역변수와 지역변수 차이 End
	
	// method의 호출 파라메터, 변수 값 저장 Start
	public void testPublic(String str) {
		String var = str;
		
		System.out.println("testPublic Start");
		System.out.println(var);
		System.out.println(str);
		System.out.println(field);
		
		testPrivate(0);
		
		System.out.println("testPublic End");
		System.out.println();
	}
	// method의 호출 파라메터, 변수 값 저장 Start
	
	private void testPrivate(int i) {
		System.out.println("testPrivate Start");
		System.out.println(field);
		System.out.println("testPrivate End");
		System.out.println();
	}

	protected void testProtected(int i) {
		System.out.println("testProtected Start");
		System.out.println(field);
		System.out.println("testProtected End");
		System.out.println();
	}
	
	// return value 설정
	public String returnString(int i) {
		
		String res = Integer.toString(i);
		return res;
	}
	
	// 오버라이드 Start
	public boolean testOverride(int i) {
		boolean res = false;
		if (i > 5) {
			res = testOverride(10);	
		}
		return res;
	}
	
	public boolean testOverride(int i, int a) {
		boolean res = false;
		if (i > 10) {
			res = true;
		}
		return res;
	}
	
	public void login(String id, String password){
		
	}
	
    public void login(LoginEntity loginEntity){
		
	}
}
