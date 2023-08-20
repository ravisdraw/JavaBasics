package Array;

public class MatrixProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][] = {{3,5,9},{7,6,2},{4,3,5}};
		int B[][] = {{1,2,4},{3,5,3},{4,2,4}};
		
		//Adding two Matrix
		MatrixProblems.addingMatrix(A, B);
		
		//Matrix Multiplication
		MatrixProblems.multiplyMatrix(A, B);
	}
	
	public static void addingMatrix(int[][] A,int[][] B) {
		int C[][] = new int[A.length][A[0].length];
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[0].length;j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		System.out.println("Adding Matrix: ");
		for(int x[]:C) {
			for(int y:x) {
				System.out.format("%2d ",y);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void multiplyMatrix(int[][] A, int[][] B) {
		int C[][] = new int[A.length][A[0].length];
		
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[0].length;j++) {
				C[i][j] = 0;
				for(int k=0;k<A[0].length;k++) {
					C[i][j]=C[i][j]+A[i][k] * B[k][j];
				}
			}
		}
		
		System.out.println("Matrix Multiplication: ");
		for(int x[]:C) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
}
