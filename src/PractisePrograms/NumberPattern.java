package PractisePrograms;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a odd number : ");
		int n;
		n = s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0; j<n;j++) {
				if(i==j || j==n-1-i) {					
					System.out.print(j+1);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
