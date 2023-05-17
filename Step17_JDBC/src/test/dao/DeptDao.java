package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.DeptDto;
import test.util.DBConnect;

public class DeptDao {
	// 인자로 전달되는 번호에 해당하는 회원 한 명의 정보를 리턴하는 메소드
		public DeptDto getData(int deptNo) {
			// MemberDto 객체 미리 만들기
			DeptDto dto = null;
			
			// 필요한 객체를 담을 지역변수
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				// Connection 객체의 참조값 얻기
				conn = new DBConnect().getConn();
				// 실행할 sql 문 ( select 문 )
				String sql = "select dName , loc"
						+ " from dept"
						+ " where deptNo = ?";
				pstmt = conn.prepareStatement(sql);
				// select 문이 미완성이라면 여기서 완성
				pstmt.setInt(1, deptNo);
				// select 문 수행하고 결과를 ResultSet 으로 리턴
				rs = pstmt.executeQuery();
				// 반복문을 돌면서 ResultSet 에 있는 row 에 있는 정보를 추출
				while (rs.next()) {
					// 현재 커서가 존재하는 row 에 있는 정보를 추출 후 사용
					String dName = rs.getString("dName");
					String loc = rs.getString("loc");
					// MemberDto 객체에 회원 한 명의 정보를 담는다.
					dto = new DeptDto();
					dto.setDeptNo(deptNo);
					dto.setdName(dName);
					dto.setLoc(loc);
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
		public List<DeptDto> getList(){
			// 회원 정보를 누적할 객체
			List<DeptDto> list = new ArrayList<>();
			
			// 필요한 객체를 담을 지역변수
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				// Connection 객체의 참조값 얻기
				conn = new DBConnect().getConn();
				// 실행할 sql 문 ( select 문 )
				String sql = "select deptNo , dName , loc"
						+ " from dept"
						+ " order by deptNo desc";
				pstmt = conn.prepareStatement(sql);
				// select 문이 미완성이라면 여기서 완성
				
				// select 문 수행하고 결과를 ResultSet 으로 리턴
				rs = pstmt.executeQuery();
				// 반복문을 돌면서 ResultSet 에 있는 row 에 있는 정보를 추출
				while(rs.next()) {
					// 현재 커서가 존재하는 row 에 있는 정보를 추출 후 사용
					
					// row 에 있는 회원 정보를  MemberDto 객체에 담아서
					DeptDto dto = new DeptDto();
					dto.setDeptNo(rs.getInt("deptNo"));
					dto.setdName(rs.getString("dName"));
					dto.setLoc(rs.getString("loc"));
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
		public boolean insert(DeptDto dto) {
			// 필요한 객체를 담을 지역변수 만들기
			Connection conn = null;
			PreparedStatement pstmt = null;
			// insert , update , delete 작업을 통해서 변하된 ( 추가 , 수정 , 삭제 ) row 의 갯수 담을 변수
			int rowCount = 0; // 초기값 0
			try {
				// Connection 객체의 참조값 얻기
				conn = new DBConnect().getConn();
				// 실행할 sql
				String sql = "insert into dept"
						+ " (deptNo , dName , loc)"
						+ " values(? , ? , ?)";
				// sql 문을 대신 실행할 PreparedStatement 객체의 참조값 얻기
				pstmt = conn.prepareStatement(sql);
				// sql 문이 ? 가 존재하는 미완성이면 여기서 완성한다.
				pstmt.setInt(1, dto.getDeptNo());
				pstmt.setString(2, dto.getdName());
				pstmt.setString(3, dto.getLoc());
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
		
		public boolean update(DeptDto dto) {
			// 필요한 객체를 담을 지역변수 만들기
			Connection conn = null;
			PreparedStatement pstmt = null;
			// insert , update , delete 작업을 통해서 변하된 ( 추가 , 수정 , 삭제 ) row 의 갯수 담을 변수
			int rowCount = 0; // 초기값 0
			try {
				// Connection 객체의 참조값 얻기
				conn = new DBConnect().getConn();
				// 실행할 sql
				String sql = "update dept"
						+ " set dName = ? , loc = ?"
						+ " where deptNo = ?";
				// sql 문을 대신 실행할 PreparedStatement 객체의 참조값 얻기
				pstmt = conn.prepareStatement(sql);
				// sql 문이 ? 가 존재하는 미완성이면 여기서 완성한다.
				pstmt.setString(1, dto.getdName());
				pstmt.setString(2, dto.getLoc());
				pstmt.setInt(3, dto.getDeptNo());
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
		
		public boolean delete(int deptNo) {
			// 필요한 객체를 담을 지역변수 만들기
			Connection conn = null;
			PreparedStatement pstmt = null;
			// insert , update , delete 작업을 통해서 변하된 ( 추가 , 수정 , 삭제 ) row 의 갯수 담을 변수
			int rowCount = 0; // 초기값 0
			try {
				// Connection 객체의 참조값 얻기
				conn = new DBConnect().getConn();
				// 실행할 sql
				String sql = "delete dept"
						+ " where deptNo = ?";
				// sql 문을 대신 실행할 PreparedStatement 객체의 참조값 얻기
				pstmt = conn.prepareStatement(sql);
				// sql 문이 ? 가 존재하는 미완성이면 여기서 완성한다.
				pstmt.setInt(1, deptNo);
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