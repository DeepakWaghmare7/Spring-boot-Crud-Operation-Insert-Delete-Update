package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.LibraryyDao;
import com.tka.entity.Libraryy;

@Service
public class LibraryyService {

	@Autowired
	LibraryyDao dao;

	public String insetData(Libraryy l) {
		String msg = dao.insertData(l);
		return msg;
	}

	public String deleteData(int lid) {
		String msg = dao.deleteData(lid);
		return msg;
	}

	public String updateData(Libraryy l, int lid) {
		String msg = dao.updateData(l, lid);
		return msg;
	}
}
