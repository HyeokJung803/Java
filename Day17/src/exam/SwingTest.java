package exam;

import javax.swing.JFrame;

public class SwingTest extends JFrame {
	/*
	 * GUI 응용프로그램
	 * - Graphical User InterFace의 약자로 이미 혹은 그래픽을
	 * 이용하여 메뉴등을 포함하는 화면을 구성하고, 키보드와 마우스 등의
	 * 편리한 입력 도구를 사용하여 입력을 편리하게 사용할 수 있도록 작성하는 인터페이스
	 * - 자바는 AWT와 SWING 패키지를 제동하여 GUI를 쉽게 구성하도록
	 * 해줌
	 * JFrame이란?
	 * - 기본적으로 창을 띄울 때 사용하는 클래스 
	 */
	public SwingTest() {
		setVisible(true); // 창을 눈에 보이도록 함
		setSize(640, 480); // 창 사이즈
		setLocationRelativeTo(null);
		
		// 창을 끄면 프로그램을 종료하도록 설정
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new SwingTest();
	}
}
