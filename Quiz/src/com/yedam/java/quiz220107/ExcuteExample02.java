package com.yedam.java.quiz220107;

import java.util.*;

import com.yedam.java.quiz220106.Product;

public class ExcuteExample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		//	출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		List<Product> list = new ArrayList<>();
		
		while(run) {
			System.out.println("1.상품 및 가격입력 | 2.제품별 가격 | 3.분석 | 4.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택>");
			int menuNo = sc.nextInt();
			
			switch(menuNo) {
			case 1:
					System.out.print("상품명>");
					String name = sc.next();
					System.out.print("가격>");
					int price = sc.nextInt();
					
					list.add(new Product(name, price));
				break;
			case 2:
				for(int i = 0; i < list.size(); i++) {
					Product product = list.get(i);
					System.out.println(product.getName() + ": " + product.getPrice());
				}
				break;
			case 3: 
				int max = 0; //최고 금액
				int sum = 0;
				for(int i=0; i<list.size(); i++) {
					Product product = list.get(i);
					if(max <= product.getPrice()) {
						max = product.getPrice();
					}
					sum += product.getPrice();
				}
				sum -= max;
				System.out.println("최고 금액: " + max);
				System.out.println("최고 금액을 제외한 상품 금액의 총합: " + sum);
				break;
			case 4: //프로그램을 종료
				run = false; //while문의 run을 false로 변경.
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
	}
}
