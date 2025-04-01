package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Libraryy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lid;
	private String bookname;
	private String author;
	private String Language;

	public Libraryy() {

	}

	public Libraryy(int lid, String bookname, String author, String language) {
		super();
		this.lid = lid;
		this.bookname = bookname;
		this.author = author;
		this.Language = language;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	@Override
	public String toString() {
		return "Libraryy [lid=" + lid + ", bookname=" + bookname + ", author=" + author + ", Language=" + Language
				+ "]";
	}

}
