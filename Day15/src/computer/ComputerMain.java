package computer;

public class ComputerMain {
	public static void main(String[] args) {
		Samsung s = new Samsung();
		// Samsung 클래스에서 재정의한(오버라이딩)된 메소드가 호출
		s.powerOn();
		s.powerOff();
		
		System.out.println();
		Computer c = new Computer();
		c.powerOn();
		c.powerOff();
	}
}
