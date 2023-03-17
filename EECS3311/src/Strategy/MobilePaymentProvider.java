package Strategy;

import Payment.PaymentInfo;

public class MobilePaymentProvider extends PaymentProvider {

	@Override
	public boolean handlePayment(PaymentInfo payment) {
		// TODO Auto-generated method stub
		// perform payment processing using the "Mobile" payment method
        System.out.println("Processing payment using Mobile Type payment method...");
//        double fee = amount*0.02; // add 2% processing fee
//        double paymentAmount = amount + fee;
        // check if payment information is valid
        if (payment.getCardNum() <= 0 || payment.getExpDate() == 0 || payment.getBillingAddress() == null || 
            payment.getBillingName() == null || payment.getSecurityCode() <= 0) {
            System.out.println("Invalid payment information.");
            return false;
        }else {
        	System.out.println("Payment success.");
        	return true;
        }
//     // perform payment processing
//        if(paymentAmount <= payment.getCardBallance()) {
//        	System.out.println("2% processing fee (" +fee+ "$"+ ") is required!");      	
//        	System.out.println("Thanks for paying amount of: "+paymentAmount+ "$ ");
//        	double newAmount = payment.getCardBallance() - paymentAmount;
//        	payment.setCardBallance(newAmount);
//        	System.out.println("Payment successful..." + "\nSee you soon!");
//        	return true;
//        }else {
//        	System.out.println("Payment failed..." + "\nWe are Sorry!");
//            return false;
//        }
	}

}
