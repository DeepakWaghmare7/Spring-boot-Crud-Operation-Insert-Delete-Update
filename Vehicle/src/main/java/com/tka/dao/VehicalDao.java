package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Vehical;

@Repository
public class VehicalDao {

	@Autowired
	SessionFactory factory;

	public String insertData(Vehical v) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		ss.persist(v);
		tr.commit();
		ss.close();
		return "Data Is Inserted...";
	}

	public String deleteData(int id) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		Vehical v = ss.get(Vehical.class, id);
		ss.remove(v);
		tr.commit();
		ss.close();

		return "Data Is Deleted...";

	}

	public String updateData(Vehical v, int id) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		Vehical v1 = ss.get(Vehical.class, id);
		v1.setVname(v1.getVname());
		v1.setType(v1.getType());
		v1.setColor(v1.getColor());
		ss.merge(v1);
		tr.commit();
		ss.close();
		return "Data Update Sucessfully...";

	}
}
