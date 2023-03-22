package paymentStrategy;

public class Context {
	
	private PaymentProvider provider;
	
	public Context(PaymentProvider provider) {
		this.provider = provider;
	}
	
	public boolean execute(PaymentInfo info, double d) {
		return provider.handlePayment(info, d);
	}

}
