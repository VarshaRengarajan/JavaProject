package com.assistedhibernate;


public class Comp2 {
	private int id;  
	private String name;  
	private Comp1 address;  //HAS-A  
	
	public Comp2(){}
	
	public Comp2(String name, Comp1 address)
	{
		this.name=name;
		this.address=address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Comp1 getAddress() {
		return address;
	}
	public void setAddress(Comp1 address) {
		this.address = address;
	}
	  
}	


