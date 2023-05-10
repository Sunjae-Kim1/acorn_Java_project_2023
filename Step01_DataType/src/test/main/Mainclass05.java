package test.main;
/*
 * [ Java 참조형 데이터 Type ]
 * String Type
 * 
 * 문자열을 다룰 때 사용하는 데이터 Type
 */
public class Mainclass05 {
	public static void main(String[] args) {
		// "김구라" String Type 객체를 Heap 영역 ( 사물함 ) 에 만들고 그 참조값을 변수에 담기
		String name = "김구라";
		// name 안에 있는 참조값을 tmp 변수에 복사
		String tmp = name;
		// "원숭이" String type 객체를 Heap 영역 만들고 그 참조값을 name 변수에 덮어쓰기
		name = "원숭이";
		// name 변수를 비우기 ( null 은 참조 데이터 Type 이 담아낼 수 있는 빈 공간이다. )
		name = null;
	}
}