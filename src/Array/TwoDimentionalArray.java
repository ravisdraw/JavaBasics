package Array;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		
		//Array is treated as object in Java , so it will always created in Heap
		
		int A[][] = new int[3][4]; //Creating an 2D Array
		int B[][] = {{1,2,3,4},{3,4,5,6},{6,7,8,9}}; //Initializing an 2D array;
		
		//Displaying an 2D array
		TwoDimentionalArray.display(B);
		
		//Displaying an 2D array using For each
		TwoDimentionalArray.forEachLoop(B);
		
		//Jagged Array - Having different size of columns
		TwoDimentionalArray.jaggedArray();
	}
	
	public static void display(int[][] B) {
		for(int i=0;i<B.length;i++) {
			for(int j=0;j<B[0].length;j++) {
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void forEachLoop(int[][] B) {
		for(int x[]:B) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void jaggedArray() {
		int J[][];
		J = new int[3][];
		J[0] = new int[2];
		J[1] = new int[3];
		J[2] = new int[3];
		System.out.println("Jagged Array: ");
		for(int x[]:J) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}
