package test.main;

import test.mypac.MyRemocon;
import test.mypac.MyRemocon2;
import test.mypac.Remocon;

public class MainClass02 {
	public static void main(String[] args) {
		// 다형성 확인
		MyRemocon r1 = new MyRemocon();
		Remocon r2 = r1;
		Object r3 = r1;
		
		// 직접 클래스를 test.mypac 에서 만들어 useRemocon() 메소드를 호출
		MyRemocon2 r4 = new MyRemocon2();
		useRemocon(r4);
		
		// 나만의 기능 호출
		r4.reserve();
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
		
		// reserve() 메소드 호출 방법
		MyRemocon2 r4 = (MyRemocon2)r;
		r4.reserve();
	}
}