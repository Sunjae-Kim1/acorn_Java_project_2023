package test.main;

import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	
	// 필드
	JTextField inputMsg1;
	JTextField inputMsg2;
	JTextField inputMsg3;
	
	public MyFrame(String title){
		super(title);
		
		// 초기 위치와 크기
		setBounds(100 , 100 , 500 , 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
				
		// 문자열을 한 줄 입력 가능한 JTextField()
		this.inputMsg1 = new JTextField(10);
		this.inputMsg2 = new JTextField(10);
		this.inputMsg3 = new JTextField(10);
		JButton saveBtn = new JButton("저장");
		
		saveBtn.addActionListener((e)->{
			int msg1 = Integer.parseInt(inputMsg1.getText());
			String msg2 = inputMsg2.getText();
			String msg3 = inputMsg3.getText();
			
			//DB 연결객체를 담을 지역 변수 만들기
		      Connection conn=null;
		      try {
		         //오라클 드라이버 로딩
		         Class.forName("oracle.jdbc.driver.OracleDriver");
		         //접속할 DB 의 정보 @아이피주소:port번호:db이름
		         String url="jdbc:oracle:thin:@localhost:1521:xe";
		         //계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
		         conn=DriverManager.getConnection(url, "scott", "tiger");
		         //예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
		         System.out.println("Oracle DB 접속 성공");
		      } catch (Exception e1) {
		         e1.printStackTrace();
		      }
		      // 3 번의 회원의 주소를 동물원으로 수정
		      int num = msg1;
		      String name = msg2;
		      String addr = msg3;
		      
		      PreparedStatement pstmt = null;
		      try {
		    	  String sql = "insert into member"
		    			  + " (num , name , addr)"
		    			  + " values(? , ? , ?)";
		    	  pstmt = conn.prepareStatement(sql);
		    	  pstmt.setInt(1, num);
		    	  pstmt.setString(2, name);
		    	  pstmt.setString(3, addr);
		    	  
		    	  pstmt.executeUpdate();
		    	  
		    	  System.out.println("회원 정보를 추가했습니다.");
		      }catch (Exception e2) {
				e2.printStackTrace();
			}
			
			JOptionPane.showMessageDialog(this, "회원 정보를 추가했습니다.");
			
		});
		
		// 프레임에 UI 추가
		add(inputMsg1); // JTextField
		add(inputMsg2); // JTextField
		add(inputMsg3); // JTextField
		add(saveBtn); // JButton
				
		// UI 를 배치 후 호출이 원칙
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new MyFrame("나의 프레임");
	}
}