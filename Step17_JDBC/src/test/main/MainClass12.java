package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass12 {
	public static void main(String[] args) {
		// 추가할 회원 정보
		int num = 1;
		String name = "덩어리";
		String addr = "목동";
		
		// 추가할 회원 정보를 MemberDto 객체에 대입
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		
		// DB 에 저장
		new MemberDao().insert(dto);
		new MemberDao().update(dto);
		new MemberDao().delete(num);
	}
}