package com.yedam.java.quiz;

public class Card {
	private static int serialNum = 1000;
	private int cardNo;
	
	public Card() {
		serialNum++;
		this.cardNo = serialNum;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Card.serialNum = serialNum;
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

}
