package com.yedam.java.quiz;

public class Quiz211227_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Quiz
		int a = 10, b = 50, c = 90;
		//변수 a, b, c에 저장된 값을 각각 50, 90, 10으로 바꾸기.
		int temp;
		temp = a; //temp = 10
		a = b; // a = 50, temp = 10
		b = c; // b = 90, a =50, temp = 10;
		c = temp;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}

}
