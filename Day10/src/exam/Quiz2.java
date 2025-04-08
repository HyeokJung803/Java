package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 길이가 5인 배열을 입력받아 배열안에 모든 값의
		 * 총합과 평균을 구하세요
		 * 
		 * 실행결과)
		 * 50
		 * 24
		 * 30
		 * 22
		 * 21
		 * 총합 : 147 평균 : 29.4
		 */
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int total = 0;
		double avg = 0;
		System.out.println("길이가 5인 배열 입력");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 +"번째 입력");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			total = arr[i] + total;
		}
		avg = (double) total / (double)arr.length;
		System.out.println("총합 : " + total + " 평균 : " + avg );
		
	}
}
