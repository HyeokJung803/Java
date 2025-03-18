package exam;

public class Example02 {
	public static void main(String[] args) {
		// 실수 표현
		double a = 1.1;
		System.out.printf("%f\n", a);
		
		System.out.printf("%.1f\n", 3.141592);
		System.out.printf("%.2f\n", 3.141592);
		System.out.println();
		System.out.printf("%.3f\n", 3.141592);
		
		// 문자열 (문자열은 쌍 따옴표)
		String str = "Hellow Java";
		System.out.printf("%s\n", str);
		
		// 문자 출력 (문자는 따옴표)
		char c = 'A';
		System.out.printf("%c", c);
		
	}
}
