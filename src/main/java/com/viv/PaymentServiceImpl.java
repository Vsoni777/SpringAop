package com.viv;




public class PaymentServiceImpl implements PaymentService {

	@SuppressWarnings("unused")
	@Override
	public void makepayment() {
		System.out.println("Amount Debited");
		if(true) {
			throw new RuntimeException("payment failed");
		}
		System.out.println("Amount credited");
	}

}
