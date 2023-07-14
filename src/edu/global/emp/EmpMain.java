package edu.global.emp;

import java.util.List;

import edu.global.emp.dao.EmpDao;
import edu.global.emp.dto.EmpDto;

public class EmpMain {
	public static void main(String[] args) {
		EmpDao dao = new EmpDao();
		
		List<EmpDto> emps = dao.getEmps();
		
		for (EmpDto emp : emps) {
			System.out.print("사원번호:" + emp.getEmpno());
			System.out.print("사원이름:" + emp.getEname());
			System.out.print("입사일:" + emp.getHiredate());
			System.out.print("직업:" + emp.getJob());
			System.out.print("매니저:" + emp.getMgr());
			System.out.print("월급:" + emp.getSal());
			System.out.print("인센티브:" + emp.getComm());
			System.out.println("부서번호:" + emp.getDeptno());
		}
	}
}