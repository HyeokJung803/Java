package exam;

public class Example05 {
	public static void main(String[] args) {
		/*
		 * 배열을 생성하기 위해서는 new와 함께 자료형의 길이를
		 * 지정한다
		 * 
		 * new 연산자
		 * - new 연산자는 객체를 Heap 영역에 메모리 공간을
		 * 할당해주고 메모리 주소를 변환한 후 생성자를 실행시켜 준다
		 * - new 연산자로 생성된 객체는 똑같은 값을 가졌어도
		 * 서로 다른 메모리를 할당하기 때문에 서로 다른 객체로
		 * 분류됨 !!
		 */
		int arr1[] = new int[4];
		int arr2[] = {10,20,30,40,50};
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
