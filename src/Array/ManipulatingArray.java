package Array;

import java.util.Scanner;

public class ManipulatingArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose the option: \n "
				+ "1.Rotating an Array \n "
				+ "2.Inserting an Element \n "
				+ "3.Deleting an Element");
		int n = scanner.nextInt();
		int arr[] = {33,5,2,6,88,35,45};
		switch(n) {
		case 1: ManipulatingArray.rotatingArray(arr); break;
		case 2: ManipulatingArray.insert(); break;
		case 3: ManipulatingArray.delete(); break;
		default: break;
		}
	}
	
	public static void rotatingArray(int[] arr) {
		//Left Rotation
		int temp = arr[0];
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		for(int i=1;i<=arr.length-1;i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1]=temp;
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}
	
	public static void insert() {
		int arr[] = new int[10];
		arr[0]=arr[1]=arr[2]=5;
		arr[3]=arr[4]=8;
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter new Element and its index: ");
		int newElement = scanner.nextInt();
		int index = scanner.nextInt();
		for(int i=arr.length-1;i>index-1;i--) {
			arr[i] = arr[i-1];
		}
		arr[index-1] = newElement;
		for(int x:arr) {
			System.out.print(x+" ");
		}
		
	}

	public static void delete() {
		int arr[] = new int[10];
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the index to delete: ");
		int index = scanner.nextInt();
		arr[0]=arr[1]=arr[2]=5;
		arr[3]=arr[4]=8;
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		for(int i=index-1;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}
		
	}
}
