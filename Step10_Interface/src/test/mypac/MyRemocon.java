package test.mypac;
/*
 * Interface 를 implements 하면 Interface 에 정의되어 있는
 * 모든 추상 메소드를 오버라이드 해야한다. ( = 강제 )
 */
public class MyRemocon implements Remocon{ // extends Object
	// 생성자 ( = public MyRemocon(){ } ) 존재
	@Override
	public void up() {
		System.out.println("채널을 올립니다.");
	}

	@Override
	public void down() {
		System.out.println("채널을 내립니다.");
	}
}
