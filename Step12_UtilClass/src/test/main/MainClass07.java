package test.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 * 3 명의 회원정보 (번호 , 이름 , 주소) 를 HashMap 객체에 각각 대입해서
		 * ArrayList 객체에 누적
		 * 
		 * 반복문으로 ArrayList 객체에 누적된 회원정보를 출력
		 * (HashMap 객체 3개 , ArrayList 객체 1개 생성 )
		 * 
		 * ArrayList 객체에 HashMap 을 담을 예정이니
		 * List<HashMap<String , Object>> Type 필요
		 */
		List<HashMap<String , Object>> mems = new ArrayList<>();
		
		HashMap<String , Object> map1 = new HashMap<>();
		map1.put("num" , 1);
		map1.put("name", "김구라");
		map1.put("addr", "노량진");
		
		HashMap<String , Object> map2 = new HashMap<>();
		map2.put("num" , 2);
		map2.put("name", "해골");
		map2.put("addr", "행신동");
		
		HashMap<String , Object> map3 = new HashMap<>();
		map3.put("num" , 3);
		map3.put("name", "원숭이");
		map3.put("addr", "상도동");
		
		mems.add(map1);
		mems.add(map2);
		mems.add(map3);
		
//		for(int i = 0; i < mems.size(); i++) {
//		System.out.println(mems.get(i));
//		}
		
		for(HashMap<String , Object> tmp : mems) {
			int num = (int)tmp.get("num");
			String name = (String)tmp.get("name");
			String addr = (String)tmp.get("addr");
			System.out.println("num:" + num + ", name:" + name + ", addr:" + addr);
		}
	}
}