package Strategy;

import Payment.PaymentInfo;

public class Context {
	
	private PaymentProvider provider;
	
	public Context(PaymentProvider provider) {
		this.provider = provider;
	}
	
	public boolean execute(PaymentInfo info) {
		return provider.handlePayment(info);
	}

}
