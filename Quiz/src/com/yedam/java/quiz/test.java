package com.yedam.java.quiz;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		for(x = 1; x < 10; x++) {
			for(y = 1; y <= x; y++) {
				System.out.printf("%d * %d = %2d\t", x, y, x * y);
			}
			System.out.println();
		}
	}
}
