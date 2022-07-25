package com.andreidodu.blm.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.Booking;
import com.andreidodu.blm.dto.Passenger;
import com.andreidodu.blm.dto.Seat;
import com.andreidodu.blm.service.PassengerService;
import com.andreidodu.blm.service.SeatService;

import graphql.kickstart.tools.GraphQLResolver;

@Component
public class FieldBookingResolver implements GraphQLResolver<Booking> {

	@Autowired
	private SeatService seatService;

	@Autowired
	private PassengerService passengerService;

	public Passenger getPassenger(Booking booking) {
		return this.passengerService.findById(booking.getPassengerId());
	}

	public Seat getSeat(Booking booking) {
		return this.seatService.findById(booking.getSeatId());
	}

}