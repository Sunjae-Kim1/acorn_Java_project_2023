package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			@Override
			public void hole() {
				System.out.println("바닥을 구멍냅니다.");
			}
		}); // Drill Type 참조값
		
		useDrill(()->{ // 위의 오버라이드 줄인 표현 , 추상 메소드가 1개인 Interface에 한해서
			System.out.println("천장에 구멍냅니다.");
		});
	}
	
	public static void useDrill(Drill d) {
		d.hole();
		d.hole();
	}
}