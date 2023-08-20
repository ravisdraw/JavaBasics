package Loops;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = scanner.nextInt();
		scanner.close();
		int count = 0;
		while(N!=0) {
			N=N/10;
			count++;
		}
		System.out.println("Total count of Digits: "+count);
	}

}
