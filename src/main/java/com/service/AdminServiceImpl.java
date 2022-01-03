package com.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Repository.AdminRepository;

import com.entity.Admin;

import com.entity.Customer;
import com.entity.TicketBooking;


@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepository AdminRepo;
	@Override
	public Admin addAdmin(Admin admin) {
		AdminRepo.save(admin);
		return admin;	
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		int id=admin.getAdminId();
		Admin c1= AdminRepo.findById(id).orElseThrow();
		AdminRepo.save(c1);
		return admin;
	}

	@Override
	public String deleteAdmin(Admin admin) {
		AdminRepo.delete(admin);
		return "Deleted";
	}

	@Override
	public List<TicketBooking> getAllActivities(int customerId) {		
		Optional<Admin> ls=AdminRepo.findById(customerId);
		return null;
	}

	@Override
	public List<TicketBooking> getAllActivities() {
		List<Admin> lt=AdminRepo.findAll();
		return null;
		
	}

	@Override
	public List<TicketBooking> getActivitiesCustomerwise() {
		// TODO Auto-generated method stub
		List<Admin> lc=AdminRepo.findAll();
		return null;
	}

	@Override
	public List<TicketBooking> getActivitiesDatewise() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
