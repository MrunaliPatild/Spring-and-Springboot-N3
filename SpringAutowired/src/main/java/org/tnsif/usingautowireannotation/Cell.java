package org.tnsif.usingautowireannotation;

public class Cell {
	//private data members
	private String company;
	private String size;
	//getters and setters
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	//default constructor
	public Cell() {
		super();
		System.out.println("default constructor for cell");
		
	}
	public void power()
	{
		System.out.println("company of a cell:"+company);
		System.out.println("size of a cell:"+size);
	}
	
	

}
