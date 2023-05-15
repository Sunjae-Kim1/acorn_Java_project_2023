package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.dto.MemberDto;

public class MainClass09 {
	public static void main(String[] args) {
		String name = "에이콘";
		String addr = "강남역";
		
		// 아래의 메소드를 이용해 회원정보를 DB 에 저장
		MemberDto dto =  new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		insert(dto);
	}
	public static void insert(MemberDto dto) {
		// 인자로 전달받는 MemberDto 객체에 담긴 내용을 이용해 DB 에 회원정보 저장
		// mem 에 담긴 정보를 이용해 회원 한명의 정보를 DB 에 저장
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
			    			  + " values(member_seq.NEXTVAL , ? , ?)";
			    	  // 미완성의 sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻기
			    	  pstmt = conn.prepareStatement(sql);
			    	  // PreparedStatement 객체의 메소드를 이용해 미완성인 sql 문을 완성하기 ( ? 에 값을 넣기 )
			    	  pstmt.setString(1, dto.getName());
			    	  pstmt.setString(2, dto.getAddr());
			    	  // sql 문 실행
			    	  pstmt.executeUpdate();
			    	  System.out.println("회원 정보를 저장했습니다.");
			      }catch (Exception e) {
					e.printStackTrace();
				}
	}
}