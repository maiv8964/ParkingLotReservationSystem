package Strategy;

import Payment.PaymentInfo;

public abstract class PaymentProvider {
	public abstract boolean handlePayment(double amount, PaymentInfo payment);
}