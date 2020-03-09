package com.bridgelabz.loosecoupling;

public class Student {
	private Book book;

	public void setBook(Book book) {
		this.book = book;
	}
	
	public void reading() {
		book.book();
	}
}
