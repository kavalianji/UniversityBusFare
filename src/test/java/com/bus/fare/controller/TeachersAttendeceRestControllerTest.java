package com.bus.fare.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;

import com.bus.fare.dao.TeacherAttendanceDao;
import com.bus.fare.entity.EmployeeEntity;

class TeachersAttendeceRestControllerTest {
	TeachersAttendeceRestController teacherattendecerestcontroller = new TeachersAttendeceRestController();
	EmployeeEntity employeeentity = new EmployeeEntity();
	BindingResult result;
	TeacherAttendanceDao tad;
	 @Mock TeacherAttendanceDao teacherattendancedao;
	@BeforeEach
	public void setup() {
		result = mock(BindingResult.class);
		tad = mock(TeacherAttendanceDao.class); 
	}
	
	@Test
	void newteahertest() {
		employeeentity.setEmpId(2002);
		employeeentity.setEmpName("anupama");
		employeeentity.setEmpContacNo(12344444);
		employeeentity.setEmpLocation("hyd");
		teacherattendecerestcontroller.newteaher(employeeentity, result);
	}

}
