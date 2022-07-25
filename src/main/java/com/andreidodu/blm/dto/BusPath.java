package com.andreidodu.blm.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusPath {

	private Long id;
	private BusLine busLine;
	private Date pathDate;
}
