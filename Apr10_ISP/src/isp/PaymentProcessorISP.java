package isp;


public interface PaymentProcessorISP {
	void makePayment(double amount);
	void refundPayment(double amount);
}

interface Discount {
	void applyDiscount(double discount);
}

class CreditCard implements PaymentProcessorISP {
	@Override
	public void makePayment(double amount) {
		System.out.println("Payment successful: " + amount);
		
	}
	@Override
	public void refundPayment(double amount) {
		System.out.println("Refund successful: " + amount);
		
	}
}

class BankAccount implements PaymentProcessorISP {
	@Override
	public void makePayment(double amount) {
		System.out.println("Payment successful: " + amount);
		
	}
	@Override
	public void refundPayment(double amount) {
		System.out.println("Refund successful: " + amount);
		
	}
}

class PayPal implements PaymentProcessorISP, Discount {
	@Override
	public void makePayment(double amount) {
		System.out.println("Payment successful: " + amount);
		
	}
	@Override
	public void refundPayment(double amount) {
		System.out.println("Refund successful: " + amount);
		
	}
	@Override
	public void applyDiscount(double discount) {
		System.out.println("Discount applied: " + discount);
	}
}

/* We have moved out the non-common method to a separate interface based upon ISP (Interface Segregation Principle)
 * Also, ISP promoted less coupling. Eg: if discount method also had couponCode parameter then in the nonISP implementation,
 * it required to change all 3 classes but in ISP implementation, only one class (i.e PayPal) needs to be changed
 */