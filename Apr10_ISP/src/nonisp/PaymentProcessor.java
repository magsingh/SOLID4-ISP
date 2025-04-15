package nonisp;

public interface PaymentProcessor {
	void makePayment(double amount);
	void refundPayment(double amount);
	void applyDiscount(double discount);
}

class CreditCard implements PaymentProcessor {
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
		throw new UnsupportedOperationException("No discount available");
		
	}
}

class BankAccount implements PaymentProcessor {
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
		throw new UnsupportedOperationException("No discount available");
		
	}
}

class PayPal implements PaymentProcessor {
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

/* Here we see that CreditCard, BankAccount do not support discount
 * while only PayPal does support discount
 * Therefore, we should segregate the interface.
 */
