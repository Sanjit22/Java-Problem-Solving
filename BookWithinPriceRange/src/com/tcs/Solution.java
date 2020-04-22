package com.tcs;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] books = new Book[4];
		double min = 0;
		double max = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < books.length; i++) {
			int id = sc.nextInt();
			String title = sc.nextLine();
			String author = sc.nextLine();
			sc.nextLine();
			double price = sc.nextDouble();

			books[i] = new Book(id, title, author, price);
		}
		min = sc.nextDouble();
		max = sc.nextDouble();

		Book[] newBooks = booksWithPriceRange(min, max, books);

		for (Book b : newBooks)
			System.out.println(b.getId());
	}

	// implement business methods here
	public static Book[] booksWithPriceRange(double min,double max,Book[] books) {
		int count=0;
		for(int i=0;i<books.length;i++) {
			if(books[i].getPrice()>=min && books[i].getPrice()<=max) {
				count++;
			}
		}
		
		Book[] booksWithRange=new Book[count];
		int counter=0;
		for(int j=0;j<books.length;j++) {
			if(books[j].getPrice()>=min && books[j].getPrice()<=max) {
				booksWithRange[counter++]=books[j];
			}
		}
		
		Book temp;
		for(int k=0;k<booksWithRange.length;k++) {
			for(int l=k+1;l<booksWithRange.length;l++) {
				if(booksWithRange[k].getId()>booksWithRange[l].getId()) {
					temp = booksWithRange[k];
					booksWithRange[k]=booksWithRange[l];
					booksWithRange[l]=temp;
				}
			}
		}
		return booksWithRange;
	}

}

class Book {
	// implement class here
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
