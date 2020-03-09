package com.bridgelabz.injectObject;

public class AnotherStudent {
	private int id;
	private Library libraryAnother;

	public void setId(int id) {
		this.id = id;
	}

	public void setLibraryAnother(Library libraryAnother) {
		this.libraryAnother = libraryAnother;
	}

	public void startReading() {
		libraryAnother.library();
		System.out.println("Another Student Id is : " + id);
	}

}
