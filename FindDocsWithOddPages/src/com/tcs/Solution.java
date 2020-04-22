package com.tcs;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		Document[] documents = new Document[4];
		for(int i=0;i<documents.length;i++) {
			int id=sc.nextInt();
			sc.nextLine();
			String title = sc.nextLine();
			String folderName =sc.nextLine();
			int pages = sc.nextInt();
			
			documents[i]=new Document(id, title, folderName, pages);
		}
		
		Document[] result = docsWithOddPages(documents);
		 
		
		for(Document d:result) {
			System.out.println(d.getId()+" "+d.getTitle()+" "+d.getFolderName()+" "+d.getPages());
		}
		
	}
	
	static Document[] docsWithOddPages(Document[] documents) {
		int count=0;
		
		for(Document d:documents) {
			if(d.getPages()%2==1) {
				count++;
			}
		}
		
		int k=0;
		Document[] result = new Document[count];
		
		for(Document d:documents) {
			if(d.getPages()%2==1) {
				result[k++]=d;
			}
		}
		
		Document temp;
		for(int i=0;i<result.length;i++) {
			for(int j=i;j<result.length;j++) {
				if(result[i].getId()>result[j].getId()) {
					temp=result[i];
					result[i]=result[j];
					result[j]=temp;
				}
			}
		}
		
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