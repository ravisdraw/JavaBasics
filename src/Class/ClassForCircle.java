package Class;

class Circle {
	public double radius;
	
	public double area() {
		return Math.PI*radius*radius;
	}
	
	public double perimeter() {
		return 2*Math.PI*radius;
	}
}


public class ClassForCircle {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		
		circle1.radius = 20;
		circle2.radius = 7;
		
		System.out.println(circle1.area());
		System.out.println(circle1.perimeter());
		
		System.out.println(circle2.area());
		System.out.println(circle2.perimeter());
	}

}
