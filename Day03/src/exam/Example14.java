package exam;

public class Example14 {
	public static void main(String[] args) {
		// 복합대입연산자
		int x = 10; int y = 1;
		y += x; // y = y + x
		System.out.println(y);
		
		y *= x; // y = y * x
		System.out.println(y);
		
		y %= x; // y = y % x
		System.out.println(y);
	}
}
