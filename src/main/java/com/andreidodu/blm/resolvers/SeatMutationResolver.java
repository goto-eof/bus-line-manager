package com.andreidodu.blm.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.Seat;
import com.andreidodu.blm.dto.input.insert.SeatInsertInput;
import com.andreidodu.blm.service.SeatService;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class SeatMutationResolver implements GraphQLMutationResolver {

	@Autowired
	private SeatService service;

	public Seat insertSeat(SeatInsertInput data) {
		return this.service.save(data);
	}

	public Seat updateSeat(Long id, SeatInsertInput data) {
		return this.service.update(id, data);
	}

	public boolean deleteSeat(Long id) {
		return this.service.delete(id);
	}

}
