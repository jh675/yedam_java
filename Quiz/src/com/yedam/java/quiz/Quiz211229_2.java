package com.yedam.java.quiz;

import java.util.Scanner;


public class Quiz211229_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		System.out.println("------------문제1------------");
		for(int i=0; i<6; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("------------문제2------------");
		int count = 0;
		for(int i = 0; i <= 100; i++) {
			if(i%2 == 0) {
				continue;
			}
			
			count++;
		}
		System.out.println(count);
		
		System.out.println("------------문제3------------");
		Outter: for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				if((4*x) + (5*y) == 60) {
					System.out.println(x + ", " + y);
					break Outter;
				}
			}
		}
		System.out.println("------------문제4------------");
		int num;
		do {
			num = (int)(Math.random() * 10) + 1;
			System.out.println(num);
		} while(num != 7);
		
		System.out.println("------------문제5------------");
		int x = 0;
		int y = 0;
		count = 0;
		while(x+y != 5) {
			x = (int)(Math.random() * 6) + 1;
			y = (int)(Math.random() * 6) + 1;
			System.out.println("(" + x + ", " + y + ")");
			count++;
		}
		System.out.println(count);
		
		System.out.println("------------문제7------------");
		boolean run = true;
		int balance = 0;
		int menuNumber;

		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			menuNumber = scanner.nextInt();
			
			switch(menuNumber) {
			case 1: //예금
				System.out.print("예금액> ");
				balance += scanner.nextInt();
				break;
			case 2: //출금
				System.out.print("출금액> ");
				balance -= scanner.nextInt();
				break;
			case 3: //잔고
				System.out.println("잔고> " + balance);
				break;
			case 4: //프로그램 종료
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
