package computer;

public class Samsung extends Computer{
	/*
	 * super 키워드
	 * - 부모의 객체를 가리키는 참조 변수
	 * - 필드명의 중복 또는 메소드 오버라이딩으로 가려진 부모의
	 * 필드 또는 메소드를 호출하기 위해 사용한다
	 */
	void powerOn() {
		super.powerOn();
		System.out.println("아이 러브 삼성");
	}
}
