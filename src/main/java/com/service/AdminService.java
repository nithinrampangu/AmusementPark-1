package com.service;

import java.util.List;

import com.entity.Admin;
import com.entity.Customer;
import com.entity.TicketBooking;

public interface AdminService {
	public Admin addAdmin(Admin admin);
	public Admin updateAdmin(Admin admin);
	public String deleteAdmin(Admin admin);
	//public Admin deleteAdmin(Admin admin);
	public List<TicketBooking>getAllActivities(int customerId);
	public List<TicketBooking>getAllActivities();
	public List<TicketBooking>getActivitiesCustomerwise();
	public List<TicketBooking>getActivitiesDatewise();
	
	
	
	
	
	
	
}
