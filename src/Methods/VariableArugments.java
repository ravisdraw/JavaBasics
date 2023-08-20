package Methods;

public class VariableArugments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example1(1,2,4,5);
		System.out.println();
		example1(new int[] {2,4,5,3,5,6});
	}
	
	static void example1(int ...A) {
		for(int x:A) {
			System.out.print(x+" ");
		}
	}

}
