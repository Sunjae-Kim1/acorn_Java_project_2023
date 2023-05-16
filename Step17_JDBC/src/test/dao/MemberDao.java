package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

/*
 * Data Access Object
 * 
 * - DB 에 insert , update , delete ,  select 작업을 대신하는 객체를 생성하는 클래스 설계
 */
public class MemberDao {
	// 인자로 전달되는 번호에 해당하는 회원 한 명의 정보를 리턴하는 메소드
	public MemberDto getData(int num) {
		// MemberDto 객체 미리 만들기
		MemberDto dto = null;
		
		// 필요한 객체를 담을 지역변수
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// Connection 객체의 참조값 얻기
			conn = new DBConnect().getConn();
			// 실행할 sql 문 ( select 문 )
			String sql = "select name , addr"
					+ " from member"
					+ " where num = ?";
			pstmt = conn.prepareStatement(sql);
			// select 문이 미완성이라면 여기서 완성
			pstmt.setInt(1, num);
			// select 문 수행하고 결과를 ResultSet 으로 리턴
			rs = pstmt.executeQuery();
			// 반복문을 돌면서 ResultSet 에 있는 row 에 있는 정보를 추출
			while (rs.next()) {
				// 현재 커서가 존재하는 row 에 있는 정보를 추출 후 사용
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				// MemberDto 객체에 회원 한 명의 정보를 담는다.
				dto = new MemberDto();
				dto.setNum(num);
				dto.setName(name);
				dto.setAddr(addr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return dto;
	}
	
	// 전체 회원의 정보를 리턴하는 메소드
	public List<MemberDto> getList(){
		// 회원 정보를 누적할 객체
		List<MemberDto> list = new ArrayList<>();
		
		// 필요한 객체를 담을 지역변수
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// Connection 객체의 참조값 얻기
			conn = new DBConnect().getConn();
			// 실행할 sql 문 ( select 문 )
			String sql = "select num , name , addr"
					+ " from member"
					+ " order by num desc";
			pstmt = conn.prepareStatement(sql);
			// select 문이 미완성이라면 여기서 완성
			
			// select 문 수행하고 결과를 ResultSet 으로 리턴
			rs = pstmt.executeQuery();
			// 반복문을 돌면서 ResultSet 에 있는 row 에 있는 정보를 추출
			while(rs.next()) {
				// 현재 커서가 존재하는 row 에 있는 정보를 추출 후 사용
				
				// row 에 있는 회원 정보를  MemberDto 객체에 담아서
				MemberDto dto = new MemberDto();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				// list 에 누적
				list.add(dto);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch (Exception e) {}
		}
		//회원 정보가 누적된 List 객체의 참조값 리턴
		return list;
	}
	
	// 회원 한 명의 정보를 저장하고 해당 작업의 성공여부를 리턴하는 메소드
	public boolean insert(MemberDto dto) {
		// 필요한 객체를 담을 지역변수 만들기
		Connection conn = null;
		PreparedStatement pstmt = null;
		// insert , update , delete 작업을 통해서 변하된 ( 추가 , 수정 , 삭제 ) row 의 갯수 담을 변수
		int rowCount = 0; // 초기값 0
		try {
			// Connection 객체의 참조값 얻기
			conn = new DBConnect().getConn();
			// 실행할 sql
			String sql = "insert into member"
					+ " (num , name , addr)"
					+ " values(member_seq.NEXTVAL , ? , ?)";
			// sql 문을 대신 실행할 PreparedStatement 객체의 참조값 얻기
			pstmt = conn.prepareStatement(sql);
			// sql 문이 ? 가 존재하는 미완성이면 여기서 완성한다.
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			// insert or update or delete 문을 실제 수행 , 변화된 row 의 갯수가 리턴
			rowCount = pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally { // 예외가 발생하던 말던 실행 보장되는 블럭에서 마무리 작업 
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch (Exception e) {}
		}
		// 변화된 row 갯수가 0 이면 실패 아니면 성공
		if(rowCount > 0)return true;
		else return false;
	}
	
	public boolean update(MemberDto dto) {
		// 필요한 객체를 담을 지역변수 만들기
		Connection conn = null;
		PreparedStatement pstmt = null;
		// insert , update , delete 작업을 통해서 변하된 ( 추가 , 수정 , 삭제 ) row 의 갯수 담을 변수
		int rowCount = 0; // 초기값 0
		try {
			// Connection 객체의 참조값 얻기
			conn = new DBConnect().getConn();
			// 실행할 sql
			String sql = "update member"
					+ " set name = ? , addr = ?"
					+ " where num = ?";
			// sql 문을 대신 실행할 PreparedStatement 객체의 참조값 얻기
			pstmt = conn.prepareStatement(sql);
			// sql 문이 ? 가 존재하는 미완성이면 여기서 완성한다.
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			// insert or update or delete 문을 실제 수행 , 변화된 row 의 갯수가 리턴
			rowCount = pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally { // 예외가 발생하던 말던 실행 보장되는 블럭에서 마무리 작업 
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch (Exception e) {}
		}
		// 변화된 row 갯수가 0 이면 실패 아니면 성공
		if(rowCount > 0)return true;
		else return false;
	}
	
	public boolean delete(int num) {
		// 필요한 객체를 담을 지역변수 만들기
		Connection conn = null;
		PreparedStatement pstmt = null;
		// insert , update , delete 작업을 통해서 변하된 ( 추가 , 수정 , 삭제 ) row 의 갯수 담을 변수
		int rowCount = 0; // 초기값 0
		try {
			// Connection 객체의 참조값 얻기
			conn = new DBConnect().getConn();
			// 실행할 sql
			String sql = "delete member"
					+ " where num = ?";
			// sql 문을 대신 실행할 PreparedStatement 객체의 참조값 얻기
			pstmt = conn.prepareStatement(sql);
			// sql 문이 ? 가 존재하는 미완성이면 여기서 완성한다.
			pstmt.setInt(1, num);
			// insert or update or delete 문을 실제 수행 , 변화된 row 의 갯수가 리턴
			rowCount = pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally { // 예외가 발생하던 말던 실행 보장되는 블럭에서 마무리 작업 
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch (Exception e) {}
		}
		// 변화된 row 갯수가 0 이면 실패 아니면 성공
		if(rowCount > 0)return true;
		else return false;
	}
}