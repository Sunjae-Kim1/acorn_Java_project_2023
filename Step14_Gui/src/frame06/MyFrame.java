package frame06;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	// 필드
	JButton sendBtn , deleteBtn , updateBtn;
	
	// 생성자
	public MyFrame(String title) {
		super(title);
		
		// setBounds( x , y , width , height ) 창의 위치와 크기
		this.setBounds(100 , 100 , 500 , 500);
		// 이 프레임 ( MyFrame ) 의 x 버튼 ( close 버튼 ) 을 눌렀을 때 프로세스도 같이 종료 되도록 설정 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		// 전송 버튼의 참조값을 필드에 저장 ( this. 생략 가능 )
		this.sendBtn = new JButton("전송");
		add(sendBtn);
		
		this.deleteBtn = new JButton("삭제");
		add(deleteBtn);
		
		this.updateBtn = new JButton("수정");
		add(updateBtn);
		// 전송 , 삭제 , 수정 버튼 전부 하나의 리스너로 등록
		sendBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		
		// 프레임을 화면상에 실제 보이기 ( false 시 화면에 안 보인다.)
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		//  MyFrame 객체 생성
		new MyFrame("나의 프레임");
		System.out.println("main 메소드가 종료 되었습니다.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("어떤 버튼을 눌렀을까요?");
		// 메소드의 매개변수로 전달되는 ActionListener 객체에 이벤트에 대한 정보가 있다.
		// 이 객체를 활용하면 어떤 버튼이 눌러졌는지 판별 가능
		// e.getSource() // 눌러진 버튼의 참조값이 Object 타입으로 리턴
		
		// 눌러진 버튼의 참조값 부르기
		Object which = e.getSource();
		if(which == sendBtn) {
			// 전송 버튼을 누름
			JOptionPane.showMessageDialog(this, "전송했습니다.");
		}
		else if(which == deleteBtn) {
			// 전송 버튼을 누름
			JOptionPane.showMessageDialog(this, "삭제했습니다.");
		}
		else if(which == updateBtn) {
			// 전송 버튼을 누름
			JOptionPane.showMessageDialog(this, "수정했습니다.");
		}
	}
}