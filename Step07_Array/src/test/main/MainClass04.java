package test.main;

import test.mypac.Bike;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 1. Bike 객체를 담을 수 있는 방 3개짜리를 생성해서 참조값을 bikes 라는 지역변수에 담기
		 * 2. 배열의  각각의 방(0 , 1 , 2번) 에 Bike 객체를 생성해 담기
		 * 3. 반복문 for 문을 이용해 순서대로 배열의 각각의 방에 있는 Bike 객체의 ride() 메소드를 호출 
		 */

		Bike[] bikes = new Bike[3];
		
		bikes[0] = new Bike();
		bikes[1] = new Bike();
		bikes[2] = new Bike();
		
		for(int i = 0; i < bikes.length; i++) {
			// i 번째 방에 있던 Bike 객체의 참조값을 얻어서 임시변수 tmp 에 담기
			Bike tmp = bikes[i];
			// 객체의 참조값이 들어있는 tmp 에 ' . ' 찍어서 메소드 호출
			tmp.ride();
		}
		System.out.println("---------- 확장 for 문 사용 시 -----------");
		for(Bike tmp:bikes) {
			tmp.ride();
		}
	}
}