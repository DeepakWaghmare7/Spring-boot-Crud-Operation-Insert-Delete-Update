package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Employee;
import com.tka.service.EmployeeService;

@RestController
@RequestMapping("/employeeinfo")
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@PostMapping("/savedata")
	public String insertData(@RequestBody Employee e) {
		String msg = service.insertData(e);
		return msg;
	}
	
	@DeleteMapping("/deletedata/{id}")
	public String deleteData(@PathVariable int id) {
		String msg = service.deleteData(id);
		return msg;
	}
	
	@PutMapping("/updatedata/{id}")
	public String updateData(@RequestBody Employee e, @PathVariable int id ) {
		String msg = service.updateData(e, id);
		return msg;
	} 
}
