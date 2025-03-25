package exam;


public class Example03 {
	public static void main(String[] args) {
		/*
		 * equals()
		 * - 두 개의 문자열이 동일한지 동일하지 않은지 판단
		 * - 모든 객체의 부모클래스인 Object 클래스에 정의되어
		 * 있는 메소드
		 */
		String str1 = "Hello";
		String str2 = "World";
		String str3 = "Hello";
		
		// str1문자열과 str2문자열이 같은지 비교
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 같습니다.");
		} else if (str1.equals(str3)) {
			// str1문자열과 str3문자열이 같은지 비교
			System.out.println("str1과 str3는 같습니다.");
		}
	}
}
