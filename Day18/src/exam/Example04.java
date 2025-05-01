package exam;

public class Example04 {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "hello";
		String str3 = new String("hello");
		
		//각 문자열 변수가 있는 위치값을 출력
		System.out.println("str1 hashcode : "
				+ System.identityHashCode(str1));
		System.out.println("str2 hashcode : "
				+ System.identityHashCode(str2));
		System.out.println("str3 hashcode : "
				+ System.identityHashCode(str3));
	}
}
