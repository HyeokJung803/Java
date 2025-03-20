package exam;

import java.util.Scanner;

public class Example06 {
	public static void main(String[] args) {
		/*
		 * next()
		 * - 공백을 기준으로 단어 하나를 읽어들임 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열입력 >>");
		String str = sc.next();
		System.out.println(str);
	}
}
