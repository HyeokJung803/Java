package exam;

class Animal {
	public void sound() {
		System.out.println("동물이 소리를 냅니다.");
	}
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

class Bird extends Animal {
	@Override
	public void sound() {
		System.out.println("짹짹");
	}
}

public class Example02 {
	/*
	 * 다형성(Polymorphism)
	 * - 다형성이란 여러 개를 의미하는 poly와 형태 또는 실체를 의미하는
	 * morphism의 결합어 
	 * - 하나의 객체가 여러가지 형태를 가질 수 있는것 
	 * - 상위클래스의 타입이 참조 변수를 통해서 하위 클래스의 객체를 
	 * 참조할 수 있도록 허용하여 상위 클래스가 동일한 메시지로 
	 * 하위클래스들이 서로 다른 동작을 할 수 있도록 하는것  
	 * 
	 * 다형성의 조건
	 * 1. 상위 클래스와 하위 클래스는 상속관계여야 한다 
	 * 2. 다형성이 보장되기 위해 오버라이딩이 반드시 필요함 !! 
	 */
	public static void main(String[] args) {
		Animal animal1 = new Dog();
		animal1.sound();
		
		Animal animal2 = new Cat();
		animal2.sound();
		
		Animal animal3 = new Bird();
		animal3.sound();
	}
}
