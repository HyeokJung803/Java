package exam;

public class Example07 {
	public static void main(String[] args) {
		/*
		 * 자료형(Data Type)
		 * - 어떤 변수든지 타입(Type)이 있으며, 타입에 따라 
		 * 저장할 수 있는 값의 종류와 범위가 다르다
		 * 
		 * 정수형
		 * - byte,	short, 	int, 	long
		 *  (1byte)	(2byte)	(4byte)	(8byte)
		 *  
		 *  byte : -128 ~ 127
		 *  short : -32786 ~ 32767
		 *  int : -2174783648 ~ 217483647
		 *  long : 
		 * 실수형
		 * - float, double
		 * 
		 * 논리형
		 * - boolean
		 * 
		 */
		byte byte1 = -128;
		System.out.println(byte1);
		byte byte2 = 127; System.out.println(byte2);
		short byte3 = -129; System.out.println(byte3);
		
		/*
		 * 정수형에는 2진수, 8진수, 16진수도 표현이 가능하다
		 * 출력은 전부 10진수로 출력됨
		 */
		byte num1 = 0110;
		short num2 = 0107;
		int num3 = 0x46;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		long num4 = 10000000;
		System.out.println(num4);
		
		long num5 = 100000000000L;
		System.out.println(num5);
	}
}
