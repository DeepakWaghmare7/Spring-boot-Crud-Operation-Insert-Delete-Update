package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.VehicalDao;
import com.tka.entity.Vehical;

@Service
public class VehicalService {

	@Autowired
	VehicalDao dao;

	public String insertData(Vehical v) {
		String msg = dao.insertData(v);
		return msg;
	}

	public String deleteData(int id) {
		String msg = dao.deleteData(id);
		return msg;
	}

	public String updateData(Vehical v, int id) {
		String msg = dao.updateData(v, id);
		return msg;
	}
}
