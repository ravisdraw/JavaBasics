package PractisePrograms;

import java.util.Scanner;

public class SumPalindrome {
/*
 * Sum Palindrome
   Given a number, reverse it and add it to itself unless it becomes a palindrome or number of iterations becomes more than 5.

	Example 1:
	
	Input: n = 23
	Output: 55 
	Explanation: reverse(23) = 32,then 32+23
	= 55 which is a palindrome. 
	
	Example 2:
	
	Input: n = 30
	Output: 33
	Explanation: reverse(30) = 3,then 3+30
	= 33 which is palindrome. 
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scanner.nextInt();
		int count = 1;
		long temp = n;
		while( count <= 5 ) {
			if(temp == SumPalindrome.reverse(temp)) {
				break;
			} else {
				temp = temp+SumPalindrome.reverse(temp);
			}
		}
		long result =   temp == SumPalindrome.reverse(temp)?temp:-1;
		System.out.println(result);
	}
	
	public static long reverse(long n) {
		long r = 0;
		while(n > 0) {
			r = r*10 + n%10;
			n = n/10;
		}
		return r;
	}

}
