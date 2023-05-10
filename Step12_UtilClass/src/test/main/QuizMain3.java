package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class QuizMain3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("로또 몇 세트를 구매하시겠습니까?: ");
		// 숫자를 입력 받고
		int amount = scan.nextInt();
		// 입력 받은 숫자만큼 출력 
		for(int i = 0; i < amount; i++) {
			printLotto();
			System.out.println(); // 개행
		}
	} // main
	// 로또 번호 한 세트를 콘솔에 출력하는 메소드
	public static void printLotto() {
		// 로또번호 6개 출력
		
				// 무작위 정수를 얻어낼 Random 객체
				Random ran = new Random();
				
				// 로또번호를 저장할 HashSet 객체 생성후 참조값을 Set 인터페이스에 Type 변수에 대입
				Set<Integer> lottoSet = new HashSet<>();
				// 반복문 돌리면서 로또번호 담기
				while(true) {
					// 1 ~ 45 사이의 무작위 난수 얻기 
					int ranNum = ran.nextInt(45)+1;
					// Set 에 대입
					lottoSet.add(ranNum);
					// 만일 6개의 숫자를 얻어내면
					if(lottoSet.size() == 6) {
						break; // 반복문 탈출
					}
				} // while
				//ArrayList 에 대입
				List<Integer> lottoNums = new ArrayList<>(lottoSet);
				
				// Collections 클래스의 Static 메소드를 이용해 숫자를 오름차순으로 정렬
				Collections.sort(lottoNums);
				// Collections.sort(lottoNums , Collections.reverseOrder()); // 내림차순
				
				for(int i = 0; i < lottoNums.size(); i++) {
					System.out.print(lottoNums.get(i));
					if(i != lottoNums.size()-1) {
						System.out.print(" , ");
					}
				}
	}
}