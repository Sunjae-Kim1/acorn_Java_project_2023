package test.main;

import java.util.ArrayList;

/*
 * Java 에서 배열은 크기를 조절할 수 없는 고정 배열이다.
 * 
 * 동적으로 item 을 추가하고 삭제하는 작업에는 사용 불가
 * 
 * 해당 작업을 위해서는 ArrayList 객체를 사용해야 한다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		// String Type 을 지정할 수 있는 ArrayList 객체 생성해서 참조값을 names 에 대입
		ArrayList<String> names = new ArrayList<>();
		// "김구라" , "해골" , "원숭이" 3개의 String Type 저장
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		
		// 0번 방 아이템을 불러 item 지역변수에 대입
		String item = names.get(0);
		
		// 1번 방 삭제
		names.remove(1);
		
		// 0번 방에 "에어콘" 넣기
		names.add(0, "에어콘");
		
		// 저장된 아이템의 갯수 ( = size ) 를 size 지역변수에 대입
		int size = names.size();
		
		// 저장된 아이템 전체 삭제
		names.clear();
	}
}