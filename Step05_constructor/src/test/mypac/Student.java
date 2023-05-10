package test.mypac;
/*
 * [ 생성자 ]
 * 
 * 1. 클래스명과 동일
 * 2. 메소드 모양과 유사하지만 리턴 타입이 없다.
 * 3. 객체를 생성 시( new 할 때 ) 호출
 * 4. 객체를 생성 시점에 무언가 준비 작업을 할 떄 유용
 * 5. 생성자를 명시적으로 정의하지 않아도 기본 생성자는 존재한다고 간주
 */
public class Student {
	
		// 생성자
		public Student() {
			// 객체를 생성하는 시점에 하고 싶은 작업이 있으면 여기서 작업
			System.out.println("Student 클래스의 Default(기본) 생성자 호출");
		}
	
		// 메소드
		public void study() {
			System.out.println("공부합시다!!!");
		}
}