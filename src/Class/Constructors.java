package Class;

class Rectangle1 {
	private int length;
	private int breath;

	public Rectangle1() {
		length = 1;
		breath = 1;
	}

	public Rectangle1(int l, int b) {
		length = l;
		breath = b;
	}
	
	public int getLength() {
		return length;
	}

}

public class Constructors {

	public static void main(String[] args) {
		Rectangle1 r = new Rectangle1(10,5);
		System.out.println(r.getLength());
	}

}
