package com.bus.fare.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "bus_model")
public class BusModel {
	@Id
	private Integer id;
	/*
	 * @Size( min = 2, max = 9, message = "Amount shoud not longer 99999999" )
	 */
	private Integer amount;
	@NotNull(message="distance Shoud Not Null")
	private Integer distance;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="studentId",column=@Column(name = "Stu_no")),
		@AttributeOverride(name="studentName",column=@Column(name="stu_name"))
	})
	private  ModelStudent msd;

	public BusModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public ModelStudent getMsd() {
		return msd;
	}

	public void setMsd(ModelStudent msd) {
		this.msd = msd;
	}

	public BusModel(Integer id, Integer amount, Integer distance, ModelStudent msd) {
		super();
		this.id = id;
		this.amount = amount;
		this.distance = distance;
		this.msd = msd;
	}

	@Override
	public String toString() {
		return "BusModel [id=" + id + ", amount=" + amount + ", distance=" + distance + ", msd=" + msd + "]";
	}
}
 

