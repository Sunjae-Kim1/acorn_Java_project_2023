package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		// 1. String Type 을 담을 수 있는 방 3개짜리 배열객체를 만들어서 참조값을 지역변수 names 에 담기
		// String[] names = {null , null , null};
		String[] names = new String[3];
		// 2. 3개의 방에 순서대로 친구의 이름을 담기
		names[0] = "김구라";
		names[1] = "해골";
		names[2] = "원숭이";
		// 3. 배열에 있는 친구의 이름을 하나씩 순서대로 콘솔 창에 출력
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}