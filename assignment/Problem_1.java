package com.assignment;

public class Problem_1 {
	
	int a = 100;
	
	static int b = 200;

	public static void main(String[] args) {


		//Difference between Static and Non-static?
		/* Inside a class in a java file, we generally have two things, variables and methods.
		 * These variables and methods can be of two types:
		 * one is static and the other is non-static.
		 * If it is static then it will be loaded on the RAM while running the code and 
		 * if it is non-static it won't. We will have to load them explicitly by creating an 
		 * object to perform operations on them.
		 * 
		 * */
		
		//Example
		
		//There are two variables a and b at line 5 and 7 respectively.
		
		//System.out.println(a);   //it will show an error because it's non-static and not on RAM;
		System.out.println(b);
		
		Problem_1 p1 = new Problem_1();
		
		//Now we can access the variable a with the help of p1.
		
		System.out.println(p1.a); //it won't show an error
		System.out.println(b);		
		

	}

}
