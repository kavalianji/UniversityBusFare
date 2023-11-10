package com.bus.fare.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bus.fare.dao.TeacherAttendanceDao;
import com.bus.fare.entity.EmployeeEntity;
import com.bus.fare.entity.HeadofTheDepartment;

@RestController
//@RequestMapping(value = "attendence",consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
@RequestMapping("/attendence")
public class TeachersAttendeceRestController {
	Logger log = LoggerFactory.getLogger(this.getClass());
	String TAG = "TeachersAttendeceRestController";
	HeadofTheDepartment hod=new HeadofTheDepartment();
	
	@Autowired
	TeacherAttendanceDao tad;
	
	@PostMapping("/create_teacher_Attendance")
	public ResponseEntity<String> newteaher(@Valid @RequestBody EmployeeEntity Teacher_atendy, BindingResult results)  {
		log.info(TAG);
		String saveWithHod = tad.SavebusData(Teacher_atendy);
		 return new ResponseEntity<String>("Teacher Attendance with "+saveWithHod+" Successfully",HttpStatus.OK);

	}

}
