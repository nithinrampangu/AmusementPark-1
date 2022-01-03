package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Admin;
import com.service.AdminService;
@RestController
@RequestMapping(path="/api")
public class AdminController {
	private AdminService adminservice;
	
	@PostMapping("/insertAdmin")
	public ResponseEntity<Admin> insertAdmin(@RequestBody Admin c)
	{
		Admin c1=adminservice.addAdmin(c);
		ResponseEntity re=new ResponseEntity<Admin>(c1,HttpStatus.OK);
		return re;
	}
	@PutMapping(path="/updateAdmin")
	public ResponseEntity<Admin> updateCoder(@RequestBody Admin e) throws Throwable
	{
		Admin e1=adminservice.updateAdmin(e);
		
		ResponseEntity re=new ResponseEntity<Admin>(e1,HttpStatus.OK);
		return re;
	}
	
	@DeleteMapping(path="/deleteAdmin")
	public ResponseEntity<String> deleteCoder(@RequestBody Admin e)
	{
		adminservice.deleteAdmin(e);
		ResponseEntity re=new ResponseEntity<String>("Deleted",HttpStatus.OK);
		return re;
	}

}
