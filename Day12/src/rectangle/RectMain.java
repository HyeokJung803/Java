package rectangle;

import java.util.Scanner;

public class RectMain {
	public static void main(String[] args) {
		/*
		 * Rectangle 클래스를 생성하여 가로와 세로를 필드로
		 * 선언하고 사각형의 넓이를 구하세요
		 * 넓이를 구하는 메소드로 선언해 주세요 !!
		 * 넓이 구하는 메소드는 매개변수는 없고 return 만 있음
		 * 
		 * 가로 입력 >> 10
		 * 세로 입력 >> 20
		 * 사각형의 면적은 : 200
		 */
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		
		System.out.print("가로 입력 >> ");
		rect.width = sc.nextInt();
		System.out.print("세로 입력 >> ");
		rect.height = sc.nextInt();
		System.out.println("사각형의 면적은 : " + rect.getArea());
		
		
	}
}
