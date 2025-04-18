package book;

public class BookMain {
	public static void main(String[] args) {
		/*
		 * Comic 클래스에서 구현하지 않은 멤버와 메소드지만
		 * 부모클래스인 Book 클래스를 상속받았기에 Book 클래스에
		 * 있는 요소들을 사용할 수 있다
		 */
		Comic comicBook = new Comic();
		comicBook.title = "포켓몬";
		comicBook.price = 4500;
		comicBook.info();
	}
}
