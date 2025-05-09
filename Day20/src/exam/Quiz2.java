package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 문자열을 입력받아 문자열에 포함되어 있는 소문자, 대문자, 숫자
		 * 공백의 개수를 구하는 프로그램을 작성하세요
		 * 각 문자열은 알파벳 소문자, 대문자, 숫자, 공백으로만 이뤄져 있다
		 * 
		 * 첫째 줄부터 N번째 줄까지 문자열이 주어진다
		 * 단) 문자열의 길이는 100을 넘지 않는다 만약 넘으면
		 * "문자열의 길이를 초과하였습니다" 출력
		 * 
		 * 입력 >> This is String
		 * 소문자: 10
		 * 대문자 : 2
		 * 숫자 : 0
		 * 공백 : 2
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >> ");
		String str = sc.nextLine();
		
		int lower_count = 0; // 소문자
		int upper_count = 0; // 대문자
		int number_count = 0; // 숫자
		int null_count = 0; // 공백
		
		if(str.length() > 100) {
			System.out.println("문자열의 길이를 초과하였습니다.");
		} else {
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
					upper_count = upper_count + 1;
				} else if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
					lower_count = lower_count + 1;
				} else if(str.charAt(i) == ' ') {
					null_count = null_count + 1;
				} else if('0' <= str.charAt(i) && str.charAt(i) <= '9') {
					number_count = number_count + 1;
				}
			}
			System.out.println("소문자 : " + lower_count);
			System.out.println("대문자 : " + upper_count);
			System.out.println("숫자 : " + number_count);
			System.out.println("공자 : " + null_count);

			
		}

	}
}
