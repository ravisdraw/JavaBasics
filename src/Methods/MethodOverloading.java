package Methods;

public class MethodOverloading {

	public static void main(String[] args) {
		/* Method overloading - Having more than one method having the same name
		   Java allows to use methods with same name but either data types must be different or 
		   number of parameters should be different 
		   Polymorphisam  - behaviour is changing depending on the parameters. we achieving this using
		   method overloading.
		   */
		System.out.println(max(2,6));
		System.out.println(max(3.5f,2.1f));
		
	}
	
	static int max(int x, int y) {
		return x>y?x:y;
	}
	
	static float max(float x,float y) {
		return x>y?x:y;
	}

}
