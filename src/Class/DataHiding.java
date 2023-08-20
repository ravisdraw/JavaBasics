package Class;

/*
 * Data Hiding : 
 * 1.Read and Write -> getter and setter
 * 2.Read Only -> getter 
 * 3.Write Only -> setter
 * */

class Rectangle {
	
	private int length;
	
	public void setLength(int l) {
		length = l;
	}
	
	public int getLength() {
		return length;
	}
}

public class DataHiding {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		r.setLength(10);
		System.out.println(r.getLength());
		
	}

}
