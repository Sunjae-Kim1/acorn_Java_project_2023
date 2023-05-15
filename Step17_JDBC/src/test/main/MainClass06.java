package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass06{

	public static void main(String[] args) {
		// 시퀸스 이용
		String name = "김구라";
		String addr = "노량진";
		
		// DB 연결객체를 담을 지역 변수 만들기
		Connection conn = null;
			try {
				// 오라클 드라이버 로딩
				Class.forName("oracle.jdbc.driver.OracleDriver");
				// 접속할 DB 의 정보 @아이피주소:port번호:db이름
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				// 계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
				conn = DriverManager.getConnection(url, "scott", "tiger");
				// 예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
				System.out.println("Oracle DB 접속 성공");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
			PreparedStatement pstmt = null;
			try {
				String sql = "insert into member" 
						+ " (num , name , addr)" 
						+ " values(member_seq.NEXTVAL , ? , ?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, name);
				pstmt.setString(2, addr);

				pstmt.executeUpdate();

				System.out.println("회원 정보를 추가했습니다.");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
	}
}