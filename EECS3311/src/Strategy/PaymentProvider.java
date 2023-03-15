package Strategy;

import Payment.PaymentInfo;
import users.*;

public abstract class PaymentProvider {
	public abstract boolean handlePayment(PaymentInfo payment, double amount);
}