package Loops;

import java.util.Scanner;

public class SumofNnumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter N: ");
		int N = scanner.nextInt();
		int sum = 0;
		for(int i=1;i<=N;i++) {
			sum+=i;
		}
		System.out.println("Sum of N numbers: "+sum);
	}

}
