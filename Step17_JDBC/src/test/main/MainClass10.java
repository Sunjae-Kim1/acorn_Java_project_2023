package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass10 {
	public static void main(String[] args) {
		int num = 1;
		String name = "호빵";
		String addr = "독산동";
		
		MemberDto dto = new MemberDto();
		dto.setNum(num);
		dto.setName(name);
		dto.setAddr(addr);
		update(dto);
	}
	public static void update(MemberDto dto) {
		// 인자로 전달받는 MemberDto 객체에 담긴 내용을 이용해 DB 에 회원정보 저장
		// sql 문을 대신 실행해줄 객체의 참조값을 담을 지역변수 만들기
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			// Connection 객체의 참조값 얻기
			conn= new DBConnect().getConn();
			String sql = "update member"
			    		+ " set name = ? , addr = ?"
			    		+ " where num = ?";
			// 미완성의 sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻기
			pstmt = conn.prepareStatement(sql);
			// PreparedStatement 객체의 메소드를 이용해 미완성인 sql 문을 완성하기 ( ? 에 값을 넣기 )
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			// sql 문 실행
			pstmt.executeUpdate();
			System.out.println("회원 정보를 수정했습니다.");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}