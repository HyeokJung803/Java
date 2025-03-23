package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 정수를 입력받아 입력받은 수가 짝수인지 홀수인지
		 * 판단하는 프로그램을 삼항연산자를 사용하여
		 * 구현하세요
		 * 
		 * 입력 >> 20
		 * 출력 : 짝수입니다
		 * 
		 * 입력 >> 15
		 * 출력 : 홀수입니다
		 */
		System.out.println("입력 >>");
		int num = sc.nextInt();
		String result = (num % 2 == 0) ? "짝수입니다" : "홀수입니다";
		System.out.println(result);
	}
}
