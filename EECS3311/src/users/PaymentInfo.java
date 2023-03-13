package users;

import java.util.Date;

public class PaymentInfo {
	private int card_number;
	private Date exp_Date;
	private String billing_address;
	private String billing_name;
	private int security_code;
	
	public PaymentInfo(int card_num, Date exp, String address, String name, int code) {
		this.card_number=card_num;
		this.exp_Date=exp;
		this.billing_address=address;
		this.billing_name=name;
		this.security_code=code;
	}
	
	public int getCardNumber() {
		return this.card_number;
	}
	
	//may need to modify method
	public Date getExpiryDate() {
		return this.exp_Date;
	}
	
	public String getBillingAddress() {
		return this.billing_address;
	}
	
	public String getBillingName() {
		return this.billing_name;
	}
	
	public int getSecurityCode() {
		return this.security_code;
	}
	
	
}
