package PractisePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AlternativeSorting {
	/*
	 * Alternative Sorting Given an array arr[] of N distinct integers, output the
	 * array in such a way that the first element is first maximum and the second
	 * element is the first minimum, and so on.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: N = 7, arr[] = {7, 1, 2, 3, 4, 5, 6} Output: 7 1 6 2 5 3 4
	 * Explanation:The first element is first maximum and second element is first
	 * minimum and so on. Example 2:
	 * 
	 * Input: N = 8, arr[] = {1, 6, 9, 4, 3, 7, 8, 2} Output: 9 1 8 2 7 3 6 4
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the value of arr["+i+"]: ");
			arr[i] = scanner.nextInt();
		}
		
		scanner.close();
		/*
		 * System.out.print("Original Array: "); for(int i=0;i<n;i++) {
		 * System.out.print(arr[i]); System.out.print(" "); }
		 * 
		 * Arrays.sort(arr);
		 * 
		 * System.out.print("Sorted Array: ");
		 * 
		 * for(int i=0;i<n;i++) { System.out.print(arr[i]); System.out.print(" "); }
		 */
		
		Arrays.sort(arr);
		
	    int first = 0;
	    int last = n -1;
	    ArrayList<Integer> list = new ArrayList<>();
	    
	    for(int i=0;i<n;i++) {
	    	if(i%2==0) {
	    		 list.add(arr[last]);
	    		last--;
	    	}else {
	    		list.add(arr[first]);
	    		first++;
	    	}
	    }
	    
	    System.out.println(list);
	}

}
