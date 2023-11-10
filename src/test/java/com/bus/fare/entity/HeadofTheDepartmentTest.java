package com.bus.fare.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HeadofTheDepartmentTest {
	public static HeadofTheDepartment headofthedepartment;
	public static Integer deptId;
	public static String hodName;
	public static Integer hodContacNum;
	@BeforeEach
	public void setup() {
		headofthedepartment = new HeadofTheDepartment();
		deptId = 8888;
		hodName = "ramesh";
		hodContacNum = 123344;
	}
	@Test
	void HeadofTheDepartmenttest() {
		new HeadofTheDepartment();
	}
	
	@Test
	void getDeptIdtest() {
		headofthedepartment.setDeptId(deptId);
		Integer deptid = headofthedepartment.getDeptId();
		assertEquals(deptid, deptId);
	}
	
	@Test
	void setDeptIdtest() {
		headofthedepartment.setDeptId(deptId);
		Integer deptid = headofthedepartment.getDeptId();
		assertEquals(deptid, deptId);
	}
	
	@Test
	void getHodNametest() {
		headofthedepartment.setHodName(hodName);
		String hodname = headofthedepartment.getHodName();
		assertEquals(hodname, hodName);	
	}
	
	@Test
	void setHodNametest() {
		headofthedepartment.setHodName(hodName);
		String hodname = headofthedepartment.getHodName();
		assertEquals(hodname, hodName);	
	}
	
	@Test
	void getHodContacNumtest() {
		headofthedepartment.setHodContacNum(hodContacNum);
		Integer hodcontactnum = headofthedepartment.getHodContacNum();
		assertEquals(hodcontactnum, hodContacNum);
	}
	
	@Test
	void setHodContacNumtest() {
		headofthedepartment.setHodContacNum(hodContacNum);
		Integer hodcontactnum = headofthedepartment.getHodContacNum();
		assertEquals(hodcontactnum, hodContacNum);
	}
	
	@Test
	void toStringtest() {
		String string = headofthedepartment.toString();
		assertNotEquals(string, headofthedepartment);
	}
	
	@AfterAll
	public static void end() {
		headofthedepartment = null;
	}
}
