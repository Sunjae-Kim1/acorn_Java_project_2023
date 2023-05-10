package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Member;

public class MainClass05 {
	public static void main(String[] args) {
		// 1. Member 객체를 담을 수 있는 ArrayList 객체를 생성해 참조값을 members 라는 지역변수에 대입
		List<Member> members = new ArrayList<>();
		
		// 2. 3명의 회원정보를 Member 객체에 각각 대입 ( Member 객체가 3개 생성 )
		//	Member mem1 = new Member(1 , "김구라" , "노량진");
		//	Member mem2 = new Member(2 , "해골" , "행신동");
		//	Member mem3 = new Member(3 , "원숭이" , "강남");
		
		members.add(new Member(1 , "김구라" , "노량진"));
		members.add(new Member(2 , "해골" , "행신동"));
		members.add(new Member(3 , "원숭이" , "강남"));
		
		// 3. 위에서 생성된 Member 객체의 참조값을 members 객체에 모두 대입
		//	members.add(mem1);
		//	members.add(mem2);
		//	members.add(mem3);
		
		/*
		 * 4. member List 객체에 담긴 내용을 이용해 회원 목록을 아래와 같은 형식으로 반복문으로 출력
		 * 
		 * 번호: 1, 이름: 김구라, 주소: 노량진
		 * 번호: 2, 이름: 해골, 주소: 행신동
		 * 
		 */
		for(int i =0; i < members.size(); i++){
			System.out.println("번호: " + members.get(i).num + ", 이름: " + members.get(i).name + ", 주소: " + members.get(i).addr);
		}
	}
}