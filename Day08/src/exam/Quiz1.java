package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 1부터 입력받은 수까지의 합계를 구하세요
		 * 예를 들어 100을 받았다면
		 * 답) 5050
		 * 
		 * 10을 받았다면
		 * 답) 50
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >> ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("총 합계: " + sum);
		
	}
}
