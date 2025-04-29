package exam;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonTest extends JFrame {
	public ButtonTest() {
		// 레이아웃 지정
		this.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("클릭");
		btn1.setBackground(Color.green);
		add(btn1);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("버튼 클릭함");
			}
		});
		
		
		setVisible(true); // 창을 눈에 보이도록 함
		setSize(640, 480); // 창 사이즈
		setLocationRelativeTo(null);
		
		// 창을 끄면 프로그램을 종료하도록 설정
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {
		new ButtonTest();
	}
}
