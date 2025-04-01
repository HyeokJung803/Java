package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 월을 입력받아 해당 월의 계절을 출력하는 프로그램을 작성
		 * 12, 1, 2 : 겨울
		 * 3, 4, 5 : 봄
		 * 6, 7, 8 : 여름
		 * 9, 10 , 11 : 가을
		 */
		/* (내가 한거)
		 * Scanner sc = new Scanner(System.in);
		System.out.println("월 입력 >>");
		int month = sc.nextInt();
		if (month == 12 || month == 1 || month == 2) {
			System.out.println("겨울");
		} else if (month == 3 || month == 4 || month == 5) {
			System.out.println("봄");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.println("여름");
		} else if (month == 9 || month == 10 || month == 11) {
			System.out.println("가을");
		} else {
			System.out.println("월 잘못 입력");
		}
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		int month = sc.nextInt();
		
		switch(month) {
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("잘못입력");
			break;
		
		}
			
	}
}
