package com.bus.fare.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CardDetailsTest {
	public static String card_Holder_Name;
	public static Integer exp_Date;
	public static Integer card_Cvv;
	public static CardDetails carddetails;
	@BeforeEach
	public void setup() {
		carddetails = new CardDetails();
		card_Holder_Name ="ashok";
		exp_Date =12;
		card_Cvv = 768;
	}
	@Test
	void CardDetailstest() {
		new CardDetails();
	}
	
	@Test
	void CardDetailstest1() {
		carddetails =	new CardDetails(card_Holder_Name, exp_Date, card_Cvv);
		assertEquals(card_Holder_Name, carddetails.getCard_Holder_Name());
		assertEquals(exp_Date, carddetails.getExp_Date());
		assertEquals(card_Cvv, carddetails.getCard_Cvv());
	}
	
	@Test
	void getCard_Holder_Nametest() {
		carddetails.setCard_Holder_Name(card_Holder_Name);
		String name = carddetails.getCard_Holder_Name();
		assertEquals(name, card_Holder_Name);
	}
	
	@Test
	void setCard_Holder_Nametest() {
		carddetails.setCard_Holder_Name(card_Holder_Name);
		String name = carddetails.getCard_Holder_Name();
		assertEquals(name, card_Holder_Name);
	}
	
	@Test
	void getExp_Datetest() {
		carddetails.setExp_Date(exp_Date);
		Integer date = carddetails.getExp_Date();
		assertEquals(date, exp_Date);
	}
	
	@Test
	void setExp_Datetest() {
		carddetails.setExp_Date(exp_Date);
		Integer date = carddetails.getExp_Date();
		assertEquals(date, exp_Date);
	}
	
	@Test
	void getCard_Cvvtest() {
		carddetails.setCard_Cvv(card_Cvv);
		Integer cardcvv = carddetails.getCard_Cvv();
		assertEquals(cardcvv, card_Cvv);
	}
	
	@Test
	void setCard_Cvvtest() {
		carddetails.setCard_Cvv(card_Cvv);
		Integer cardcvv = carddetails.getCard_Cvv();
		assertEquals(cardcvv, card_Cvv);
	}
	
	@Test
	void toStringtest() {
		String string = carddetails.toString();
		assertNotEquals(string, carddetails);
	}
	@AfterAll
	public static void end() {
		carddetails = null;
	}
}


