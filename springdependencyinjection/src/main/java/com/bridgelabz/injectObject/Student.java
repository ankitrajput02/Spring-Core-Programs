package com.bridgelabz.injectObject;

public class Student {
	private int id;
	private Library library;

	public void setId(int id) {
		this.id = id;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	public void reading() {
		library.library();
		System.out.println("Student Id is : " + id);
	}
}
