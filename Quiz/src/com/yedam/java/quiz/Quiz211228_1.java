package com.yedam.java.quiz;

import java.util.Scanner;

public class Quiz211228_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		//129p 문제 9번
		System.out.print("첫 번째 수: ");
		double num1 = scanner.nextDouble();
		System.out.print("두 번째 수: ");
		double num2 = scanner.nextDouble();
		System.out.println("--------------------------------------");
		System.out.print("결과: ");
		if((num2 == 0) || (num2 == 0.0)) {
			System.out.println("무한대");
		} else {
			System.out.println(num1/num2);
		}
		
		//130p 문제 10번
		System.out.println("\n\n--------------------------------------");
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var1 * var1 * (Double.parseDouble(var2 + "." + var3));
		System.out.println("원의 넓이는 " + var4 + "입니다.");
		
		
		//130p 문제 11번
		System.out.print("아이디: ");
		String name = scanner.nextLine();
		System.out.println("");
		System.out.print("패스워드: ");
		String strPasswd = scanner.nextLine();
		int passwd = Integer.parseInt(strPasswd);
		
		if(name.equals("java")) { //아이디 일치여부
			if(passwd == 12345) { //패스워드 일치여부
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패: 패스워드가 틀렸습니다.");
			}
		} else {
		System.out.println("로그인 실패: 존재하지 않는 아이디입니다.");
		}
	}
}
