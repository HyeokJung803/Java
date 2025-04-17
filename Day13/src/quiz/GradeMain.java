package quiz;

import java.util.Scanner;

public class GradeMain {
	public static void main(String[] args) {
		/*
		 * Grade 클래스를 작성하세요
		 * 3과목의 점수를 입력받아 Grade 객체를 생성하고
		 * 성적과 평균을 출력하는 프로그램을 작성하세요
		 * 
		 * 실행예시)
		 * 수학, 과학, 영어 순으로 3개 점수 입력 >> 90 88 96
		 * 평균 91
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("수학, 과학, 영어 순으로 3개 점수 입력 >> ");
		int mat = sc.nextInt();
		int sci = sc.nextInt();
		int eng = sc.nextInt();
		Grade grade = new Grade(mat, sci, eng);
		
		
		System.out.println("평균은 : " + grade.average());
	}
}
