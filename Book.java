package com.bookAuthor;

public class Book {

	private String bookType;
	private int yearOfPublication;
	private double price;
	private Author ar;

	public Book()
	{
		super();
	}

	public Book(String bookType, int yearOfPublication, double price, Author ar) {
		super();
		this.bookType = bookType;
		this.yearOfPublication = yearOfPublication;
		this.price = price;
		this.ar=ar;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAr() {
		return ar;
	}

	public void setAr(Author ar) {
		this.ar = ar;
	}
}
