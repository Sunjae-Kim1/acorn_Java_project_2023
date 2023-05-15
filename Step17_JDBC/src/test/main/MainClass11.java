package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass11 {
	public static void main(String[] args) {
		int num = 3;
		
		// 아래의 메소드를 이용해 회원정보 삭제
		MemberDto dto = new MemberDto();
		dto.setNum(num);
		delete(dto.getNum());
	}
	public static void delete(int num) {
		// 인자로 전달된 num 에 해당하는 회원정보를 삭제
		// DBConnect 클래스를 활용
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			// Connection 객체의 참조값 얻기
			conn= new DBConnect().getConn();
			String sql = "delete member"
			    		+ " where num = ?";
			// 미완성의 sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻기
			pstmt = conn.prepareStatement(sql);
			// PreparedStatement 객체의 메소드를 이용해 미완성인 sql 문을 완성하기 ( ? 에 값을 넣기 )
			pstmt.setInt(1, num);
			// sql 문 실행
			pstmt.executeUpdate();
			System.out.println("회원 정보를 삭제했습니다.");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}