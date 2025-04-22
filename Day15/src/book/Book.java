package book;

/*
 * 클래스에 final이 붙으면 그 클래스는 상속이 불가능함
 */
public class Book {
	// final 필드로 선언을 하면 그 필드는 수정이 불가능 하다 !!
	final public String title;
	public String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	/*
	 * final 메소드는 오버라이딩을 금지할 때 사용한다
	 * 자식클래스에서 자기 마음대로 변경하지 못하도록 할 때
	 */
	final void info_tilte() {
		System.out.println("책의 제목은 " + title + "입니다.");
	}
	void info_author() {
		System.out.println("책의 저자는 " + author + "입니다");
	}
}
