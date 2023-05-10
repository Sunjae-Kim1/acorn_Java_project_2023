package frame09;

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
	JTextField inputMsg , inputMsg2;
	JLabel label2;
	
	public MyFrame(String title) {
		super(title);
		// 초기 위치와 크기
		setBounds(100 , 100 , 500 , 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		// 문자열을 한 줄 입력 가능한 JTextField()
		this.inputMsg = new JTextField(10);
		JButton plusBtn = new JButton("+");
		JButton minusBtn = new JButton("-");
		JButton multiBtn = new JButton("*");
		JButton divideBtn = new JButton("/");
		this.inputMsg2 = new JTextField(10);
		
		// 문자열을 단순히 출력 가능한 JLabel 객체
		JLabel label = new JLabel("=");
		label2 = new JLabel("0");
		
//		// 버튼을 리스너에 등록
//		plusBtn.addActionListener((e)->{
//			Double msg = Double.parseDouble(inputMsg.getText());
//			Double msg2 = Double.parseDouble(inputMsg2.getText());
//			
//			double result = msg + msg2;
//			
//			JOptionPane.showMessageDialog(this, result);
//			label.setText("=" + result);
//		});
//		
//		minusBtn.addActionListener((e)->{
//			Double msg = Double.parseDouble(inputMsg.getText());
//			Double msg2 = Double.parseDouble(inputMsg2.getText());
//			
//			double result = msg - msg2;
//			
//			JOptionPane.showMessageDialog(this, result);
//			label.setText("=" + result);
//		});
//		
//		multiBtn.addActionListener((e)->{
//			Double msg = Double.parseDouble(inputMsg.getText());
//			Double msg2 = Double.parseDouble(inputMsg2.getText());
//			
//			double result = msg * msg2;
//			
//			JOptionPane.showMessageDialog(this, result);
//			label.setText("=" + result);
//		});
//		
//		divideBtn.addActionListener((e)->{
//			Double msg = Double.parseDouble(inputMsg.getText());
//			Double msg2 = Double.parseDouble(inputMsg2.getText());
//			
//			double result = msg / msg2;
//			
//			JOptionPane.showMessageDialog(this, result);
//			label.setText("=" + result);
//		});
		
		// 프레임에 UI 추가
		add(inputMsg); // JTextField
		add(plusBtn); // JButton
		add(minusBtn); // JButton
		add(multiBtn); // JButton
		add(divideBtn); // JButton
		add(inputMsg2); // JTextField
		add(label); // JLabel
		add(label2); // JLabel
		
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		multiBtn.addActionListener(this);
		divideBtn.addActionListener(this);
		
		plusBtn.setActionCommand("plus");
		minusBtn.setActionCommand("minus");
		multiBtn.setActionCommand("multi");
		divideBtn.setActionCommand("divide");
		
		// UI 를 배치 후 호출이 원칙
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame("계산기");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// 입력한 문자열 읽어오기
		String str = inputMsg.getText();
		String str2 = inputMsg2.getText();
		
		try {
		
			// 입력한 문자열을 실수로 변경
			double num = Double.parseDouble(str);
			double num2 = Double.parseDouble(str2);
			
			// 눌러진 버튼의 command 읽기
			String cmd = e.getActionCommand();
			
			double result = 0;
		
			// command 판별
			if(cmd.equals("plus")) {
				result = num + num2;
			}else if(cmd.equals("minus")) {
				result = num - num2;
			}else if(cmd.equals("multi")) {
				result = num * num2;
			}else if(cmd.equals("divide")) {
				if(num2 == 0) {
					JOptionPane.showMessageDialog(this , "어떤 수를 0 으로 나눌 수 없습니다.");
					// 메소드를 여기서 종료
					return;
				}
				result = num / num2;
			}
			// 결과값을 JLabel 에 출력
			String resultText = Double.toString(result);
			label2.setText(resultText);
		}catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(this , "숫자를 입력해주세요!");
			}
	}
}