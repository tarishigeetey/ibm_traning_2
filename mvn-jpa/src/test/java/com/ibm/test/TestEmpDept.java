// UniDirectional
package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.EmpDeptDao;
import com.ibm.entity.Department;
import com.ibm.entity.Employee;

public class TestEmpDept {
	
	private static EmpDeptDao dao ;
	
	@BeforeAll
	public static void init(){
		dao = new EmpDeptDao();
	}
	
	@Test
	public void testAddDept() {
		Department dept = new Department();
		dept.setDeptId(12);
		dept.setDeptName("cD");

		assertEquals(12, dao.addDept(dept));
		System.out.println(dept);
		
		
	}
	
	@Test
	public void testAddEmp() {
		Employee e = new Employee();
		e.setEmpName("BlackBuck");
		e.setSalary(100000);
		assertNotEquals(0, dao.addEmp(e, 12));
		System.out.println(e);
	}
	
	@Test
	public void testFindDept() {
		Department dept = dao.findDept(12);
		assertNotNull(dept);
		System.out.println(dept);
		dept.getEmps().forEach(System.out::println);
	}
	
	@Test
	public void testRemoveDept() {
		assertTrue(dao.removeDept(12));
	}

}
