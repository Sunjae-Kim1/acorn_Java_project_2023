package test.main;

import java.io.File;
import java.io.FileWriter;

public class MainClass07 {
	public static void main(String[] args) {
		// 파일에 저장할 Sample 문자열
		String msg = "안녕하세요";
		File f = new File("c:/acorn202304/myFolder/diary.txt");
		
		try {
			// 만일 파일이 없으면
			if(!f.exists()) {
				// 파일 생성
				f.createNewFile();
				System.out.println("diary.txt 파일을 생성했습니다.");
			}
			// 파일에 문자열을 출력 가능한 객체의 참조값 얻기
			
			// new FileWriter(file 객체 , append 여부);
			FileWriter fw = new FileWriter(f , true);

			// FileWriter fw = new FileWriter(f);
			fw.write(msg); // 출력할 준비
			fw.flush(); // 출력
			fw.close(); // 마무리
			System.out.println("diary.txt 파일에 문자열을 기록했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}