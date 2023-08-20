package PractisePrograms;

import java.util.Scanner;

public class SumOfMatrix {

	/*
	 Sum of elements in a matrix
	Given a non null integer matrix Grid of dimensions NxM.Calculate the sum of its elements.

	Example 1:
	
	Input:
	N=2,M=3
	Grid=
	[[1,0,1],
	[-8,9,-2]]
	Output:
	1
	Explanation:
	The sum of all elements of the matrix is 
	(1+0+1-8+9-2)=1.
	
	Example 2:

	Input:
	N=3,M=5
	Grid=
	[[1,0,1,0,1],
	[0,1,0,1,0],
	[-1,-1,-1,-1,-1]]
	Output:
	0
	Explanation:
	The sum of all elements of the matrix are
	(1+0+1+0+1+0+1+0+1+0-1-1-1-1-1)=0.
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int row,column;
		System.out.println("Enter row and column of the matrix: ");
		row = scanner.nextInt();
		column = scanner.nextInt();
		int [][] array = new int[row][column];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print("Enter the value for the position ["+i+"]["+j+"]: ");
				array[i][j] = scanner.nextInt();
			}
		}
		
		scanner.close();
		
		int sum=0;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column; j++) {
				sum+=array[i][j];
			}
		}
		
		System.out.println("Sum of the array elements: "+ sum);
	}

}
