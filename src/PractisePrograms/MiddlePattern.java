package PractisePrograms;

import java.util.Scanner;

public class MiddlePattern {
	
	/*
	 * Middle Pattern
	 * 
	 * Given an odd length word your task is to complete the function printPattern
	 * that takes a string s as its argument and prints it from the middle of the
	 * word such that it follows the following pattern.
	 * 
	 * 
	 * Input: PROGRAM Output: G$ GR$ GRA$ GRAM$ GRAMP$ GRAMPR$ GRAMPRO$
	 * 
	 * Input: RAT Output: A$ AT$ ATR$
	 * 
	 * NOTE: Corresponding to each test case in a new line print the pattern in a
	 * single line where each row of the pattern is separated by a "$" instead of a
	 * new line.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String S = scanner.nextLine();
		scanner.close();
		int middleIndex = S.length()/2;
		int count = 0;
		String newString = "";
		while(count<S.length()) {
			newString+= S.charAt(middleIndex);
			count++;
			middleIndex++;
			if(middleIndex==S.length()) {
				middleIndex = 0;
			}
			System.out.print(newString);
			System.out.print("$");
			System.out.print(" ");
		}
	}

}
