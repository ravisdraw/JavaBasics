package Loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = scanner.nextInt();
		scanner.close();
		long factorial = 1;
		for(int i=1;i<=N;i++) {
			factorial*=i;
		}
		System.out.println("Factorial of N: "+factorial);
	}

}
