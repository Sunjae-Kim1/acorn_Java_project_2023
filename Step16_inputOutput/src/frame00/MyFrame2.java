package frame00;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MyFrame2 extends JFrame{
	// 현재 열려있는 File 객체의 참조값을 저장할 필드
	File openedFile;
	JTextArea ta;
	
	public MyFrame2(String title) {
		super(title);
	    setBounds(100, 100, 500, 500);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new BorderLayout());
	    
	    // 메뉴바
	    JMenuBar mb = new JMenuBar();
	    
	    // 메뉴
	    JMenu menu = new JMenu("File");
	    
	    // 메뉴 아이템
	    JMenuItem newItem = new JMenuItem("New");
	    JMenuItem openItem = new JMenuItem("Open");
	    JMenuItem saveItem = new JMenuItem("Save");
	    JMenuItem saveAsItem = new JMenuItem("Save As");
	    
	    // 메뉴에 메뉴 아이템 순서대로 추가
	    menu.add(newItem);
	    menu.add(openItem);
	    menu.add(saveItem);
	    menu.add(saveAsItem);
	    
	    // 메뉴를 메뉴바에 추가
	    mb.add(menu);
	    
	    // 프레임의 메소드를 이용해 메뉴바 추가
	    setJMenuBar(mb);
	    
	    ta = new JTextArea();
	    add(ta , BorderLayout.CENTER);
	    
	    // Open 을 눌렀을 시 실행될 리스너
	    openItem.addActionListener((e)->{
	    	JFileChooser fc = new JFileChooser("C:/acorn202304/myFolder");
	    	int result = fc.showOpenDialog(this);
	    	if(result == JFileChooser.APPROVE_OPTION) {
	    		
	    		// 선택한 파일을 제어할 수 있는 File 객체 리턴
	    		openedFile = fc.getSelectedFile();
	    		
	    		//선택한 파일 경로
	    		String path = openedFile.getAbsolutePath();
	    		
	    		// 프레임 제목에 선택한 파일의 경로 출력
	    		this.setTitle(path);
	    		
	    	    	FileReader fr = null;
	    	    	BufferedReader br = null;
	    	    	try {
	    	    		fr = new FileReader(openedFile);
	    	    		br = new BufferedReader(fr);
	    	    		
	    				while(true) { // 무한 반복문
	    					String line = br.readLine();
	    					if(line == null)break; // 출력할 텍스트가 없으면 반복문 탈출
	    					ta.append(line + "\r\n"); // 텍스트 누적 출력 및 개행기호
	    				}
	    			} catch (IOException e1) {
	    				e1.printStackTrace();
	    			}finally {
	    				// 사용했던 스트림은 열렸던 역순으로 닫는다.
	    				try {
	    					// close() 호출 시에도 null 에 주의해야 한다.
	    					if(br == null)br.close();
	    					if(fr == null)fr.close();
	    				} catch (IOException e2) {
	    					e2.printStackTrace();
	    				}
	    			}
	    	}
	    });
	    
	    // Save 를 눌렀을 시 실행될 리스너
	    saveItem.addActionListener((e)->{
	    	// 만약 열려진 파일이 없다면
	    	if(openedFile==null) {
	    		JOptionPane.showMessageDialog(this, "파일을 선택해 주세요");
	    		return; // 메소드 끝내기
	    	}
	    	saveToFile();
	    });
	    
	    saveAsItem.addActionListener((e)->{
	    	JFileChooser fc = new JFileChooser("c:/acorn202304/myFolder");
	    	int result = fc.showSaveDialog(this);
	    	if(result == JFileChooser.APPROVE_OPTION) {
	    		// 선택한 File 객체의 참조값을 얻기
	    		openedFile = fc.getSelectedFile();
	    		// title 출력
	    		setTitle(openedFile.getAbsolutePath());
	    		
	    		// 새로운 파일 생성
	    		try {
					openedFile.createNewFile();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
	    		
	    		// 파일에 문자열 저장
	    		saveToFile();
	    	}
	    });
	    
	    setVisible(true);
	}
	
	// 파일에 저장하는 메소드
    public void saveToFile() {
    	
    	//JTextArea 에 입력한 문자열 읽기
    	String content = ta.getText();
    	
    	FileWriter fw = null;
    	BufferedWriter bw = null;
    	
    	try {
    		fw = new FileWriter(openedFile);
    		bw = new BufferedWriter(fw);
    		bw.write(content);
    		bw.flush();
    		JOptionPane.showMessageDialog(this, "저장했습니다.");
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		try {
    			if(bw!=null)bw.close();
    			if(fw!=null)fw.close();
    		}catch(Exception e1) {}
    	}
    }

	public static void main(String[] args) {
		new MyFrame2("나의 프레임");
		System.out.println("실행합니다.");
	}
}