package test.main;
/*
 * [ 기본 Data Type 의 참조 Data Type ]
 * 
 * byte	:	Byte
 * short	:	Short
 * int		:	Integer
 * long		:	Long
 * 
 * float	:	Float
 * double	:	Double
 * 
 * char	:	Character
 * boolean	:	Boolean
 * 
 * - 때로는 기본 데이터 Type 의 참조 데이터 Type 이 필요할 때가 있다.
 * - 기본 데이터 Type 을 객체에 포장 ( boxing ) 하는 형태이다.
 * - boxing , unboxing 은 자동으로 되기 때문에 프로그래머가 신경 쓸 필요가 없다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		// 기본 데이터 Type num1
		int num1 = 10;
		
		// 참조 데이터 Type num2
		//Integer num2 = new Integer(10);
		Integer num2 = 10;
		
		// 참조 데이터 Type 이지만 기본 데이터 Type 처럼 사용 가능
		int result1 = num2 +1;
		int result2 = num1 + num2;
		Integer result3 = num1 + num2;
		
		// Interger 클래스의 static 메소드를 이용해 문자 "999" 를 숫자 999 로 변환
		int result4 = Integer.parseInt("999");
		System.out.println(result4);
	}
}