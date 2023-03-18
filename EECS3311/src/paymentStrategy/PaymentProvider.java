package paymentStrategy;

import users.*;

public abstract class PaymentProvider {
	public abstract boolean handlePayment(PaymentInfo payment, double parkingRate);
}