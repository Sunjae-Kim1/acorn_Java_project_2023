package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass02 {
	public static void main(String[] args) {
		// member 테이블에 추가할 회원의 정보
		int num = 4;
		String name = "주뎅이";
		String addr = "봉천동";
		
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
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      // sql 문을 대신 실행해줄 객체의 참조값을 담을 지역변수 만들기
	      PreparedStatement pstmt = null;
	      try {
	    	  String sql = "insert into member"
	    			  + " (num , name , addr)"
	    			  + " values(? , ? , ?)";
	    	  // 미완성의 sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻기
	    	  pstmt = conn.prepareStatement(sql);
	    	  // PreparedStatement 객체의 메소드를 이용해 미완성인 sql 문을 완성하기 ( ? 에 값을 넣기 )
	    	  pstmt.setInt(1, num);
	    	  pstmt.setString(2, name);
	    	  pstmt.setString(3, addr);
	    	  // sql 문 실행
	    	  pstmt.executeUpdate();
	    	  System.out.println("회원 정보를 저장했습니다.");
	      }catch (Exception e) {
			e.printStackTrace();
		}
	}
}