package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Monkey;
import test.mypac.Zoo.Tiger;

public class MainClass03 {
	public static void main(String[] args) {
		// Zoo 객체를 생성해 참조값 z1 이라는 변수에 담기
		Zoo z1 = new Zoo();
		
		// z1 안에 있는 참조값을 이용해 getMonkey() 메소드를 호출 후 
		// 리턴 값을 m1 이라는 변수에 대입
		Monkey m1= z1.getMonkey();
		
		// 리턴된 Monkey 객체의 say() 메소드 호출
		m1.say();
		
		// Zoo 객체를 생성해 참조값 z2 이라는 변수에 담기
		Zoo z2 = new Zoo();
		
		// z1 안에 있는 참조값을 이용해 getTiger() 메소드를 호출 후 
		// 리턴 값을 t1 이라는 변수에 대입
		Tiger t1= z2.getTiger();
		
		// 리턴된 Tiger 객체의 say() 메소드 호출
		t1.say();
	}
}