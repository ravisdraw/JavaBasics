package Array;

public class createArray {

	public static void main(String[] args) {
		int arr1[] = new int[5];
		int arr2[] = {1,2,3,4,5};
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]);
		}
		System.out.println();
		
		//forEach Loop -> Only access the element in forward
		
		for(int x: arr2) {
			System.out.print(x);
		}
		
		//Different methods of initializing an array
		
		int A[] = new int[10];
		int B[] = { 1,2,3,4,5 };
		int C[];
		C = new int[10];
		
		for(int x:A) {
			System.out.print(x);
		}
		
	}

}
