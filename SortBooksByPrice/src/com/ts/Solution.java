package com.ts;

import java.util.Scanner;

public class Solution {

	@SuppressWarnings({ "resource"})
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Book[] books = new Book[4];
		for(int i=0;i<books.length;i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String title = sc.nextLine();
			String author = sc.nextLine();
			double price = sc.nextDouble();
			
			books[i]=new Book(id, title, author, price);
		}
		
		Book[] result = sortBooksByPrice(books);
		
		for(Book b:result) {
			System.out.println(b.getId()+" "+b.getTitle()+" "+b.getAuthor()+" "+b.getPrice());
		}
		
	}
	
	static Book[] sortBooksByPrice(Book[] books) {
		Book temp;
		for(int i=0;i<books.length;i++) {
			for(int j=i;j<books.length;j++) {
				if(books[i].getPrice()>books[j].getPrice()) {
					temp = books[i];
					books[i]= books[j];
					books[j]= temp;
				}
			}
		}
		return books;
	}
	
}

class Book{
	private int id;
	private String title;
	private String author;
	private double price;
	
	public Book(int id, String title, String author, double price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
