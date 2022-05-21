package com.assignment;

public class Student {
	
	String name;
	int roll;
	int marks;
	
	void displayStudetDetails(Student s)
	{
		System.out.println("Name is : " +s.name);
		System.out.println("Roll is : " +s.roll);
		System.out.println("Marks is : " +s.marks);
	}	

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "Raghav Sharma";
		s1.roll = 12;
		s1.marks = 354;
		
		Student s2 = new Student();
		s2.name = "Vikas Tyagi";
		s2.roll = 16;
		s2.marks = 364;
		
		s1.displayStudetDetails(s1);
		s1.displayStudetDetails(s2);
		
		s1 = null;
		s2 = null;
				
	}
 
}


