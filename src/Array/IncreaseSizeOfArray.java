package Array;

public class IncreaseSizeOfArray {

	public static void main(String[] args) {
		int A[] = {2,4,5,1,5,6,7,2,6,89,54,34};
		System.out.print("Original Array: ");
		for(int x: A) {
			System.out.print(x+" ");
		}
		System.out.println();

		//Copying an array
		IncreaseSizeOfArray.copy(A);
		
		//Reverse an array
		IncreaseSizeOfArray.reverse(A);
		
		//Increase size of an array
		IncreaseSizeOfArray.increaseSize(A);
	}
	
	public static void copy(int[] A) {
		int B[] = new int[A.length];
		for(int i=0;i<A.length;i++) {
			B[i] = A[i];
		}
		System.out.print("Copying an Array: ");
		for(int x:B ) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	public static void reverse(int[] A) {
		int C[] = new int[A.length];
		for(int i=A.length-1,j=0;i>=0;i--,j++) {
			C[j]=A[i];
		}
		System.out.print("Reveresed Array: ");
		for(int x:C) {
			System.out.print(x+" ");
		}
		System.out.println();
	}

	public static void increaseSize(int[] A) {
		int B[] = new int[A.length*2];
		for(int i=0;i<A.length;i++) {
			B[i] = A[i];
		}
		A = B;
		System.out.print("Increased Size: ");
		for(int x:A) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
}
