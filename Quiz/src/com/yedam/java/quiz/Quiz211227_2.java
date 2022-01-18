package com.yedam.java.quiz;

import java.util.Scanner;

public class Quiz211227_2 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		//퀴즈2
		String inputData;
		
		System.out.print("문자열을 입력하시오.  ");
		inputData = scanner.nextLine();
		
		System.out.print("입력된 문자열은 " + inputData + "입니다.");
		
		//88p 문제 9번
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		
		int result = (int)(var1 + var2 + (int)var3 + Double.parseDouble(var4)); 
		System.out.print(result);
		
		//88p 문제 11번
		byte value1 = Byte.parseByte("10");
		int value2 = Integer.parseInt("1000");
		float value3 = Float.parseFloat("20.5");
		double value4 =Double.parseDouble("3.14159");
		
		//98p 문제 1번
		String name = "김자바";
		int age = 25;
		String tel1="010", tel2="123", tel3="4567";
		System.out.println("이름: " + name);
		System.out.print("나이: " + age + "\n");
		System.out.printf("전화: " + tel1 + "-" + tel2 + "-" + tel3);
		
		//99p 문제 2번
		System.out.print("첫번째 수: ");
		String strNum1 = scanner.nextLine(); 
		String strNum2 = scanner.nextLine();
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result1 = num1 + num2;
		System.out.println("덧셈 결과: " + result1);
		
		//99p 문제 3번
		int strSsn;
		String strName, strPhone;
		
		System.out.println("[필수 정보 입력]");
		System.out.print("이름: ");
		strName = scanner.nextLine();
		System.out.print("주민번호 앞 6자리: ");
		strSsn = scanner.nextInt();
		System.out.print("전화번호: ");
		strPhone = scanner.nextLine();
		
		System.out.print("");
		System.out.println("입력한 내용");
		System.out.print(strName + "\n" + strSsn + "\n" + strPhone);
	}

}
