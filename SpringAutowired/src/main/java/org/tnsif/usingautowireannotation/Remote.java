package org.tnsif.usingautowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Remote {
	private Cell cell;
//DI using setters
	//to achieve autowiring using setters,use @Autowired annotation
	@Autowired
	//when u have created multiple bean then if you want access particular one then use @Qualifier annotation
	@Qualifier("c1")
	public void setCell(Cell cell) {
		this.cell = cell;
	}
	//default constructor
	public Remote() {
		System.out.println("default constructor for remote");
	}
	//injecting the object of cell class
	public void remote() {
		cell.power();
	}
	
	

}
