package com.app.pojos;

import javax.persistence.*;

@Entity
public class Book extends BaseEntity {
	@Column(name="title",unique = true)
	private String title;
	@Column(name="price")
	private double price;
	@ManyToOne
	@JoinColumn(name="authorid")
	private Author author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

}
