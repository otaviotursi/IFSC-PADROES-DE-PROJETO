package creationals.builder.exercise;

import java.util.LinkedList;
import java.util.List;

public class Book {

	private String name;
	private String publishingCompany;
	private int year;
	private List<String> authors;
	private List<String> chapters;
	
	public Book() {
		authors = new LinkedList<String>();
		chapters = new LinkedList<String>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void addAuthor(String author) {
		authors.add(author);
	}

	public List<String> getChapters() {
		return chapters;
	}

	public void addChapter(String chapter) {
		chapters.add(chapter);
	}

	public void print() {
		System.out.println("Name: "+this.getName());
		System.out.println("Publisher: "+this.getPublishingCompany());
		System.out.println("Year: "+this.getYear());
		System.out.println("Authors: "+this.getAuthors());
		System.out.println("Chapters: "+this.getChapters());
	}
}
