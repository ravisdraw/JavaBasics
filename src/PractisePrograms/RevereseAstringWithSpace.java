package PractisePrograms;

import java.util.Scanner;

public class RevereseAstringWithSpace {
	/*
	 * Reverse a string with spaces intact
	 * 
	 * Given a string, your task is to reverse the string keeping the spaces intact
	 * to their positions.
	 * 
	 * Example 1:
	 * 
	 * Input: S = "Help others" Output: sreh topleH Explanation: The space is intact
	 * at index 4 while all other characters are reversed. Example 2:
	 * 
	 * Input: S = "geeksforgeeks" Output: skeegrofskeeg Explanation: No space
	 * present, hence the entire string is reversed.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String S = scanner.nextLine();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)!=' ') {
				sb.append(S.charAt(i));
			}
		}
		sb.reverse();
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)==' ') {
				sb.insert(i,' ');
			}
		}
		System.out.println(sb.toString());
	}

}
