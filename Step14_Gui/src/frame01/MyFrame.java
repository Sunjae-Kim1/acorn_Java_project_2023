package frame01;

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
		// 레이아웃 매니저는 아직 사용 X ( 모든 UI 를 절대 좌표에 배치 )
		this.setLayout(null);
		
		// 버튼 하나를 만들어
		JButton btn1 = new JButton("눌러!");
		// 위치 설정 ( x , y )
		btn1.setLocation(10, 10);
		// 크기 설정 ( width , height )
		btn1.setSize(100, 30);
		// 프레임에 추가하기
		this.add(btn1);
		
		// 프레임을 화면상에 실제 보이기 ( false 시 화면에 안 보인다.)
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		//  MyFrame 객체 생성
		new MyFrame("나의 프레임");
		System.out.println("main 메소드가 종료 되었습니다.");
	}
}