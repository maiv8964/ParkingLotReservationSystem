package paymentStrategy;

import java.util.Date;

public class PaymentInfo {
    private int cardNum;
    private int expDate;
    private String billingAddress;
    private String billingName;
    private int securityCode;
    private double cardBallance;

    
	public PaymentInfo(int cardNum, int expDate, String billingAddress, String billingName, int securityCode) {
        this.cardNum = cardNum;
        this.expDate = expDate;
        this.billingAddress = billingAddress;
        this.billingName = billingName;
        this.securityCode = securityCode;
    }
	
	public double getCardBallance() {
		return cardBallance;
	}

	public void setCardBallance(double cardBallance) {
		this.cardBallance = cardBallance;
	}


    public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}

	public int getExpDate() {
		return expDate;
	}

	public void setExpDate(int expDate) {
		this.expDate = expDate;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getBillingName() {
		return billingName;
	}

	public void setBillingName(String billingName) {
		this.billingName = billingName;
	}

	public int getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}

	public void parkingInfo(int cardNum, Date expDate, String billingAddress, String billingName, int securityCode) {
        // Save parking info to database or send to other system
        System.out.println("Parking info saved!");
    }
}