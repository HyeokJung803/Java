package exam;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 국어점수 85점
		 * 수학점수 85점
		 * 영어점수 75점
		 * 국사점수 88점
		 * 네 과목의 합계(정수와) 평균(실수)를 출력하세요
		 */
		int korean = 85; int math = 85;
		int english = 75; int history = 88;
		int total = korean + math + english + history;
		double average = (double) total / 4;
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + average);
	}
}
