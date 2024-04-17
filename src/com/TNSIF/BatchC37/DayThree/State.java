package com.TNSIF.BatchC37.DayThree;

public class State	extends	Country 
{

	public String getStateName() {
		return StateName;
	}
	public void setStateName(String stateName) {
		StateName = stateName;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	private	String	StateName;
	private	String	Language;
	@Override
	public String toString() {
		return "State [StateName=" + StateName + ", Language=" + Language + "]";
	}
	
	
	
}

