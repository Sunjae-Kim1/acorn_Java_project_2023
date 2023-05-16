package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		// 수정할 회원 정보
		int num = 1;
		String name = "김구라";
		String addr = "독산동";
		
		// 정보를 이용해 1 번 회원의 정보를 수정
//		MemberDto dto = new MemberDto();
//		
		// 수정할 회원 정보를 MemberDto 객체에 대입
//		dto.setNum(num);
//		dto.setName(name);
//		dto.setAddr(addr);
		
		// 생성자의 인자로 회원 정보를 전달해 객체를 생성
		MemberDto dto = new MemberDto(num, name, addr);

		boolean isSuccess = new MemberDao().update(dto);
		if(isSuccess)
			System.out.println("수정했습니다.");
	}
}