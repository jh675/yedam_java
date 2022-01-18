package com.yedam.java.quiz220106;

public class ExcuteExample04 {
	public static void main(String[] args) {
		//필드 예금주, 잔액
		//생성자로 예금주 저장
		//메서드는 각 필드별 get/set, 메서드 deposit는 외부에서 매개변수로 받은 값을 저축, withdraw는 외부에서 매개변수로 받은 값을 인출
		
		Account account = new Account("신용권");
		account.deposit(10000);
		account.withdraw(4800);
		System.out.println("예금주: " + account.getName() + "\n잔액: " + account.getBalance());
	}
}
