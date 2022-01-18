package com.yedam.java.quiz220106;

import java.util.Scanner;

public abstract class Calculator {
	protected int a, b;
	protected abstract int calc(int a, int b);

	protected void input() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 2개를 입력하세요 >> ");
		a = scanner.nextInt();
		b = scanner.nextInt();
	}
	
	public void run() {
		input();
		int res = calc(a, b);
		System.out.println("계산된 값은 " + res);
	}
}