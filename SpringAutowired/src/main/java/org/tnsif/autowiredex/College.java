package org.tnsif.autowiredex;

public class College {
	Student s;
	
	/*public void setS(Student s) {
		this.s=s;
		
	}*/
	//DI using constructor
	public College(Student s) {
		super();
		System.out.println("autowire using constructor");
		this.s = s;
	}

	public void accept()
	{
		s.teach();
	}

}
