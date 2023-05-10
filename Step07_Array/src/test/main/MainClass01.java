package test.main;
/*
 * Java 에서 배열도 객체
 * 배열은 참조 데이터 Type 이다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		// int num = null; // null ==> String
		
		// int[] nums = null; // 참조 데이터 타입 배열
		// int[] nums2 = 0;
		
		// String a = null;
		// String b = 0;
		
		// int Type  5 개를 저장하고 있는 배열 객체 생성 후 참조 값을 nums 라는 지역변수에 담기
		int[] nums = {10 , 20 , 30 , 40 , 50};
		
		//double Type 5 개를 저장하고 있는 배열
		double[] nums2 = {10.1 , 10.2 , 10.3 , 10.4 , 10.5};
		
		// boolean Type 5 개를 저장하고 있는 배열
		boolean[] truth = {true , false , false , true , true};
		
		// String Type 5 개를 저장하고 있는 배열
		String[] names = {"김구라" , "해골" , "원숭이" , "주뎅이" , "덩어리"};
		
		// 배열 객체는 clone()  이라는 메소드와 length 라는 필드가 있다.
		
		// 배열객체의 복제본 얻기
		int[] result = nums.clone(); // 다른 참조 값 생성
		int[] result2 = nums;
		// 배열의 크기 얻기
		int size = nums.length;
		// 배열의 순서 있는 데이터이다. 득정 index 의 item 참조하는 방법
		int first = nums[0];
		int second = nums[1];
		int third = nums[2];
	}
}