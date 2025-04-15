package com.records;

public class Record {
	
	public static void main(String[] args) {
		
		RecordsEg1 eg1 = new RecordsEg1(1, "Adhav");
		System.out.println(eg1);
		
		RecordsCustomMethods rcm = new RecordsCustomMethods(2, "Akil", 30, 300);
		System.out.println(rcm);
		System.out.println("Salary : "+rcm.salary());
		
		
		RecordsCustomMethods rcm1 = new RecordsCustomMethods(2, "Adhi", 10, 300);
		System.out.println(rcm1);
		System.out.println("Salary : "+rcm1.salary());
		
		
		
	}
}
