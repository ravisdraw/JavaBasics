package Methods;

public class MethodPractice {

	public static void main(String[] args) {
		int a,b;
		a = 10;
		b = 5;
		
		//With static
		System.out.println(max(a,b));
		
		//Without static
		MethodPractice mp = new MethodPractice(); // Creating an Object of the class
		System.out.println(mp.max1(a, b));
	}
	
	static int max(int x, int y) {
		if(x > y) {
			return x;
		}else {
			return y;
		}
	}

	int max1(int x, int y) {
		if(x > y) {
			return x;
		}else {
			return y;
		}
	}
}
