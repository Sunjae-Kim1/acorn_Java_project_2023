package frame00;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	
	public MyFrame(String title) {
		super(title);
	    setBounds(100, 100, 500, 500);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new BorderLayout());
	    
	    JPanel p1 = new JPanel();
	    
	    JTextField text = new JTextField(20);
	    JButton sendBtn = new JButton("기록");
	    
	    p1.add(text);
	    p1.add(sendBtn);
	    
	    add(p1 , BorderLayout.NORTH);
	    
	    p1.setBackground(Color.yellow);
	    
	    JTextArea ta = new JTextArea();
	    add(ta , BorderLayout.CENTER);
	    
	    /*
	       *  읽어오기 버튼을 누르면 diary.txt 에 있는 모든 문자열을 읽어와서 
	       *  JTextArea 에 출력해 보세요.
	       *  
	       *  - hint 
	       *  FileReader 객체를 활용하면 파일에서 문자열을 읽어 낼수 있습니다.
	       */
	    
	    JButton readBtn = new JButton("읽기");
	    p1.add(readBtn);
	    
	    setVisible(true);
	    
	    File f = new File("C:\\acorn202304\\myFolder\\diary.txt");
	    
	    //버튼에 리스너 등록
	    sendBtn.addActionListener((e)->{
	    //입력한 문자열 읽어오기

		String str = text.getText();
		
		try {
			if(!f.exists()) {
				f.createNewFile();
			}
			FileWriter fw = new FileWriter(f , true);
			fw.write(str + "\r\n");
			fw.flush();
			fw.close();
			JOptionPane.showMessageDialog(this, "저장 했습니다");

		}catch(Exception e1) {
			e1.printStackTrace();
		}
	    }); // sendBtn
	    
	    readBtn.addActionListener((e3)->{
	    	FileReader fr = null;
	    	BufferedReader br = null;
	    	try {
	    		fr = new FileReader(f);
	    		br = new BufferedReader(fr);
	    		
				while(true) { // 무한 반복문
					String line = br.readLine();
					if(line == null)break; // 출력할 텍스트가 없으면 반복문 탈출
					ta.append(line + "\r\n"); // 텍스트 누적 출력 및 개행기호
				}
			} catch (IOException e4) {
				e4.printStackTrace();
			}finally {
				// 사용했던 스트림은 열렸던 역순으로 닫는다.
				try {
					// close() 호출 시에도 null 에 주의해야 한다.
					if(br == null)br.close();
					if(fr == null)fr.close();
				} catch (IOException e5) {
					e5.printStackTrace();
				}
			}
	    });
	}

	public static void main(String[] args) {
		new MyFrame("나의 프레임");
		System.out.println("실행합니다.");
	}
}