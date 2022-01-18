package com.yedam.java.quiz220106;

public class ExcuteExample03 {
	public static void main(String[] args) {
		//필드 학생이름. 학급, 국어/영어/수학 점수
		//기본생성자x
		//생성자를 통해 학생이름과 학급 저장
		//메서드는 각 필드별 get/set, 메서드 gettotal은 모든과목의 총합점수., getavg는 모든 과목의 평균점수.
		
		StudentScores studentHong = new StudentScores("홍길동", 1);
		studentHong.setKorean(100);
		studentHong.setEnglish(60);
		studentHong.setMath(76);
		
		System.out.println("학생: " + studentHong.getName() + "\n총 점수: " + studentHong.getTotal() + "\n평균점수: " + studentHong.getAvg());
	}
}
