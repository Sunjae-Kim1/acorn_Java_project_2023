package test.mypac;
/*
 * [ interface ]
 * 
 * - 생성자가 없다.
 * - 구현된 메소드는 가질수 없다. ( 추상 메소드만 가질수 있다. )
 * - 필드는 static final 상수만 가질수 있다.
 * - Data Type 의 역할 가능
 * - Interface Type 의 참조값이 필요 시 구현 ( implements ) 클래스를 만들어 객체를 생성해야 한다.
 * - 클래스 상속은 단일 상속이지만 , Interface 는 다중 구현이 가능하다.
 */
public interface Remocon {
	// 생성자가 존재?
	// public Remocon() {} , 생성자 없음
	// public void up() {} , 메소드 불가
	
	// 필드는 static final 필드만 가질수 있다. ( static final 은 생략 가능 )
	public static final String company = "LG";
	public void up();
	public void down();
}
