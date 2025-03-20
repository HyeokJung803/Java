package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 자신의 나이, 이름, 학교, 거주지를 입력받아 출력하는 프로그램을 작성하세요
		 * 
		 * 출력결과)
		 * 저의 나이는 31살이고 이름은 윤준형, 학교는
		 * 코리아대학 이며, 부산시 수영구 광안동에 살고 있습니다.
		 * 
		 * 출력결과는 콘솔창에 한줄로 출력하도록
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력 >>");
		int age = sc.nextInt();

		System.out.println("이름을 입력 >>");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("학교을 입력 >>");
		String school = sc.nextLine();
		
		System.out.println("거주지을 입력 >>");
		String address = sc.nextLine();
		
		System.out.println("저의 나이는 " + age + "살이고 이름은 " + name + 
				", 학교는 " + school +"이며, " + address + "에 살고 있습니다" );
		
		sc.close(); //프로그래밍 관례 "열었으면 닫아라"
	}
}
