package exam;

import java.util.Scanner;

class Calculator {
	private int val1;
	private int val2;
	
	public Calculator(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}

	public int getVal1() {
		return val1;
	}

	public void setVal1(int val1) {
		this.val1 = val1;
	}

	public int getVal2() {
		return val2;
	}

	public void setVal2(int val2) {
		this.val2 = val2;
	}
	
	class Calc {
		public int add() {
			return getVal1() + getVal2();
		}
	}
}

public class Example03 {
	public static void main(String[] args) {
		/*
		 * 인스턴스 클래스
		 * - 인스턴스 클래스는 기본적인 내부 클래스
		 * - 외부 클래스 안에 생성되기 때문에 클래스를 사용하려면
		 * 외부 클래스 객체가 생성된 상태에서 객체를 생성할 수 있다
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int num1 = sc.nextInt();
		System.out.println("숫자입력 >> ");
		int num2 = sc.nextInt();
		
		Calculator cal = new Calculator(num1, num2);
		// 외부 클래스를 이용해 내부클래스 객체 생성 !!
		Calculator.Calc c = cal.new Calc();
		System.out.println("입력받은 두 수의 합 : " + c.add());
	}
}
