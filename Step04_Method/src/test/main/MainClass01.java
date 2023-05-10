package test.main;

import java.io.File;
import test.mypac.Airplane;
import test.mypac.Test;

public class MainClass01 {
	public static void main(String[] args) {
		Test t = new Test();
		t.walk(); // 리턴 타입이 void 라서 호출만 가능
		
		// 리턴 타입이 int 라서 호출 후 a 값에 int 타입 지역변수에 담기 
		int a = t.getNumber(); 
		// 리턴 타입이 Stirng 라서 호출 후 b 값에 String 타입 지역변수에 담기 
		String b = t.getGreeting();
		// 리턴 타입이 Airplane 라서 호출 후 c 값에 Airplane 타입 지역변수에 담기
		Airplane c = t.getPlane();
		c.fly();
		
		// 위에서 생성한 객체의 setNum() 메소드를 호출
		t.setNum(999);
		// 위에서 생성한 객체의 setName() 메소드를 호출
		t.setName("김구라");
		// 위에서 생성한 객체의 setPlane() 메소드를 호출
		t.setPlane(new Airplane());
		
		new File("C:/xxx/xxx/xxx.txt").delete();
		
		System.out.println("main 메소드 종료합니다.");
		
		t.send();
		t.send(999);
		t.send("해골");
		t.send(new Airplane());
	}
}