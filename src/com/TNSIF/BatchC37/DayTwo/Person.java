package com.TNSIF.BatchC37.DayTwo;

public class Person
{

	private	String	personName;
	private	String	City;
	
	public	Person()
	{
		System.out.println("Person	class	default	constructor");
		
	}

	public Person(String personName, String city) {
		super();
		this.personName = personName;
		City = city;
	}

	