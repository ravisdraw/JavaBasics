package PractisePrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class TotalCount {
	/*
	 * Total count
	 * 
	 * Given an array Arr of N positive integers and a number K where K is used as a
	 * threshold value to divide each element of the array into sum of different
	 * numbers. Find the sum of count of the numbers in which array elements are
	 * divided.
	 * 
	 * Example 1:
	 * 
	 * Input: N = 4, K = 3 Arr[] = {5, 8, 10, 13} Output: 14 Explanation: Each
	 * number can be expressed as sum of different numbers less than or equal to K
	 * as 5 (3 + 2), 8 (3 + 3 + 2), 10 (3 + 3 + 3 + 1), 13 (3 + 3 + 3 + 3 + 1). So,
	 * the sum of count of each element is (2+3+4+5)=14.
	 * 
	 * Example 2:
	 * 
	 * Input: N = 5, K = 4 Arr[] = {10, 2, 3, 4, 7} Output: 8 Explanation: Each
	 * number can be expressed as sum of different numbers less than or equal to K
	 * as 10 (4 + 4 + 2), 2 (2), 3 (3), 4 (4) and 7 (4 + 3). So, the sum of count of
	 * each element is (3 + 1 + 1 + 1 + 2) = 8.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n,k;
		System.out.println("Enter N: ");
		n = scanner.nextInt();
		System.out.println("Enter K: ");
		k = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		int count = 0;
		for(int i=0; i<n;i++) {
			int temp = arr[i];
			int tempCount = 0;
			while(temp > 0) {
				temp = temp-k;
				tempCount++;
			}
			count+=tempCount;
		}
		System.out.println("Result: "+count);
	}

}
