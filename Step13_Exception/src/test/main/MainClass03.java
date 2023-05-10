package test.main;

import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나눌 수 입력:");
		String inputNum1 = scan.nextLine();
		System.out.println("나누어 지는 수 입력:");
		String inputNum2 = scan.nextLine();
		try{
			int num1 = Integer.parseInt(inputNum1);
			int num2 = Integer.parseInt(inputNum2);
		
			int result = num2/num1;
			int result2 = num2%num1;
			System.out.println(num2 + " 를" + num1 + " 으로 나눈 몫 :" + result);
			System.out.println(num2 + " 를" + num1 + " 으로 나눈 나머지 :" + result2);
		}catch(Exception e) {
			// Exception Type 은 모든 예외의 부모 Type 이라서 모든 예외가 여기서 처리
			System.out.println("예외 발생");
			System.out.println("예외 메세지:" + e.getMessage());
		}finally {
			// 여기는 예외가 발생해도 않해도  반드시 실행이 보장되는 블럭
			// 중요한 마무리 작업을 여기서 주로 수행
			System.out.println("중요한 마무리 작업을 수행합니다.");
		}
		System.out.println("main 메소드가 정상 종료합니다.");
	}
}