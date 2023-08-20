package Loops;

import java.util.Scanner;

public class DisplayMultiplicationTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the N: ");
		int N = scanner.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(N+" * "+i+" = "+N*i);
		}
	}

}
