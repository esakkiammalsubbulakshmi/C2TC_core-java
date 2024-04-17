package com.TNSIF.BatchC37.DayFour;

public class Student	extends	Citizen

{
	private	int	rollNo;
	private	String	collegeName;
	
	public	Student()
	
	{
		super();
	}

	public Student(String name, String aadharNo, String address, long phNo,int	rollNO,String	collegeName) {
		super(name, aadharNo, address, phNo);
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String collegeName) {
		super();
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}

	
	}



	
