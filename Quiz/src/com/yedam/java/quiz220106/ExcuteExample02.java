package com.yedam.java.quiz220106;

public class ExcuteExample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제2 다음을 만족하는 클래스 SalaryMan을 작성
		//salary는 월 급여액을 저장. int형으로 초기값 1,000,000을 저장.
		//메서드 getAnnualGross는 연봉을 계산해 반환하는 메서드
		//연봉은 12월치 급여액에 한달 월급액*500%를 더한 값
		//기본 생성자에서 필드 salary의 초기 값을 사용.
		//정수형 매개변수를 가지는 생성자에서 해당 매개변수를 월 급여액으로 저장.
		
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
	}

}
