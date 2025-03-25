package exam;

import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		String s1 = sc.nextLine();
		
		if (s1 == "apple") {
			System.out.println("같음");
		} else if (s1 != "apple") {
			System.out.println("같지않음");
		}
		
		String str1 = new String("APP");
		String str2 = new String("APP");
		if(str1 == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		/*
		 * == : 객체가 같은지를 비교하지만 객체가 갖고 있는
		 * 문자열을 비교하지 않는다
		 * equals() : 문자열 값 그 자체를 비교함 (대소문자, 공백등)
		 */
	}
}
