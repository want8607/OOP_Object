package org.example.chap3;

import java.time.LocalDateTime;

public class Screening {
	
	private Movie movie;
	private int sequence;
	private LocalDateTime whenScreened;
	
	public Reservation reserve(Customer customer, int audienceCount{
		return new Reservation(customer,this,calculateFee(audienceCount),audienceCount);
	}
	
	private Money calculateFee(int audienceCount) {
		return movie.calculateMovieFee(this).times(audienceCount);
	}
}
