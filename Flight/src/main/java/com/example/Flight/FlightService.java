package com.example.Flight;

import org.springframework.stereotype.Service;

@Service
public class FlightService {
	void saveFlightBooking(Flight flight) {
		System.out.println(flight);
	}
}
