package com.yedam.java.quiz220106;

public class Account {
	//필드
	private String name;
	private long balance;
	private int deposit;
	private int withdraw;
	//생성자
	Account(String name) {
		this.name = name;
	}
	
	//메서드
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void deposit(int deposit) {
		this.deposit = deposit;
	}
	
	public void withdraw(int withdraw) {
		this.withdraw = withdraw;
	}

	public long getBalance() {
		return deposit - withdraw;
	}
	
}
