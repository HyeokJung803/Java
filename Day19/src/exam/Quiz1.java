package exam;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * Scanner를 이용하여 한 라인을 읽고, 공백으로 분리된
		 * 어절이 몇 개 들어있는지 그만을 입력할 때 까지 반복하는
		 * 프로그램을 작성하세요
		 * 
		 * 입력 >> I love Java
		 * 어절개수 3
		 * 입력 >> 자바는 객체 지향 언어로써 매우 좋은 언어이다
		 * 어절개수 7
		 * 입력 >> 그만
		 * 종료합니다...
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("입력 >> ");
			String ch = sc.nextLine();
			if(ch.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			StringTokenizer st = new StringTokenizer(ch, " ");
			System.out.println("어절 개수는 " + st.countTokens());
							
		}
	}
}
