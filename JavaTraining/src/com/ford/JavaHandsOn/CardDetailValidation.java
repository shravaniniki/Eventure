package com.ford.JavaHandsOn;

import java.time.LocalDate;

class Card{
	private int cardNo;
	private String cardType;
	private int creditLimitAmount;
	private LocalDate dateOfExpiry;
	
	
	public Card(int cardNo, String cardType, int creditLimitAmount,LocalDate currentDate) {
		// TODO Auto-generated constructor stub
		this.cardNo=cardNo;
		this.setCardType(cardType);
		this.creditLimitAmount=creditLimitAmount;
		dateOfExpiry=currentDate;
	}
	public void cardType(String cardType) {
		
		
	}
	public LocalDate getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(LocalDate dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public int getCreditLimitAmount() {
		return creditLimitAmount;
	}
	public void setCreditLimitAmount(int creditLimitAmount) {
		this.creditLimitAmount = creditLimitAmount;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	
	
}
public class CardDetailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate currentDate=LocalDate.now();
		Card c1=new Card(123,"Debit card",12000,currentDate);
	
 
		

	}

	

}
