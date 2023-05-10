package frame08;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	
	// 필드
	JTextField inputMsg;
	JLabel label;
	
	public MyFrame(String title) {
		super(title);
		// 초기 위치와 크기
		setBounds(100 , 100 , 500 , 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		// 문자열을 한 줄 입력 가능한 JTextField()
		this.inputMsg = new JTextField(10);
		JButton sendBtn = new JButton("전송");
		JButton sendBtn2 = new JButton("전송2");
		// 문자열을 단순히 출력 가능한 JLabel 객체
		label = new JLabel("1000");
		
		// 버튼을 리스너에 등록
		sendBtn.addActionListener(this);
		
		sendBtn2.addActionListener((e)->{
			String msg = inputMsg.getText();
			JOptionPane.showMessageDialog(this, msg);
			label.setText(msg);
		});
		
		// 프레임에 UI 추가
		add(inputMsg); // JTextField
		add(sendBtn); // JButton
		add(sendBtn2); // JButton
		add(label); // JLabel
		
		// UI 를 배치 후 호출이 원칙
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// JTextField 에 입력한 문자열 가져오기
		String msg = inputMsg.getText();
		// 읽은 문자열 아림창에 띄우기
		JOptionPane.showMessageDialog(this , msg);
		// 읽은 문자열을 JLabel 에 출력
		label.setText(msg);
	}
}