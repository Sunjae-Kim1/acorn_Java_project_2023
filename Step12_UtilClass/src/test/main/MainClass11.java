package test.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainClass11 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		// Type 확인
		Collection<Integer> nums2 = nums;

		// HashSet 객체의 생성자에 ArrayList 을 전달해서 중복 제거
		Set<Integer> set = new HashSet<>(nums);
		
		// 중복 제거된 Set 을 이용해 ArrayList 객체 생성
		List<Integer> result = new ArrayList<>(set);
		
	}
}