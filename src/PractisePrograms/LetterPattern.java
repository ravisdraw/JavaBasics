package PractisePrograms;

import java.util.Scanner;

public class LetterPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a odd Length word: ");
		String word;
		word = s.next();
		int n = word.length();
		for(int i=0; i<n;i++) {
			for(int j=0; j<n;j++) {
				if( i==j || j==n-1-i) {
					System.out.print(word.charAt(j));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
