package Loops;

import java.util.Scanner;

/*An Armstrong number (also known as a narcissistic number, pluperfect digital invariant, or 
 * pluperfect digital number) is a number that is equal to the sum of its own digits raised to 
 * the power of the number of digits in that number. 
 * In other words, an n-digit number is an Armstrong number if the sum of its digits, 
 * each raised to the power of n, is equal to the number itself.

For example, consider the following:

153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
370 is an Armstrong number because 3^3 + 7^3 + 0^3 = 370.
1634 is an Armstrong number because 1^4 + 6^4 + 3^4 + 4^4 = 1634.*/

public class Armstrong {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = scanner.nextInt();
		scanner.close();
		int count = 0;
		int temp1 = N;
		int temp2 = N;
		while(temp1!=0) {
			temp1 = temp1/10;
			count++;
		}
		int sum = 0;
		while(temp2!=0) {
			int reminder = temp2%10;
			int power = 1;
			for(int i=0;i<count;i++) {
				power*=reminder;
			}
			sum+= power;
			temp2 = temp2/10;
		}
		if(N==sum) {			
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not an Armstrong Number");
		}
	}

}
