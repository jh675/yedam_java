package com.yedam.java.ch0202;

public class VariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수 리터럴
		int var1 = 0b0011; //0b가 붙을 경우 2진수
		int var2 = 0206; //02가 붙을 경우 8진수
		int var3 = 0xB3; //0x가 붙을 경우 16진수
		int var4 = 458; //10진수. 디폴트로 사용됨.
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		
		//byte 타입. byte는 -128~127까지 가능하다.
		byte v1 = -128;
		byte v2 = 127;
		byte v3 = 0;
		byte v4 = 30;
		byte v5 = 127;
		
		//long 타입
		long n1 = 20;
		long n2 = 7389134312982L;
		
		//char 타입
		char c1 = 'A'; 
		char c2 = 645;
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44036;
		char c6 = '\u0245';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		//String 타입
		String name = "김진환";
		String job = "프로그래머";
		
		System.out.println("번호\t이름\t직업");
		System.out.println("우리는\"개발자\"입니다.");
		System.out.println("봅\\여름\\가을\\겨울");
		
		//실수 리터럴
		float f1 = 3.14F;
		double d1 = 3.14;
		
		float varF = 0.1234567890123456789F;
		double varD = 0.123456789123456789;
		
		System.out.println("f1 : " + f1);
		System.out.println("d1 : " + d1);
		System.out.println("varF : " + varF);
		System.out.println("varD : " + varD);
		
		//논리 타입
		boolean stop = true;
		if( stop ) { //조건식이 참일 경우 실행.
			System.out.println("중지합니다.");
		} else { //조건식이 거짓일 경우 실행.
			System.out.println("시작합니다.");
		}
	}

}