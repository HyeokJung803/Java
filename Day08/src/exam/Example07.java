package exam;

public class Example07 {
	public static void main(String[] args) {
		/*
		 * 난수생성 => Math.random()
		 */
		/*
		 * 랜덤함수는 기본형이 double 이기에 int 타입으로 변환하여야함
		 * 그리고 1부터 값을 뽑고 싶다면 0부터 나오기에
		 * 뒤에 +1를 해줘야 한다
		 */
		System.out.println((int) (Math.random() * 10) + 1);
		
	}
}
