package com.tcs;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Document[] documents = new Document[4];
		for(int i=0;i<documents.length;i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String title = sc.nextLine();
			String folderName = sc.nextLine();
			int pages = sc.nextInt();
			
			documents[i] = new Document(id, title, folderName, pages);
		}
		
		Document answer = combineDocs(documents);
		System.out.println(answer.getId());
		System.out.println(answer.getTitle());
		System.out.println(answer.getFolderName());
		System.out.println(answer.getPages());
	}
	
	static Document combineDocs(Document[] documents) {
		int max=0;
		String title="";
		String folderName="";
		int totalPages=0;
		for(int i=0;i<documents.length;i++) {
			if(documents[i].getId()>=max) {
				max = documents[i].getId()+1;
			}
			if(i<documents.length-1) {
				title =title + documents[i].getTitle()+"#";
				folderName=folderName+documents[i].getFolderName()+"@";
			}
			else {
				title =title + documents[i].getTitle();
				folderName=folderName+documents[i].getFolderName();
			}
			
			totalPages=totalPages+documents[i].getPages();
			
		}
		
		Document result = new Document(max, title, folderName, totalPages);
		return result;
	}

}

class Document{
	private int id;
	private String title;
	private String folderName;
	private int pages;
	
	public Document(int id, String title, String folderName, int pages) {
		super();
		this.id = id;
		this.title = title;
		this.folderName = folderName;
		this.pages = pages;
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
	public String getFolderName() {
		return folderName;
	}
	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
}
