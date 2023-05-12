package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * JDBC ( Java Data Base Connectivity )
 * 
 * DataBase 에 연결해서 Select , Insert , Update , Delete 작업
 * 
 *  Oracle 에 연결하기 위해서는 드라이버 클래스가 들어있는 ojdbc6.jar 파일을
 *  사용할 수 있게 설정한다.
 *  
 *  프로젝트에 마우스 우클릭 -> Build Path -> Configure Build Path -> Libraries 탭 선택
 *  -> ClassPath 선택 ->우측 Add External jar 버튼 클릭 -> ojdbc6.jar 파일 찾은 후
 *  -> apply
 */
public class MainClass01 {
	public static void main(String[] args) {
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
	      //select 작업을 위해서는 필요한 객체의 참조값을 담을 지역 변수 미리 만들기
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      try {
	    	  // 실행할 sql 문
	    	  String sql= "select num , name , addr"
	    			  + " from member"
	    			  + " order by num desc";
	    	  // prepareStatement 객체의 참조값 얻기
	    	  pstmt = conn.prepareStatement(sql);
	    	  // select 문 실행하고 결과값을 resultSet 에 대입
	    	  rs = pstmt.executeQuery();
	    	  while(rs.next()) {
	    		  int num = rs.getInt("num");
	    		  String name = rs.getString("name");
	    		  String addr = rs.getString("addr");
	    		  // 콘솔창에 출력
	    		  System.out.println(num + " | " + name + " | " + addr);
	    	  }
	      }catch(Exception e) {
	    	  e.printStackTrace();  
	      }
	}
}