package com.yedam.java.quiz220106;

import java.util.Scanner;

public class ExcuteExample01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		//	출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		Product[] list = null;
		@SuppressWarnings("unused")
		int menu = 0;
		int productNum = 0;
		
		while(run) {
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택>");
			int menuNo = sc.nextInt();
			
			switch(menuNo) {
			case 1:
				System.out.print("상품 수>");
				productNum = sc.nextInt(); 
				list = new Product[productNum];
				break;
			case 2:
				for(int i = 0; i<list.length; i++) {
					System.out.print("상품명>");
					String name = sc.next();
					System.out.print("가격>");
					int price = sc.nextInt();
					
					Product product = new Product(name, price);
					list[i] = product;
				}
				break;
			case 3:
				for(int i = 0; i < list.length; i++) {
					System.out.println(list[i].getName() + ": " + list[i].getPrice());
				}
				break;
			case 4: 
				int max = 0; //최고 금액
				int sum = 0;
				for(int i=0; i<list.length; i++) {
					if(max <= list[i].getPrice()) {
						max = list[i].getPrice();
					}
					sum += list[i].getPrice();
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
