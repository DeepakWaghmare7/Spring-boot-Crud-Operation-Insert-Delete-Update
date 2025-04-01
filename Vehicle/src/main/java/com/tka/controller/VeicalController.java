package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Vehical;
import com.tka.service.VehicalService;

@RestController
public class VeicalController {

	@Autowired
	VehicalService service;

	@PostMapping("/savedata")
	public String insertData(@RequestBody Vehical v) {
		String msg = service.insertData(v);
		return msg;
	}

	@DeleteMapping("/deletedata/{id}")
	public String deleteData(@PathVariable int id) {
		String msg = service.deleteData(id);
		return msg;
	}

	@PutMapping("/updatedata/{id}")
	public String updateData(@RequestBody Vehical v, @PathVariable int id) {
		String msg = service.updateData(v, id);
		return msg;
	}
}
