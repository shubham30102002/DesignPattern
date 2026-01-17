package com.learn.designPattern.strategy;

interface PaymentStrategy {
	void pay();
}

class CreditCardPay implements PaymentStrategy {

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Payment done using Credit card");
	}

}

class NetBankingPayment implements PaymentStrategy {

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Payment done using Net Banking");
	}

}

class UPIPay implements PaymentStrategy {

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Payment done using UPI");
	}

}

class PaymentService {
	private PaymentStrategy paymentStrategy;

	public PaymentService(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public void doPayment() {
		paymentStrategy.pay();
	}

}

public class StrategyDesignPattern2 {
	public static void main(String[] args) {
		PaymentService upiService = new PaymentService(new UPIPay());
		upiService.doPayment();
	}
}
