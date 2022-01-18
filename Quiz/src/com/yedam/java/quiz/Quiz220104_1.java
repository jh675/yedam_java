package com.yedam.java.quiz;

import java.util.Scanner;

public class Quiz220104_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[] sell = null;
		int menu = 0;
		
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.상품 수 | 2.가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택>");
			int menuNo = sc.nextInt();
			
			switch(menuNo) {
			case 1: 
				System.out.print("상품 수> ");
				menu = sc.nextInt();
				sell = new int[menu];
				break;
			case 2: 
				for(int i = 0; i < sell.length; i++) {
					System.out.print("sell[" + i + "]> ");
					sell[i] = sc.nextInt();
				}
				break;
			case 3:
				for(int i=0; i<sell.length; i++) {
					System.out.println("sell[" + i +"]: " + sell[i]);
				}
				break;
			case 4: 
				int max = 0; //최고 금액
				int sum = 0;
				for(int i=0; i<sell.length; i++) {
					if(max <= sell[i]) {
						max = sell[i];
					}
					sum += sell[i];
				}
				sum -= max;
				System.out.println("최고 금액: " + max);
				System.out.println("최고 금액을 제외한 상품 금액의 총합: " + sum);
				break;
			case 5: //프로그램을 종료
				run = false; //while문의 run을 false로 변경.
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
	}
}
