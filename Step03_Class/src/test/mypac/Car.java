package test.mypac;
/*
 * class 의 역할
 * 
 * 1. 객체의 설계도 역할
 * 	- 객체는 Heap 영역 ( 사물함 ) 에 들어 있는 물건이라고 표현할 수 있다.
 *  - class 를 이용해 객체를 원하는 시점에 원하는 갯수만큼 만들 수 있다.
 *  - 만든 객체가 어떤 저장소와 어떤 기능을 가지게 하는지 class 로 설계 가능
 * 
 * 2. Data Type 역할
 * 
 * 
 * 3. Static 필드와 메소드를 포함하는 역할
 */
public class Car { // 클래스의 설계도
	/*
	 * [ 필드 정의 ]
	 * 
	 * - 클래스의 { } 중괄호 안에 아래와 같은 형식으로 필드를 정의 가능
	 * - 초기 값을 부여하지 않으면 기본 값이 들어간다.
	 * - int 의 기본 값은 0 , boolean 의 기본 값은 false , 참조데이터의 기본 값은 null
	 * 
	 *  접근지정자 Data Type 필드 명 = 초기 값 ;
	 * 
	 */
	public String name;
	public int price;
	
	/* 
	 * [ 메소드 정의 ]
	 * 
	 * 접근지정자 return Type 메소드명( ){
	 * 
	 * }
	 */
	public void drive() {
		System.out.println(this.name + " 가 주행합니다.");
		// 메소드 안쪽 블럭으로 drive() 메소드가 호출됐을떄
		// 실행할 java code 를 여러 줄 모아둔다.
		
		Car a = this;
	}
	
	public void showInfo() {
		System.out.println("차의 이름은 " + this.name + " 이고 , 가격은 " + this.price + " 만원 입니다.");
	}
	
	
	
}