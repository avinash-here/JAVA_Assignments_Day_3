package com.assignment;

public class Problem_3 {
	
	void fun (char a) 
	{
		switch (a) {
		
		case 'a': case 'e': case 'i': case 'o': case 'u':
		case 'A': case 'E': case 'I': case 'O': case 'U':
			System.out.println("Vowel");
			break;
			
		case 'b': case 'c': case 'd': case 'f': case 'g': case 'h': case 'j': case 'k': case 'l':
		case 'm': case 'n': case 'p': case 'q': case 'r': case 's': case 't': case 'v': case 'w':
		case 'x': case 'y': case 'z':		
		case 'B': case 'C': case 'D': case 'F': case 'G': case 'H': case 'J': case 'K': case 'L':
		case 'M': case 'N': case 'P': case 'Q': case 'R': case 'S': case 'T': case 'V': case 'W':
		case 'X': case 'Y': case 'Z':
			System.out.println("Consonant");
			break;
		
		default:
			System.out.println("Invalid Character");
			break;
		}
		
			
		
	}

	public static void main(String[] args) {
		
		
		Problem_3 p3 = new Problem_3();
		
		p3.fun('a');
		p3.fun('M');
		p3.fun('#');

	}

}
