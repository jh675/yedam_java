package com.yedam.java.quiz;

public class Quiz211228_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문제1) 아래와 같이 각 변수를 초기화하였을 때 각 문제에 맞게 구현하세요.
		int x = 10;
		int y = 10;
		int result;
		
		//1-1) 부호연산자를 이용하여 변수 x의 값을 음수로 출력하세요. 단, 변수 x의 값은 변하지 말아야 한다.
		result = -x;
		System.out.println("문제1-1_x: " + result);
		
		//1-2) 변수 x와 y의 값을 더한 후 y의 값을 증가시키는 연산식을 한줄로 작성하여라.
		result = x + y++;
		System.out.println("문제1-2_result: " +result);
		System.out.println("문제1-2_y: " + y);
		
		//1-3) 변수 x와 y의 값을 더한 값이 20이 되도록 변수 x와 y 중 하나의 변수에 증감연산자를 사용하여 연산식을 한줄로 작성하여라.
		result = --x + y;
		System.out.println("문제1-3_result: "+ result);
		System.out.println("문제1-3_x: "+ x);
		System.out.println("문제1-3_y: "+ y);
		
		//1-4) 변수 x에서 변수 y를 나눈 후 몫과 나머지를 출력하여라.
		result = x/y;
		System.out.println("문제1-4_x/y = " + result);
		
		result = x%y;
		System.out.println("문제1-4_x%y = " + x%y);
	}

}
