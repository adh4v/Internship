package com.records;

public record RecordsCustomMethods(int Id,String Name,int noOfDays,int payPerHour) {
	
	public RecordsCustomMethods {	
		if(noOfDays<15)
			throw new IllegalArgumentException("Not Eligible");
	}
	public int salary()
	{
		return noOfDays * payPerHour;
	}
}
