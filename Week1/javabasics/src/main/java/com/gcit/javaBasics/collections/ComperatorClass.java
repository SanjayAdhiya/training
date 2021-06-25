package com.gcit.javaBasics.collections;

public class ComperatorClass {

	String author = "hi";
	String book;
	String sales;

	public int one(String a) {
		
	    return   this.author.compareTo(a);
 }

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getSales() {
		return sales;
	}

	public void setSales(String sales) {
		this.sales = sales;
	}

}
