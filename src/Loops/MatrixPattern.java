package Loops;

import java.util.Scanner;

/*Questions

01 02 03 04 05     Pattern 1
06 07 08 09 10 
11 12 13 14 15 
16 17 18 19 20 
21 22 23 24 25 

1 					 Pattern 2
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

1 					 Pattern 3
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

1 2 3 4 5 			 Pattern 4
1 2 3 4 
1 2 3 
1 2 
1 

*****                Pattern 5
 ****
  ***
   **
    *

    *				 Pattern 6
   **
  ***
 ****
*****

    *				 Pattern 7
   ***
  *****
 *******
**********

*/
public class MatrixPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter no of Row: ");
		int row = scanner.nextInt();
		System.out.print("Enter no of Column: ");
		int column = scanner.nextInt();		 
		System.out.println();
		MatrixPattern.pattern1(row, column);
		System.out.println();
		MatrixPattern.pattern2(row, column);
		System.out.println();
		MatrixPattern.pattern3(row, column);
		System.out.println();
		MatrixPattern.pattern4(row, column);
		System.out.println();
		MatrixPattern.pattern5(row, column);
		System.out.println();
		MatrixPattern.pattern6(row, column);
		System.out.println();
		MatrixPattern.pattern7(row, column);
		System.out.println();
		MatrixPattern.pattern8(row, column);
		System.out.println();
	}
	
	public static void pattern1(int row, int column) {
		int count = 1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.format("%02d ",count);
				count++;
			}
			System.out.println("");
		}
	}
	
	public static void pattern2(int r,int c) {
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void pattern3(int r,int c) {
		int count = 1;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
	
	public static void pattern4(int r,int c) {
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=r-i+1;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void pattern5(int r,int c) {
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if(i<=j) {					
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern6(int r,int c) {
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if(j>=r-i+1) {					
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern7(int r,int c) {
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if(j>=r-i+1) {					
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int k=1;k<i;k++) {
				System.out.print("*");
				}
			System.out.println();
		}
	}
	public static void pattern8(int r,int c) {
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if(j>=r-i+1) {					
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int k=1;k<i;k++) {
				System.out.print("*");
				}
			System.out.println();
		}
		for(int i=1;i<=r-1;i++) {
			System.out.print(" ");
			for(int j=1;j<=c-1;j++) {
				if(i<=j) {					
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int k=1;k<c-i;k++) {
				System.out.print("*");
				}
			System.out.println();
		}
	}

}
