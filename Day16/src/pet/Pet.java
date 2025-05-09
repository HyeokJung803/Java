package pet;

abstract public class Pet { // 추상클래스
	abstract public void walk(); // 추상메소드
	abstract public void eat();
	
	public int health;
	
	public void run() {
		System.out.println("run");
	}
	
}
