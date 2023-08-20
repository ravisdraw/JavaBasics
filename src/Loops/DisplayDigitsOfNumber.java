package Loops;

import java.util.Scanner;

public class DisplayDigitsOfNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = scanner.nextInt();
		scanner.close();
		while(N!=0) {
			int reminder = N%10;
			System.out.print(reminder);
			System.out.print(" ");
			N = N/10;
		}
	}

}
