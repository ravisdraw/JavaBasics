package PractisePrograms;

import java.util.Scanner;

public class LeapYear {
	/*
	 * Leap Year Basic
	 * 
	 * For an input year N, find whether the year is a leap or not.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: N = 4 Output: 1 Explanation: 4 is not divisible by 100 and is
	 * divisible by 4 so its a leap year Example 2:
	 * 
	 * Input: N = 2021 Output: 0 Explanation: 2021 is not divisible by 100 and is
	 * also not divisible by 4 so its not a leap year
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year = scanner.nextInt();
		scanner.close();
		
		if(LeapYear.checkLeap(year)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
	
	public static boolean checkLeap(int year) {
		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 == 0) {
					return true; //  divisible by 4,100,400;
				}
				return false; // divisible by 4,100 but not by 400
			}
			return true; // divisible by only 4 but not by 100,400
		}else {
			return false;
		}
	}

}
