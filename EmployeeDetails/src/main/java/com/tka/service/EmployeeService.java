package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.EmployeeDao;
import com.tka.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;

	public String insertData(Employee e) {
		String msg = dao.insertData(e);
		return msg;
	}
	
	public String deleteData(int id) {
		String msg = dao.deleteData(id);
		return msg;
	}
	
	public String updateData(Employee e , int id) {
		String msg = dao.updateData(e, id);
		return msg;
	}
}
