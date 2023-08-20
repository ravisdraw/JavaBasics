package Methods;

public class SimplePrograms {

	public static void main(String[] args) {
		primeNumber();
		GCD();
		MaxElement();
	}
	
	static void primeNumber() {
		int flag = 0;
		int N = 7;
		if(N<=1) {
			flag = 1;
		}
		for(int i=2;i<Math.sqrt(N);i++) {
			if(N%i==0) {
				flag = 1;
			}
		}
		if(flag==0) {
			System.out.println("Prime");
		}else {
			System.out.println("Not a Prime");
		}
	}
	static void GCD() {
		int M = 35;
		int N = 56;
		
		while(M!=N) {
			if(M>N) {
				M = M-N;
			}else {
				N = N-M;
			}
		}
		System.out.println("GCD: "+M);
	}
	static void MaxElement() {
		int A[] = {2,5,3,6,7,3,9,5,7};
		int max = A[0];
		for(int x: A) {
			if(x>max) {
				max = x;
			}
		}
		System.out.println("Max Num: "+max);
	}
}
