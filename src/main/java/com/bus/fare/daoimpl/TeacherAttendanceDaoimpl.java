package com.bus.fare.daoimpl;

import javax.validation.Valid;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.fare.controller.TeachersAttendeceRestController;
import com.bus.fare.dao.TeacherAttendanceDao;
import com.bus.fare.entity.EmployeeEntity;
import com.bus.fare.entity.HeadofTheDepartment;
import com.bus.fare.repo.TeacherAtJpaRepository;

@Service
public class TeacherAttendanceDaoimpl implements TeacherAttendanceDao {
	
	org.jboss.logging.Logger log=LoggerFactory.logger(TeachersAttendeceRestController.class.getClass());
	@Autowired
	TeacherAtJpaRepository rep;
	
	@Override
	public String SavebusData(@Valid EmployeeEntity teacher_atendy) {
		// TODO Auto-generated method stub
		return String.valueOf(rep.save(teacher_atendy));
	}

	
	

}
