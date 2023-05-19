package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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

import test.dao.DeptDao;
import test.dto.DeptDto;

public class Example01 extends JFrame implements ActionListener{
	
	JTextField jtf1 , jtf2;
	DefaultTableModel model;
	JTable table;

	public Example01(String title) {
		super(title);
		
		// 레이아웃 매니저 설정
		setLayout(new BorderLayout());
		
		JLabel jl1 = new JLabel("직업");
		jtf1 = new JTextField(10);
		JLabel jl2 = new JLabel("주소");
		jtf2 = new JTextField(10);
		
		JButton jbtn1 = new JButton("추가");
		JButton jbtn2 = new JButton("수정");
		JButton jbtn3 = new JButton("삭제");
		
		JPanel jp = new JPanel();
		jp.add(jl1);
		jp.add(jtf1);
		jp.add(jl2);
		jp.add(jtf2);
		
		jp.add(jbtn1);
		jp.add(jbtn2);
		jp.add(jbtn3);
		
		jbtn1.addActionListener(this);
		jbtn1.setActionCommand("insert");
		jbtn2.addActionListener(this);
		jbtn2.setActionCommand("update");
		jbtn3.addActionListener(this);
		jbtn3.setActionCommand("delete");
		
		add(jp , BorderLayout.NORTH);
		
		jp.setBackground(Color.CYAN);
		
		table = new JTable();
		
		String[] colNames = {"번호" , "직업" , "주소"};
		// 테이블에 연결할 모델 객체 생성
		model = new DefaultTableModel(colNames , 0);
		// 모델을 테이블에 연결
		table.setModel(model);
		// 스크롤이 기능하도록 테이블을 JScrollPane 에 감싼다.
		JScrollPane scroll = new JScrollPane(table);
		// JScrollPane 을 프레임의 가운데에 배치
		add(scroll , BorderLayout.CENTER);
		
		displayMember();
		
	}
	public static void main(String[] args) {
		Example01 ex = new Example01("테스트 중");
		ex.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ex.setBounds(100 , 100 , 800 , 500);
		ex.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("insert")) { // 추가 버튼 누를 시
			// 입력한 이름과 주소를 읽어서
			String dName = jtf1.getText();
			String loc = jtf2.getText();
			
			// DeptDto 객체에 담고
			DeptDto dto = new DeptDto();
			dto.setdName(dName);
			dto.setLoc(loc);
			
			int[] listNum = null;
			int count = 0;
			List<DeptDto> list = new DeptDao().getList();
			
			for(DeptDto tmp:list) {
				Object[] row = {tmp.getDeptNo() , tmp.getdName() , tmp.getLoc()};
					listNum[count] = tmp.getDeptNo();
					count++;
			}
			
			// DeptDao 객체의 insert() 메소드를 이용해 DB 에 저장해
			boolean isSuccess = new DeptDao().insert(dto);
			
			// 저장 성공 시 "저장했습니다." 알림
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, "저장했습니다.");
				
				displayMember();
			}
		} // if cmd
		else if(cmd.equals("update")) {
			// JTable 으로부터 선택한 row 의 인덱스 얻기
			int selectedRow = table.getSelectedRow();
			// 입력한 이름과 주소를 읽어서
				String dName = jtf1.getText();
				String loc = jtf2.getText();
						
				// DeptDto 객체에 담고
				DeptDto dto = new DeptDto();
				dto.setdName(dName);
				dto.setLoc(loc);
			
			if(selectedRow == -1) { // 선택한 행이 없는 경우
				JOptionPane.showMessageDialog(this, "수정할 행을 선택해주세요.");
				return;
			}
			
			int choose = JOptionPane.showConfirmDialog(this, "수정하시겠습니까?");
			
			if(choose==JOptionPane.YES_OPTION) {
				// 선택한 행의 회원 번호 얻기
				int result = (int) model.getValueAt(selectedRow, 0);
				dto.setDeptNo(result);
				
				new DeptDao().update(dto);
				JOptionPane.showMessageDialog(this, "수정했습니다.");
			}else if(choose==JOptionPane.NO_OPTION){
				JOptionPane.showMessageDialog(this, "수정를 취소했습니다.");
			}
			displayMember();
		}
		else if(cmd.equals("delete")) {
			// JTable 으로부터 선택한 row 의 인덱스 얻기
			int selectedRow = table.getSelectedRow();
			if(selectedRow == -1) { // 선택한 행이 없는 경우
				JOptionPane.showMessageDialog(this, "삭제할 행을 선택해주세요.");
				return;
			}
			
			int choose = JOptionPane.showConfirmDialog(this, "삭제하시겠습니까?");
			
			if(choose==JOptionPane.YES_OPTION) {
				// 선택한 행의 회원 번호 얻기
				int result = (int)model.getValueAt(selectedRow, 0);
				new DeptDao().delete(result);
				JOptionPane.showMessageDialog(this, "삭제했습니다.");
			}else if(choose==JOptionPane.NO_OPTION){
				JOptionPane.showMessageDialog(this, "삭제를 취소했습니다.");
			}
			displayMember();
		}
	}
		
		// TestFrame 메소드 추가
		public void displayMember() {
			// 기존에 출력된 내용을 모두 삭제후 다시 출력
			model.setRowCount(0);

			// 회원목록 얻기
			List<DeptDto> list = new DeptDao().getList();
			for(DeptDto tmp:list) {
				Object[] row = {tmp.getDeptNo() , tmp.getdName() , tmp.getLoc()};
				model.addRow(row);
			}
		}
}
