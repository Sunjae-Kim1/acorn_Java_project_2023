package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		// 정수를 저장 가능한 ArrayList<Integer> 객체를 생성해 참조값을 지역변수 nums 대입
		ArrayList<Integer> nums = new ArrayList<>();
		// ArrayList 객체에 10 , 20, 30 3개 대입
		nums.add(10);
		nums.add(20);
		nums.add(30);
		// for 문
		for(int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}
		
		// 확장 for 문을 이용해 저장된 정수 순서대로 출력
		for(int tmp : nums) {
			System.out.println(tmp);
		}
	}
}