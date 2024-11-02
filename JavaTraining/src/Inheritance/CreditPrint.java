package Inheritance;

import java.util.Date;

class Card {
    private String cardNum;
    private String cardType;
    private String cardName;
    private Date cardExpiryDate;

    public Card(String cardNum, String cardType, String cardName, Date cardExpiryDate) {
        this.cardNum = cardNum;
        this.cardType = cardType;
        this.cardName = cardName;
        this.cardExpiryDate = cardExpiryDate;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public Date getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(Date cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }
}

class CreditCard extends Card {
    private double creditLimit;
    private int rewardPoints;
    private String cardHolderName;
    private double[] purchases;
    private int billingDays;

    public CreditCard(String cardNum, String cardType, String cardName, Date cardExpiryDate, 
                       double creditLimit, int rewardPoints, String cardHolderName, int billingDays) {
        super(cardNum, cardType, cardName, cardExpiryDate);
        this.creditLimit = creditLimit;
        this.rewardPoints = rewardPoints;
        this.cardHolderName = cardHolderName;
        this.purchases = new double[billingDays];
        this.billingDays = billingDays;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    // Business Methods

    public void makePurchase(int day, double amount) {
        if (day >= 0 && day < billingDays && amount <= creditLimit) {
            purchases[day] = amount;
            creditLimit -= amount;
            updateRewardPoints(amount);
        } else {
            System.out.println("Invalid purchase details.");
        }
    }

    public double getAvailableCreditLimit() {
        return creditLimit;
    }

    private void updateRewardPoints(double purchaseAmount) {
        rewardPoints += (int) (purchaseAmount / 10);
    }

    public void claimRewardPoints(int pointsToClaim) {
        if (pointsToClaim <= rewardPoints) {
            rewardPoints -= pointsToClaim;
            System.out.println("Reward points claimed successfully.");
        } else {
            System.out.println("Insufficient reward points.");
        }
    }
}

public class CreditPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CreditCard card = new CreditCard("1234567890123456", "Visa", "My Card", new Date(), 
                 1000.0, 0, "John Doe", 30);

 
        card.makePurchase(5, 200.0);
        card.makePurchase(10, 150.0);

       
        System.out.println("Available Credit Limit: " + card.getAvailableCreditLimit());

       
         card.claimRewardPoints(50);
	}

}
