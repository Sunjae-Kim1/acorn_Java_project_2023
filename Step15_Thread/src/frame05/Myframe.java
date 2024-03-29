package frame05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import test.mypac.CountRunnable;
/*
 * 일괄 import 하는 방법 ctrl + shift + o
 */

public class Myframe extends JFrame implements ActionListener{
	public Myframe(String title) {
		super(title);
		//프레임의 초기 설정 작업하기 
	    setBounds(100, 100, 500, 500);
	    // 이프레임(MyFrame)의 x 버튼 (close 버튼) 을 눌렀을때 프로세스도 같이 종료 되도록 설정 
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //레이아웃 설정
	    setLayout(new FlowLayout());
	      
	    JButton startBtn=new JButton("카운트 다운");
	    startBtn.addActionListener(this);
	    //프레임에 버튼 추가
	    add(startBtn);
	      
	    JTextField tf=new JTextField(10);
	    //프레임에 JTextField 추가
	    add(tf);
	      
	    // 프레임을 화면상에 실제 보이게 하기( false 하면 화면에 보이지 않는다 )
	    setVisible(true);
	    }
	
	@Override
	public void actionPerformed(ActionEvent e2) {
		
//		new Thread(new Runnable() {
//	         @Override
//	         public void run() {
//	            //카운트 값을 저장할 지역변수 만들고 초기 값 대입
//	            int count=10;
//	            //반복문 돌면서 
//	            while(true) {
//	               System.out.println("현재 count:"+count);
//	               if(count==0) {//만일 카운트가 0 이면 
//	                  break;//반복문 탈출
//	               }
//	               //1초 마다
//	               try {
//	                  Thread.sleep(1000);
//	               } catch (InterruptedException e) {
//	                  e.printStackTrace();
//	               }
//	               //카운트를 1씩 감소 시키고 
//	               count--;
//	            }
//	         }
//	      }).start();
		
//		new Thread() {
//			public void run() {
//				// 카운트 값을 저장할 지역변수 만들고 초기값 대입
//				int count = 10;
//				// 반복문 돌면서
//				while(true) {
//					System.out.println("현재 count:" + count);
//					if(count == 0) { // 카운트가 0 이면
//						break; // 반복문 탈출
//					}
//					// 1 초마다
//					try {
//						Thread.sleep(1000);
//					}catch(InterruptedException e) {
//						e.printStackTrace();
//					}
//					// 카운트를 1씩 감소
//					count--;
//				}
//			}
//		}.start();
		
		
		new Thread(new Runnable() {
			@Override
			public void run() {

			}
		}).start();
		
		new Thread(()->{}).start();
	}
	//run 실행 시 app 이 시작되는 특별한 main 메소드
	public static void main(String[] args) {
		new Myframe("나의 프레임");
	}
}