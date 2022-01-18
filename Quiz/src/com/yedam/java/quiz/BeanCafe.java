package com.yedam.java.quiz;

public class BeanCafe {

	private String cafeName;
	private int money;
	
	public BeanCafe(String cafeName) { 
		this.cafeName = cafeName;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void ShowInfo() {
		System.out.printf("%s 손님의 수입은 %d", cafeName, money);
	}
}
