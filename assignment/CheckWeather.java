package com.assignment;
	
public class CheckWeather {
			
		public static void main(String[] args) {
		
		boolean isSnowing = false;
		
		boolean isRaining = true;
		
		double temperature = 55.0;
		
		//print "Let�s stay home." if its raining, snowing or
		//below 50 degrees and print "Let�s go out!" otherwise.
		
		if(isSnowing == true || isRaining == true || temperature < 50)
		{
			System.out.println("Let's stay home!");
		}
		else
		{
			System.out.println("Let's go out!");
		}

	}
	}

	


