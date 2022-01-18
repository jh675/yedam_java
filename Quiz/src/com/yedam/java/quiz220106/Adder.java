package com.yedam.java.quiz220106;

public class Adder extends Calculator {

	@Override
	protected int calc(int a, int b) {
		this.a = a;
		this.b = b;
		return a+b;
	}

}
