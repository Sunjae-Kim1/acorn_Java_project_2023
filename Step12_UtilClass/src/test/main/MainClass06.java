package test.main;

import java.util.HashMap;

import test.mypac.Car;

/*
 * Java 에서 어떤 데이터를 Key : Value 의 쌍으로 관리하고 싶으면
 * HashMap 에서 객체를 사용
 * Key 의 Generic 도 마음대로 지정 가능하지만 보통 String Type 으로 한다.
 * Value 의 Generic 은 그 때마다 다르지만 Value 가 여러가지 Type 이면 Object 로 지정한다.
 */

public class MainClass06 {
	public static void main(String[] args) {
		HashMap<String , Object> map1 = new HashMap<>(); // HashMap<key generic , value generic>
		// 문자열을 키 값으로 원하는 어떤 Type 의 value 도 저장 가능
		
		map1.put("num", 1); // Integer
		map1.put("name", "김구라"); // String
		map1.put("isMan", true); // Boolean
		map1.put("car", new Car("소나타")); // Car type
		
		/*
		 * Value 의 Generic 클래스가 Object 로 지정되어서
		 * 리턴되는 Object Type 을 원래 Type 으로 Casting 한다.
		 */
		
		int num = (int)map1.get("num");
		String name = (String)map1.get("name");
		boolean isMan = (boolean)map1.get("isMan");
		Car car = (Car)map1.get("car");
		
		// 동일한 Key 값으로 다시 담으면 수정
		map1.put("name", "에어콘");
		// 특정 Key 값으로 담긴 내용 삭제 , 성공하면 true , 실패시 false 리턴
		map1.remove("isMan");
		// 모두 삭제
		map1.clear();
	}
}