package exam;

public class CarMain {
	public static void main(String[] args) {
		/*
		 *  도트 연산자라?(.)
		 *  - 해당 인스턴스의 변수 혹은 메소드에 접근하기 위한것!!
		 *  
		 */
		Car car1 = new Car();
		car1.carName = "K5";
		car1.speed = 140;
		
		System.out.println("carName : " + car1.carName);
		System.out.println("speed : " + car1.speed);
		
		Car car2 = new Car();
		car2.carName = "소나타";
		car2.speed = 120;
		System.out.println("carName : " + car2.carName);
		System.out.println("speed : " + car2.speed);

	}
}
