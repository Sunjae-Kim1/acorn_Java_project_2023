package test.mypac;

// 계산기 인터페이스
@FunctionalInterface // 추상 메소드를 하나만 만들 수 있게 강제하는 어노테이션 ( = () -> {} 형태 보장 )
public interface Calc {
	// 메소드로 2개의 실수를 전달받아서 어떤 연산을 하고 결과를 리턴하는 메소드
	// 어떤 연산을 할지는 개발자 몫
	public double execute(double num1 , double num2);
}