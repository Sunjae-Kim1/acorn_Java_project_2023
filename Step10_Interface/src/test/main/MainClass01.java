package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
	public static void main(String[] args) {
		// Remocon 인터페이스 Type 의 참조값을 얻을 방법은?
		Remocon r1 = new MyRemocon();
		r1.up();
		r1.down();
		r1.company.toString();
	}
}