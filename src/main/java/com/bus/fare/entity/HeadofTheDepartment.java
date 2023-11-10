package com.bus.fare.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name = "hod_table")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="hod",discriminatorType =DiscriminatorType.STRING )
//@DiscriminatorValue("hod_dept")
public class HeadofTheDepartment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer deptId;
	private String hodName;
	private Integer hodContacNum;
	
	public HeadofTheDepartment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getHodName() {
		return hodName;
	}

	public void setHodName(String hodName) {
		this.hodName = hodName;
	}

	public Integer getHodContacNum() {
		return hodContacNum;
	}

	public void setHodContacNum(Integer hodContacNum) {
		this.hodContacNum = hodContacNum;
	}

	@Override
	public String toString() {
		return "HeadofTheDepartment [deptId=" + deptId + ", hodName=" + hodName + ", hodContacNum=" + hodContacNum
				+ "]";
	}
	
}
