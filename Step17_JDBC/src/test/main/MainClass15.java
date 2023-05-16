package test.main;

import test.dao.MemberDao;

public class MainClass15 {
	public static void main(String[] args) {
		// 삭제할 회원 정보
		int num = 2;
		
		boolean isSuccess = new MemberDao().delete(num);
		
		if(isSuccess)
			System.out.println("삭제했습니다.");
	}
}