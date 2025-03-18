package exam;

public class Example05 {
	public static void main(String[] args) {
		int myAge = 20;
		// yourAge에 myAge 에 저장되어 있는 값을 대입
		int yourAge = myAge; 
		System.out.println(myAge);
		System.out.println(yourAge);
		
		System.out.println("==============");
		
		int x = 10;
		int y = 20;
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		int temp = 0; // x의 값을 임시저장할 변수
		temp = x; // temp에 x의 값을 넣음
		x = y; // y의 값을 x에 대입
		y = temp; // y에 temp의 값을 넣음
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}
