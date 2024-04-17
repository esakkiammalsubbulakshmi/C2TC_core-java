package com.TNSIF.BatchC37.DayThree;

public class City	extends	State
{
	private	String	City;
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	private	String	Area;
	@Override
	public String toString() {
		return "City [City=" + City + ", Area=" + Area + ", getStateName()=" + getStateName() + ", getLanguage()="
				+ getLanguage() + ", getCountryName()=" + getCountryName() + ", getCapital()=" + getCapital() + "]";
	}
	
	
}

