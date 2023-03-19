package paymentStrategy;

public class CreditPaymentProvide extends PaymentProvider {

	@Override
	public boolean handlePayment(PaymentInfo payment, double parkingRate) {
		// TODO Auto-generated method stub
		// perform payment processing using the "Credit" payment method
        System.out.println("Processing payment using Credit Type payment method...");

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
//        if(amount <= payment.getCardBallance()) {
//        	System.out.println("No further processing fee required!");
//        	System.out.println("Thanks for paying amount of: "+amount+ "$ ");
//        	double newAmount = payment.getCardBallance() - amount;
//        	payment.setCardBallance(newAmount);
//        	System.out.println("Payment successful..." + "\nSee you soon!");
//        	return true;
//        }else {
//        	System.out.println("Payment failed..." + "\nWe are Sorry!");
//            return false;
//        }
        
	}

}