package Methods;

public class Recursion {

	public static void main(String[] args) {
		/*Recursion - A method calling itself
		 fun(3)
		 /   \
		3    fun(2)
	          /  \
	         2    fun(1) 
	               / \ 
	              1   fun(0)
 	*/
		fun(3);
	}
	
	static void fun(int x) {
		if(x > 0) {
			fun(x-1);
			System.out.print(x+" ");
		}
	}

}
