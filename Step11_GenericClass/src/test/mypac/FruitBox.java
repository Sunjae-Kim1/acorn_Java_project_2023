package test.mypac;

/*
 * 클래스 안에서 사용하는 특정 Type 을 고정하지 않고
 * 
 * 클래스를 사용하는 시점에 Type 을 정할 수 있게 한다.
 * 
 * - 아래 선언한 T 는 마음대로 단어를 정할 수 있다.
 * 보통 Type 이라는 의미에서 T 라고 많이 한다.
 * - T 를 포괄 클래스 ( = Generic Class ) 라고 한다.
 */

// 가상의 과일 박스
public class FruitBox<T> { // 타입을 고정이 아닌 동적으로 바꾼다. , 제너릭 클래스
	
	// 필드
	private T item;
	
	// 과일을 포장하는 메소드
	public void pack(T item) {
		this.item = item;
	}
	// 과일을 리턴 메소드
	public T unPack() {
		return item;
	}
}