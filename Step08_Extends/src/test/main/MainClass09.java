package test.main;

import test.util.MyUtil;

public class MainClass09 {
	public static void main(String[] args) {
		// 상속받은 BaseUtil 클래스에 정의된 static 메소드도 모두 사용 가능
		MyUtil.light();
		MyUtil.clear();
		MyUtil.send();
	}
}