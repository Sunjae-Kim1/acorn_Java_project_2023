package test.main;

import java.util.List;

import test.dao.DeptDao;
import test.dto.DeptDto;

public class Example00 {
	public static void main(String[] args) {
		int deptNo = 1;
		String dName = "김구라";
		String loc = "강남";
		
		DeptDto dto = new DeptDto();
		dto.setDeptNo(deptNo);
		dto.setdName(dName);
		dto.setLoc(loc);
		
		DeptDao dao = new DeptDao();
		boolean isSucdess = dao.insert(dto);
		
		if(isSucdess)
			System.out.println("저장했습니다.");
		
///////////////////////////////////////////////////////////
		
		List<DeptDto> list = new DeptDao().getList();
		
		for(DeptDto tmp:list) {
			System.out.println(tmp.getDeptNo() + " | " + tmp.getdName() + " | " + tmp.getLoc());
		}
	}
}