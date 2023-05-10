package test.main;

import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.MacBook;
import test.mypac.Memory;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * MacBook 객체를 생성해 참조값을 mac1 이라는 지역 변수에 담기
		 * 
		 * MacBook 클래스 수정하지 말 것!!!!!
		 * MainClass03 은 test.main 패키지에 있고 ,
		 * Cpu , Memory , HardDisk , MacBook 클래스는 test.mypac 패키지에 있기에
		 * 4개의 클래스 모두 import 해야 한다.
		 */
		MacBook mac1 = new MacBook(new Cpu() , new Memory() , new HardDisk());
		
		MacBook book2 = new MacBook(null , null , null);
		
		mac1.doGame();
		book2.doGame();
		
		Cpu c = new Cpu();
		Memory m = new Memory();
		HardDisk h = new HardDisk();
		// 생성자의 인자로 전달할 값이 지역변수에 있는 경우 
		// 지역변수를 참조해서 전달 가능
		MacBook book3 = new MacBook(c, m, h);
		
		book3.doGame();
	}
}