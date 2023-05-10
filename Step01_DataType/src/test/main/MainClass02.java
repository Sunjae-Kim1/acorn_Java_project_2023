package test.main;

/*
 * 주석에 표기한 것처럼 코딩
 */
public class MainClass02 {
	public static void main(String args[]) {
		// 1. 콘솔 창에 "main 메소드가 시작되었습니다." 출력
		
		// 2. 국어점수 95 를 kor 변수에 대입
		
		// 3. 영어점수 100 를 eng 변수에 대입
		
		// 4. 국어 , 영어 점수 평균 ( 연산자 활용 ) avg 변수에 대입
		
		// 5. 콘솔 창에 avg 변수에 담긴 내용 출력
		
		System.out.println("main 메소드가 시작되었습니다.");
		
		int kor = 95;
		int eng = 100;
		
		// 실수 , 소수점을 반환하려면 둘 다 double 타입이나 하나만 double 타입 이어야 한다.
		// double avg = (double)(kor + eng) / 2;
		double avg = (kor + eng) / 2d;
		
		System.out.println("국어 점수 " + kor + " , 영어 점수 " + eng + " 의 평균 점수는 " + avg + " 입니다.");
		
	}
}