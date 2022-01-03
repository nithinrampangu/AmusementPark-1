package com.Repository;

import java.util.List;

import com.entity.Customer;
import com.entity.TicketBooking;

public interface TicketBookingRepository {
	
	List<TicketBooking> findAll();

}
