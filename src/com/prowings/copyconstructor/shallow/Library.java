package com.prowings.copyconstructor.shallow;

public class Library {
	
	private int libraryId;
	private String libraryName;
	private Book book1;
	
	public Library() {

	}

	public Library(int libraryId, String libraryName, Book book1) {
		super();
		this.libraryId = libraryId;
		this.libraryName = libraryName;
		this.book1 = book1;
	}
	
	//copy constructor
	public Library(Library lib) {
		this.libraryId = lib.libraryId;
		this.libraryName = lib.libraryName;
		// shallow copy
//		this.book1 = lib.book1; 
		
		// deep copy
		Book copiedBook = new Book(); // creating new Book object
		copiedBook.setBookId(lib.book1.getBookId());
		copiedBook.setBookName(lib.book1.getBookName());
		this.book1 = copiedBook; // assigning copied Book object reference
		
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

	public Book getBook1() {
		return book1;
	}

	public void setBook1(Book book1) {
		this.book1 = book1;
	}

	@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", libraryName=" + libraryName + ", book1=" + book1 + "]";
	}
	
	
	
}
