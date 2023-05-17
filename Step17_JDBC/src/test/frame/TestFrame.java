package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class TestFrame extends JFrame implements ActionListener{
	// 필드 정의
	JTextField inputName , inputAddr;
	DefaultTableModel model;
	
	// 생성자
	public TestFrame(String title) {
		super(title);
		
		// 레이아웃 매니저 설정
		setLayout(new BorderLayout());
		
		JLabel label1 = new JLabel("이름");
		inputName = new JTextField(10);
		
		JLabel label2 = new JLabel("주소");
		inputAddr = new JTextField(10);
		
		JButton addBtn = new JButton("추가");
		addBtn.setActionCommand("add");
		addBtn.addActionListener(this);
		
		// 패널에 UI 배치
		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(inputName);
		panel.add(label2);
		panel.add(inputAddr);
		panel.add(addBtn);
		
		
		// 패널 전부를 프레임의 북쪽에 배치
		add(panel , BorderLayout.NORTH);
		
		panel.setBackground(Color.yellow);
		
		JTable table = new JTable();
		
		String[] colNames = {"번호" , "이름" , "주소"};
		// 테이블에 연결할 모델 객체 생성
		model = new DefaultTableModel(colNames , 0);
		// 모델을 테이블에 연결
		table.setModel(model);
		// 스크롤이 기능하도록 테이블을 JScrollPane 에 감싼다.
		JScrollPane pane = new JScrollPane(table);
		// JScrollPane 을 프레임의 가운데에 배치
		add(pane , BorderLayout.CENTER);
		
//		// 테이블에 출력할 sample 데이터
//		Object[] row1 = {1 , "김구라" , "노량진"};
//		Object[] row2 = {2 , "해골" , "행신동"};
//		Object[] row3 = {3 , "원숭이" , "상도동"};
//		
//		model.addRow(row1);
//		model.addRow(row2);
//		model.addRow(row3);
		
		// 회원목록 얻기
		List<MemberDto> list = new MemberDao().getList();
		for(MemberDto tmp:list) {
			Object[] row = {tmp.getNum() , tmp.getName() , tmp.getAddr()};
			model.addRow(row);
		}
		
		// 부모 객체의 메소드를 마음대로 호출 가능 , this 생략 가능
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		this.setBounds(100 , 100 , 800 , 500);
//		this.setVisible(true);
	}
	public static void main(String[] args) {
		TestFrame tf = new TestFrame("테스트 프레임");
		tf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		tf.setBounds(100 , 100 , 800 , 500);
		tf.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("add")) { // 추가 버튼 누를 시
			// 입력한 이름과 주소를 읽어서
			String name = inputName.getText();
			String addr = inputAddr.getText();
			
			// MemberDto 객체에 담고
			MemberDto dto = new MemberDto();
			dto.setName(name);
			dto.setAddr(addr);
			
			// MemberDao 객체의 insert() 메소드를 이용해 DB 에 저장해
			boolean isSuccess = new MemberDao().insert(dto);
			
			// 저장 성공 시 "저장했습니다." 알림
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, "저장했습니다.");
				
				model.setRowCount(0);

				// 회원목록 얻기
				List<MemberDto> list = new MemberDao().getList();
				for(MemberDto tmp:list) {
					Object[] row = {tmp.getNum() , tmp.getName() , tmp.getAddr()};
					model.addRow(row);
				}
			}
		}
	}
}