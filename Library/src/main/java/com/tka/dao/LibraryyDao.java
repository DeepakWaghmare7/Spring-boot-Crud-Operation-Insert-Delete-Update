package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Libraryy;

@Repository
public class LibraryyDao {

	@Autowired
	SessionFactory factory;

	public String insertData(Libraryy l) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		ss.persist(l);
		tr.commit();
		ss.close();
		return "Data is Inserted...";
	}

	public String deleteData(int lid) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		Libraryy l = ss.get(Libraryy.class, lid);
		ss.remove(l);
		tr.commit();
		ss.close();

		return "Data Is Deleted...";

	}

	public String updateData(Libraryy l, int lid) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		Libraryy l1 = ss.get(Libraryy.class, lid);
		l1.setBookname(l1.getBookname());
		l1.setAuthor(l1.getAuthor());
		l1.setLanguage(l1.getLanguage());
		ss.merge(l1);
		tr.commit();
		ss.close();
		return "Data Update Sucessfully...";

	}
}
