package org.example.chap2;

public class NoneDiscountPolicy implements DiscountPolicy{

	public Money calculateDiscountAmount(Screening screening) {
		return Money.ZERO;
	}
}
