package creationals.builder.exercise;

import java.util.LinkedList;
import java.util.List;

public class Album {

	private String name;
	private String recordCompany;
	private int year;
	private List<String> authors;
	private List<String> tracks;
	
	public Album() {
		authors = new LinkedList<String>();
		tracks = new LinkedList<String>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRecordCompany() {
		return recordCompany;
	}

	public void setRecordCompany(String recordCompany) {
		this.recordCompany = recordCompany;
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

	public List<String> getTracks() {
		return tracks;
	}

	public void addAlbum(String track) {
		tracks.add(track);
	}
	
	public void print() {
		System.out.println("Name: "+this.getName());
		System.out.println("Record: "+this.getRecordCompany());
		System.out.println("Year: "+this.getYear());
		System.out.println("Authors: "+this.getAuthors());
		System.out.println("Tracks: "+this.getTracks());
	}
	
}
