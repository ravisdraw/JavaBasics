package Array;

import java.util.Scanner;

public class LoopingAnArray {

	public static void main(String[] args) {
		
		int arr[] = {3,4,6,2,90,92};
		System.out.println("Choose the Option: \n 1.Sum all the elements in an array \n "
				+ "2.Searching an Element \n "
				+ "3.Find Maximum Element \n "
				+ "4.Finding Second Largest Element");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		switch(n) {
		case 1: LoopingAnArray.findSum(arr); break;
		case 2: LoopingAnArray.searchElement(arr); break;
		case 3: LoopingAnArray.findMax(arr); break;
		case 4: LoopingAnArray.findSecondMax(arr); break;
		default: break;
		}
	}
	
	public static void findSum(int[] arr) {
		int sum = 0;
		for(int x:arr) {
			sum+=x;
		}
		System.out.println("Sum of all the elements in Array: "+sum);
	}
	
	public static void searchElement(int[] arr) {
		System.out.print("Enter the search Element: ");
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		for(int x:arr) {
			if(x==key) {
				System.out.println("Element Found!");
				System.exit(0);
			}
		}
		System.out.println("Element Not Found!");
	}

	public static void findMax(int[] arr) {
		int max = arr[0];
		for(int x:arr) {
			if(x>max) {
				max = x;
			}
		}
		System.out.println("Maximum Element is: "+ max);
	}

	public static void findSecondMax(int[] arr) {
		int max1,max2;
		max1=max2= arr[0];
		for(int x:arr) {
			if(x>max1) {
				max2=max1;
				max1=x;
			}else if(x>max2) {
				max2 = x;
			}
		}
		System.out.println("Second Maximum: "+max2);
	}
}

