package com.Repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Admin;

import com.entity.Customer;
import com.entity.TicketBooking;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

	public Admin insertAdmin(Admin admin);
	public Admin updateAdmin(Admin admin);
	public Admin deleteAdmin(int adminId);
	public List<TicketBooking>getAllActivities(int customerId);
	public List<TicketBooking>getAllActivities();
	public List<TicketBooking>getActivitiesCustomerwise();
	public List<TicketBooking>getActivitiesDatewise();
	public List<TicketBooking>getAllActivitiesForDays(int customerId, LocalDateTime fromDate, LocalDateTime toDate);
	

	

}
