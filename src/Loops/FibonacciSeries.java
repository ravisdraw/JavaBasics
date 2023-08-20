package Loops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = scanner.nextInt();
		scanner.close();
		int a = 0;
		int b = 1;
		System.out.print(a+",");
		System.out.print(b+",");
		int c;
		for(int i=2;i<N;i++) {
			c = a+b;
			System.out.print(c+ ",");
			a = b;
			b = c;
		}
	}

}
