package com.bus.fare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

/*
 * Table per class concetpt
 * 
 * */
@Data
@Entity
@Table(name="Payer")
@Inheritance(strategy=InheritanceType.JOINED)
public class Payer {

	@Id
	@Column(name="payer_id")
	private Integer student_Id;
	@Column(name="payer_amount")
	private Integer student_Amout;
	@Column(name="lokesh")
	private String student_Name; 

	public Payer(Integer student_Id, Integer student_Amout, String student_Name) {
		super();
		this.student_Id = student_Id;
		this.student_Amout = student_Amout;
		this.student_Name = student_Name;
	}

	public Integer getStudent_Id() {
		return student_Id;
	}

	public void setStudent_Id(Integer student_Id) {
		this.student_Id = student_Id;
	}

	public Integer getStudent_Amout() {
		return student_Amout;
	}

	public void setStudent_Amout(Integer student_Amout) {
		this.student_Amout = student_Amout;
	}

	public String getStudent_Name() {
		return student_Name;
	}

	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}

	public Payer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Payer [student_Id=" + student_Id + ", student_Amout=" + student_Amout + ", student_Name=" + student_Name
				+ "]";
	}
	
}












