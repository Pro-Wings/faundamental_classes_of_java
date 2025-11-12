package com.prowings.copyconstructor.deep;

public class Library {
	
	private int libraryId;
	private String libraryName;
	private String book1;
	
	public Library() {

	}
	
	public Library(int libraryId, String libraryName, String book1) {
		super();
		this.libraryId = libraryId;
		this.libraryName = libraryName;
		this.book1 = book1;
	}

	
	//copy constructor
	public Library(Library lib)
	{
		this.libraryId = lib.libraryId;
		this.libraryName = lib.libraryName;
		this.book1 = lib.book1;
	}
	
	public int getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getBook1() {
		return book1;
	}

	public void setBook1(String book1) {
		this.book1 = book1;
	}

	@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", libraryName=" + libraryName + ", book1=" + book1 + "]";
	}

	
	
}
