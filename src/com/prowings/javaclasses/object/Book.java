package com.prowings.javaclasses.object;

import java.util.Objects;

public class Book {
	
	private int bookId;
	private String title;
	private String auther;
	
	public Book() {
	}
	public Book(int bookId, String title, String auther) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.auther = auther;
	}
	@Override
	public int hashCode() {
		int result = 1;
		result = 31 * result + bookId;
		if(null != title)
			result = 31 * result + title.hashCode();
		if(null != auther)
			result = 31 * result + auther.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(auther, other.auther) && bookId == other.bookId && Objects.equals(title, other.title);
	}
	
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", auther=" + auther + "]";
	}

//	@Override
//	public String toString() {
//		
//		String result = "Book : bookId ="+bookId+ " Title = "+title+" Auther = "+auther;
//		
//		return result;
//		
//	}

	
	
	

}
