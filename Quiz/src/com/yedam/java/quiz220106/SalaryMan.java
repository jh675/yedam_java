package com.yedam.java.quiz220106;

public class SalaryMan {
	//필드
	private int salary;			//급여액
	private int AnnualGross;	//연봉
	//생성자
	SalaryMan() {
		salary = 1000000;
	}

	SalaryMan(int salary) {
		this.salary = salary;
	}
	
	//메서드
	public int getAnnualGross() {
		int salarys = 0;
		salarys = 12 * salary + salary *5; 
		return salarys;
	}
}
