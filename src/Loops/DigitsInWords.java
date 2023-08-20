package Loops;

import java.util.Scanner;

public class DigitsInWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = scanner.nextInt();
		scanner.close();
		String Num = "";
		while(N!=0) {
			int rem = N%10;
			Num+=rem;
			N=N/10;
		}
		char c;
		for(int i=Num.length()-1;i>=0;i--) {
			c = Num.charAt(i);
			switch (c) {
			case '0': System.out.print("Zero "); break;
			case '1': System.out.print("One "); break;
			case '2': System.out.print("Two "); break;
			case '3': System.out.print("Three "); break;
			case '4': System.out.print("Four "); break;
			case '5': System.out.print("Five "); break;
			case '6': System.out.print("Six "); break;
			case '7': System.out.print("Seven "); break;
			case '8': System.out.print("Eight "); break;
			case '9': System.out.print("Nine "); break;
			default:
				break;
			}
		}
		
	}

}
