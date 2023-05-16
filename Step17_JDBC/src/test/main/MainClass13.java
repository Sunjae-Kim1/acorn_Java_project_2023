package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass13 {
	public static void main(String[] args) {
		String name = "누구";
		String addr = "어디";
		
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		
		MemberDao dao = new MemberDao();
		boolean isSuccess = dao.insert(dto);
		if(isSuccess)
			System.out.println("저장했습니다.");
	}
}