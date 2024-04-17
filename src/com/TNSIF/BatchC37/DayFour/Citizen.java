package com.TNSIF.BatchC37.DayFour;

public class Citizen 
{
	private	String	name;
	private	String	aadharNo;
	private	String	address;
	private	long	PhNo;
	
	public	Citizen()
	{
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhNo() {
		return PhNo;
	}

	public void setPhNo(long phNo) {
		PhNo = phNo;
	}

	public Citizen(String name, String aadharNo, String address, long phNo) {
		super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.address = address;
		PhNo = phNo;
	}
	
	
	
	
	

}
