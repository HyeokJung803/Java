package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 아이디와 비밀번호를 입력받아
		 * 아이디가 admin (문자열)
		 * 비밀번호가 1234 (문자열)
		 * 로 입력받으면 로그인 성공
		 * 만약 아이디를 잘못입력받았다면
		 * "아이디를 잘못입력하였습니다" 를 출력
		 * 
		 * 만약 비밀번호를 잘못입력받았다면
		 * "비밀번호를 잘못입력하였습니다"를 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력 >>");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력 >>");
		String pw = sc.nextLine();
		
		if (id.equals("admin") && pw.equals("1234")) {
			System.out.println("로그인 성공");
		} else if(!id.equals("admin")) {
			System.out.println("아이디를 잘못입력하였습니다");
		} else if(!pw.equals("1234")) {
			System.out.println("비밀번호를 잘못입력하였습니다");
		}
		
	}
}
