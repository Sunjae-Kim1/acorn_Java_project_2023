package frame02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	// 생성자
	public MyFrame(String title) {
		super(title);
		
		// setBounds( x , y , width , height ) 창의 위치와 크기
		this.setBounds(100 , 100 , 500 , 500);
		// 이 프레임 ( MyFrame ) 의 x 버튼 ( close 버튼 ) 을 눌렀을 때 프로세스도 같이 종료 되도록 설정 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// FlowLayout 매니저 사용하기
		setLayout(new FlowLayout(FlowLayout.LEFT)); // FlowLayout.LEFT -> (버튼) 왼쪽 정렬
		
		JButton btn1 = new JButton("버튼1");
		add(btn1); // 프레임에 버튼 추가
		
		JButton btn2 = new JButton("버튼2");
		add(btn2); // 프레임에 버튼 추가
		
		JButton btn3 = new JButton("버튼3");
		add(btn3); // 프레임에 버튼 추가
		
		// 프레임을 화면상에 실제 보이기 ( false 시 화면에 안 보인다.)
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		//  MyFrame 객체 생성
		new MyFrame("나의 프레임");
		System.out.println("main 메소드가 종료 되었습니다.");
	}
}