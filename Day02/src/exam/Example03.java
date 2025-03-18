package exam;

public class Example03 {

	public static void main(String[] args) {
		/*
		 * 변수(Variable)
		 * -변수란 어떠한 값을 저장하고자 할 때 사용하는
		 * 메모리 공간
		 * -변수는 생성하느 즉시 어떠한 값을 넣어줘야 한다
		 * (변수의 초기화)
		 * -변수에는 다향한 자료형을 담을 수 있다(숫자,문자,문자열 등)
		 * 
		 * [타입] [변수명] = [저장할 값]
		 * 변수명 생성 규칙
		 * - 영문 문자와 숫자를 사용할 수 있다
		 * - 변수는 대소문자를 구분한다
		 * - 변수명 길이에는 제한이 없다
		 * - 예약어는 사용할 수 없다(if, else, else if 등)
		 * - 첫 번째 글자는 숫자로 시작할 수 없고 문자는 $, _ 이어야 한다
		 * - 변수의 의미를 쉽게 파악할 수 있도록 구체적으로 명명해주는게 좋다
		 * 
		 * 변수명 표기법
		 * - 카멜표기법, 파스칼 표기법, 헝가리안 표기법, 팟홀 표기법
		 * 카멜 표기법(Camel Case)
		 * 예) String carNumberName
		 * - 각 단어의 첫문자를 대문자를 표기하고 맨 처음 문자는 소문자로 표기
		 * 
		 * 파스칼 표기법(Pascal Case)
		 * String CarNumberName
		 * - 각 단어의 첫 문자를 대문자로 표기하고 맨 처음 문자도 대문자로 표기
		 * 
		 * 헝가리안 표기법
		 * - 변수명 앞에 데이터타입을 표기
		 * 
		 * 팟홀 표기법
		 * String car_number_name
		 * - 단어 사이에 언더바를 넣어서 변수명을 작성하는 방법
		 */
		int a = 10;
		System.out.println(a);
		
		int a1 = 10;
		int A = 10; System.out.println(A);
		int $a = 200; int _a = 300; int %d = 20;
		
	}

}
