package com.bus.fare.entity;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
@Embeddable
public class ModelStudent {
	
	private Integer studentId;
	private String  studentName;
	public ModelStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public ModelStudent(Integer studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "ModelStudent [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	
	

}
