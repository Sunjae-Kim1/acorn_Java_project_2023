package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		// 아래의 useRemocon() 메소드를 호출하기 위해 Remocon Interface Type 의 참조값 필요
		// 익명의 Local Inner Class 를 이용해 Remocon Type 의 참조값을 만들어 호출
		// class ? implements Remocon{ } , 익명 클래스
		// class 면 extends , interface 면 implements
		Remocon r1 = new Remocon() {
			@Override
			public void up() {
				System.out.println("소리를 올립니다.");
			}
			@Override
			public void down() {
				System.out.println("소리를 내립니다.");
			}
		};
		useRemocon(r1);
		useRemocon(new Remocon() {
			@Override
			public void up() {
				System.out.println("온도를 올립니다.");
			}
			@Override
			public void down() {
				System.out.println("온도를 내립니다.");
			}
		});
	}

	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}