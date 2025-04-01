package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	SessionFactory factory;

	public String insertData(Employee e) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		ss.persist(e);
		tr.commit();
		ss.close();
		return "Data is inserted...";
	}

	public String deleteData(int id) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		Employee e = ss.get(Employee.class, id);
		ss.remove(e);
		tr.commit();
		ss.close();

		return "Data Is Deleted...";

	}

	public String updateData(Employee e, int id) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		Employee e1 = ss.get(Employee.class, id);
		e1.setName(e1.getName());
		e1.setSalary(e1.getSalary());
		e1.setRole(e1.getRole());
		ss.merge(e1);
		tr.commit();
		ss.close();
		return "Data Update Sucessfully...";

	}
}
