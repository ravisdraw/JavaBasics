package Loops;

import java.util.Scanner;

public class ReverseAnumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = scanner.nextInt();
		int reverse = 0;
		while(N!=0) {
			reverse = reverse*10 + N%10;
			N = N/10;
		}
		System.out.println("Reverse of N: "+reverse);
	}

}
