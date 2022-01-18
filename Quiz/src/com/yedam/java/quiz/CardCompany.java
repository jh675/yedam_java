package com.yedam.java.quiz;

public class CardCompany {
	private static CardCompany instance = new CardCompany();
	
	private CardCompany() {}
	
	public static CardCompany getInstance() {
		return instance;
	}
	
	public Card createCard() {
		return new Card();
	}
}