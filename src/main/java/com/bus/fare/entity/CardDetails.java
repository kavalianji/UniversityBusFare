package com.bus.fare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="card_details")
@PrimaryKeyJoinColumn(name="payer_id")
public class CardDetails extends Payer {

	@Column(name="card_holder")
	private  String card_Holder_Name;
	@Column(name=" Card_date")
	private  Integer exp_Date;
	@Column(name="card")
	private Integer card_Cvv;

	public CardDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CardDetails(String card_Holder_Name, Integer exp_Date, Integer card_Cvv) {
		super();
		this.card_Holder_Name = card_Holder_Name;
		this.exp_Date = exp_Date;
		this.card_Cvv = card_Cvv;
	}
	public String getCard_Holder_Name() {
		return card_Holder_Name;
	}
	public void setCard_Holder_Name(String card_Holder_Name) {
		this.card_Holder_Name = card_Holder_Name;
	}
	public Integer getExp_Date() {
		return exp_Date;
	}
	public void setExp_Date(Integer exp_Date) {
		this.exp_Date = exp_Date;
	}
	public Integer getCard_Cvv() {
		return card_Cvv;
	}
	public void setCard_Cvv(Integer card_Cvv) {
		this.card_Cvv = card_Cvv;
	}
	@Override
	public String toString() {
		return "Card_Details [card_Holder_Name=" + card_Holder_Name + ", exp_Date=" + exp_Date + ", card_Cvv="
				+ card_Cvv + "]";
	}
}
	
	

