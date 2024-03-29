package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 회원 번호 입력:");
		
		// 정수 하나를 입력
		int num = scan.nextInt();
		
		// MemberDao 객체를 이용해 num 에 해당하는 회원 정보를 가져온다.
		MemberDto dto = new MemberDao().getData(num);
		
		// 만일 입력한 번호의 회원이 존재 시
		if(dto != null) {
			System.out.println(num + " 번 회원의 이름: " + dto.getName() + " 주소: " + dto.getAddr());
		}else {
			System.out.println(num + " 번 회원은 존재하지 않습니다.");
		}
	}
}