package test.main;

import java.util.HashSet;
import java.util.Set;

/*
 * HashSet 은 Set 인터페이스를 구현한 클래스이다.
 * 
 * - 순서가 없다.
 * - Key 값도 없다.
 * - 중복 허용 X
 * - 어떤 Data 를 묶음 ( 집합 ) 으로 관리하고자 할때 사용
 */

public class MainClass08 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(20);
		set1.add(30);
		set1.add(30);
		
		Set<String> set2 = new HashSet<>();
		set2.add("kim");
		set2.add("lee");
		set2.add("park");
		set2.add("lee");
		set2.add("park");
		
		
	}
}