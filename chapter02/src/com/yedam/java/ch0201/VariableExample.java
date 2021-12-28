package com.yedam.java.ch0201;

public class VariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 선언
		int age;
		double value;
		
		//변수 초기화 → 실질적인 메모리 할당
		age = 10;
		
		// int result = age + (int) value;
		
		//변수 사용
		int hour = 5;
		int minute = 18;
		int second = 50;
		System.out.println(hour + "시간 " + minute + "분 " + second + "초");
		int totalSecond = (hour*3600) + (minute*60) + second;
		System.out.println(hour + "시간 " + minute + "분 " + second + "초는 " + totalSecond + "초 입니다");
		
		//변수 복사
		int temp, x, y;
		x = 5;
		y = 10;
		System.out.println("x : " + x + ", y : " + y);
		
		temp = x;
		x = y;
		y = temp;
		System.out.println("x : " + x + ", y : " + y);
		
		//변수의 사용범위
		int n1 = 155;
		if(n1 > 100) {
			int n2 = n1-100;
		}
		int n3 = n1 + /* n2 +*/ 15; // n2는 if안에서만 사용되는 변수이기에 문법 오류 발생.
	}

}
