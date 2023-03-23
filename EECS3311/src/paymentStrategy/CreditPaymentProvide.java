package paymentStrategy;

public class CreditPaymentProvide extends PaymentProvider {

	@Override
	public boolean handlePayment(PaymentInfo payment, double parkingRate) {
		
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
        
	}

}
