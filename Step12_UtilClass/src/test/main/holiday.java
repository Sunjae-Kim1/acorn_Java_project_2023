package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class holiday {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> result = new ArrayList<>();
		
		System.out.print("로또를 몇 개 구입하시겠습니까? : ");
		int count = scan.nextInt();
		String result2 = null;
		
		for(int i = 0; i < count; i++) { // 입력 수만큼 돌린다.
			Random ranNum = new Random();
			result.clear();
			for(int j = 0; j < 6; j++) { // 6번 돌려
				result.add(ranNum.nextInt(51)); // 무작위 정수 6개를 배열에 대입
						System.out.print(result.get(j) + " , ");
						result2 = result.get(j) + " , ";
					}
			String arr =result2.substring(0 , result2.length()-1);
			System.out.println(arr);
			System.out.println();
				}
			System.out.println();
		}
	}