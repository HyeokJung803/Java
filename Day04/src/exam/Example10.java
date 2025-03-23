package exam;

import java.util.Scanner;

public class Example10 {
	public static void main(String[] args) {
		/*
		 * if ~ else if
		 * 
		 * 형식)
		 * if(조건식) {
		 * 		실행문...
		 * } else if(조건식) {
		 * 		실행문...
		 * } else {
		 * 		실행문...
		 * }
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴선택 >>");
		
		int menu = sc.nextInt();
		if(menu == 1) {
			System.out.println("커피");	
		} else if(menu == 2) {
			System.out.println("콜라");
		} else if(menu == 3) {
			System.out.println("사이다");
		} else {
			System.out.println("잘못입력하였습니다");
		}
	}
}
