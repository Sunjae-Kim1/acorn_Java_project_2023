package test.main;

import test.mypac.MyUtil;

public class MainClass06 {
	public static void main(String[] args) {
		//MyUtil 클래스의 send() 메소드 호출
		MyUtil.send();
		// MyUtil 클래스의  version 필드 참조
		String v = MyUtil.version;
		
		System.out.println("ㅎㅎ");
		// 1970.01.01 자정으로부터 현재까지의 경과 시간을 mili second 단위로 얻는다.
		long time = System.currentTimeMillis();
	}
}