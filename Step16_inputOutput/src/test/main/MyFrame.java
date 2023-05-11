package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	
	JTextField text;
	File f = new File("c:/acorn202304/myFolder/diary.txt");
	
	public MyFrame(String title) {
		super(title);
	    setBounds(100, 100, 500, 500);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new FlowLayout());
	    
	    text = new JTextField(15);
	    JButton sendBtn = new JButton("기록");
	    sendBtn.addActionListener(this);
	    
	    add(text);
	    add(sendBtn);
	    
	    setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = text.getText();
		try {
			if(!f.exists()) {
				f.createNewFile();
			}
			FileWriter fw = new FileWriter(f , true);
			fw.write(str + "\r\n");
			fw.flush();
			fw.close();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
		System.out.println("실행합니다.");
	}
}