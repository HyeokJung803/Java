package exam;

import java.util.Scanner;

class Man {
	public String name;
	public String address;
	public int a;
	public int b;
	
	// 메소드의 반환 타입이 없다면 void로 선언
	public void myInfo() {
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
	}
	
	// return 
	// 메소드를 호출할 때 매개변수를 전달해 준 것처럼 필요에 따라
	// 메소드의 실행 결과값을 호출한 쪽으로 돌려줌 !!
	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public int mul(int a, int b) {
		return a * b;
	}
	
	public int div(int a, int b) {
		return a / b;
	}
	
}

public class Example03 {
	public static void main(String[] args) {
		/*
		 * 매개변수와 return
		 * 
		 * 매개변수 
		 * - 특정 기능을 수행하기 위한 메소드는 기능을 수행할 때
		 * 사용할 수 있는 인수를 받을 수 있다
		 * - 매개변수는 개수에 제한이 없다
		 * - 2개 이상의 매개변수를 정의할 때는 콤마를 이용해서
		 * 나열한다 !!
		 */
		Scanner sc = new Scanner(System.in);
		Man man = new Man();
		System.out.println("이름입력 >> ");
		man.name = sc.nextLine();
		System.out.println("주소입력 >> ");
		man.address = sc.nextLine();
		System.out.println("숫자입력 >> ");
		int a = sc.nextInt();
		System.out.println("숫자입력 >> ");
		int b = sc.nextInt();
		
		man.myInfo();
		System.out.println(man.add(a, b));
		System.out.println(man.sub(a, b));
		System.out.println(man.mul(a, b));
		System.out.println(man.div(a, b));
	}
}
