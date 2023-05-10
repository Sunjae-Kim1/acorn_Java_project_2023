package test.main;

import test.mypac.Square;

/*
 * test.mypac 패키지에 클래스를 하나 만들기
 * 
 * - 사각형의 폭 ( width ) , 높이 ( height ) 를 필드에 저장한다.
 * - 필드에 저장된 폭 , 높이를 이용해서 사각형의 넓이를 콘솔 창에 출력하는 기능
 * - 필드 , 메소드는 모두  non static 입니다.
 */
public class MainClass10 {
	public static void main(String[] args) {
		Square square = new Square();
		square.width = 100;
		square.height = 200;
		square.area();
		
		Square square2 = new Square();
		square2.width = 30;
		square2.height = 5;
		square2.area();
	}
}