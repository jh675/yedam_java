package com.yedam.java.quiz;

import java.util.Scanner;

public class Quiz211229_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제1) 두 개의 정수가 주어졌을 때 두 정수의 합이 자연수이면 'Natural Number'을 출력하도록 하세요.
		int result, x, y;
		x = 10;
		y = 6;
		result = x + y;
		if(result >= 0) {
			System.out.println("Natural Number");
		}

		// 문제2) 두 개의 정수가 주어졌을 때 두 수의 대소관계에 따라 부등호( > or = or < )를 출력하도록 하세요.
		if ( x > y ) {
			System.out.println("x > y");
		} else if( x == y ) {
			System.out.println("x = y");
		} else {
			System.out.println(" x < y ");
		}
		
		/* 문제3) 체질량 지수인 BMI에 따라 비만도를 네가지 단계로 구분하여 결과값을 출력하도록 하세요.
		   BMI = 체중 / ( 키 * 키 )
		   저체중(18.5미만), 정상(18.5 이상 25미만), 과체중(25이상 30미만), 비만(30이상) */
		
		double weight, height, bmi;
		weight = 80;
		height = 1.78;
		bmi = weight / (height * height);
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if(bmi < 25) {
			System.out.println("정상");
		} else if(bmi < 30) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}
		
		/* 문제4) 선택한 단의 6번째 값을 출력하도록 하세요.
		   예를 들어, 2단일 경우 2 X 6 = 12 
		   단, 출력문에 변수를 사용하지 않는다.
		 */
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int z;
		System.out.print("단을 입력해주세요: ");
		z = scan.nextInt();
		switch(z) {
			case 1:
				System.out.println("1x6 = 6");
				break;
			case 2:
				System.out.println("2x6 = 12");
				break;
			case 3:
				System.out.println("3x6 = 18");
				break;
			case 4:
				System.out.println("4x6 = 24");
				break;
			case 5:
				System.out.println("5x6 = 30");
				break;
			case 6:
				System.out.println("6x6 =36");
				break;
			case 7:
				System.out.println("7x6 = 42");
				break;
			case 8:
				System.out.println("8x6 = 48");
				break;
			default:
				System.out.println("9x6 = 54");
		}
		


		/* 문제5) 다음과 같이 점수 범위에 따라 등급을 구분하여 해당 점수에 대한 등급을 출력하도록 하세요.
		   90점 이상 100점 이하 : A 등급,
		   80점 이상 90점미만 : B 등급,
		   70점 이상 80점미만 : C 등급,
		   60점 이상 70점미만 : D 등급,
		   60점미만 : E등급
		 */
		
		int score;
		System.out.print("점수를 입력해주세요: ");
		score = scan.nextInt();
		
		switch(score/10) {
			case 10:
 			case 9:
 				System.out.println("A등급");
 				break;
 			case 8:
 				System.out.println("B등급");
 				break;
 			case 7:
 				System.out.println("C등급");
 				break;
 			case 6:
 				System.out.println("D등급");
 				break;
 			default:
 				System.out.println("E등급");
 				break;
		}
	}

}
