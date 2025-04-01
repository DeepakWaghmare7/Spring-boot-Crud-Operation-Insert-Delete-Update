package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Libraryy;
import com.tka.service.LibraryyService;

@RestController
public class LibraryController {

	@Autowired
	LibraryyService service;

	@PostMapping("/savedata")
	public String insertData(@RequestBody Libraryy l) {

		String msg = service.insetData(l);
		return msg;

	}

	@DeleteMapping("/deletedata/{lid}")
	public String deleteData(@PathVariable int lid) {
		String msg = service.deleteData(lid);
		return msg;
	}

	@PutMapping("/updatedata/{lid}")
	public String updateData(@RequestBody Libraryy l, @PathVariable int lid) {
		String msg = service.updateData(l, lid);
		return msg;
	}
}
