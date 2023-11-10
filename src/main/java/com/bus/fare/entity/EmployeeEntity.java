package com.bus.fare.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="emp_table")
public class EmployeeEntity extends HeadofTheDepartment{
	
	@Column(name="empid")
	private Integer empId;
	@Column(name="empname")
	private String empName;
	private Integer empContacNo;
	@Column(name="emplocation")
	private String empLocation;
	
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpContacNo() {
		return empContacNo;
	}

	public void setEmpContacNo(Integer empContacNo) {
		this.empContacNo = empContacNo;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [empId=" + empId + ", empName=" + empName + ", empContacNo=" + empContacNo
				+ ", empLocation=" + empLocation + "]";
	}
	
}
