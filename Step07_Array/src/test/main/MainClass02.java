package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// 0 으로 초기화된 방 3 개짜리 int[] 객체를 만들어서 참조 값을 지역변수 nums 에 담기
		int[] nums = {0 , 0 , 0};
		// 0 번 방에 10 , 1번 방에 20 , 2번 방에 30 을 저장
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		// 0 으로 초기화된 방 500 개짜리 int[] 객체를 만들어서 참조 값을 지역변수 num2 에 담기
		int[] num2 = new int[500];
		
		/*
		 * 0 번 방에 1
		 * 1 번 방에 2
		 * 2 번 방에 3
		 * .....
		 * 
		 * 499 번 방에 500
		 */
		
		for(int i = 0; i < num2.length; i++) {
			num2[i] = i + 1;
			System.out.println(num2[i]);
		}
		
	}
}