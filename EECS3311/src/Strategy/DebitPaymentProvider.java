package Strategy;

import Payment.PaymentInfo;

public class DebitPaymentProvider extends PaymentProvider {

	@Override
	public boolean handlePayment(double amount, PaymentInfo payment) {
		// TODO Auto-generated method stub
		// perform payment processing using the "Debit" payment method
        System.out.println("Processing payment using Debit Type payment method...");
        double fee = amount*0.05; // add 5% processing fee
        double paymentAmount = amount + fee;
        // check if payment information is valid
        if (payment.getCardNum() <= 0 || payment.getExpDate() == null || payment.getBillingAddress() == null || 
            payment.getBillingName() == null || payment.getSecurityCode() <= 0) {
            System.out.println("Invalid payment information.");
            return false;
        }
     // perform payment processing
        if(paymentAmount <= payment.getCardBallance()) {
        	System.out.println("5% processing fee (" +fee+ "$"+ ") is required!");      	
        	System.out.println("Thanks for paying amount of: "+paymentAmount+ "$ ");
        	double newAmount = payment.getCardBallance() - paymentAmount;
        	payment.setCardBallance(newAmount);
        	System.out.println("Payment successful..." + "\nSee you soon!");
        	return true;
        }else {
        	System.out.println("Payment failed..." + "\nWe are Sorry!");
            return false;
        }
	}

}