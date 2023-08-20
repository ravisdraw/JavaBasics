package PractisePrograms;

import java.util.Scanner;

public class DistanceBetween2Points {
 /*
	Distance between 2 points
	Given coordinates of 2 points on a cartesian plane, find the distance between them rounded up to nearest integer.

	Example 1:
	
	Input: 0 0 2 -2
	Output: 3
	Explanation: Distance between (0, 0) 
	and (2, -2) is 3.
	Example 2:
	
	Input: -20 23 -15 68
	Output: 45
	Explanation: Distance between (-20, 23) 
	and (-15, 68) is 45.
	
	Distance = ceil(sqrt((x2 - x1)^2 + (y2 - y1)^2))
  */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Coordinate of first point (x1,y1): ");
		double x1,y1,x2,y2;
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		System.out.println("Enter the Coordinate of second point (x2,y2): ");
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		
		double distance = cartesianPlane(x1, y1, x2, y2);
		int roundedResult = (int) Math.ceil(distance);
		System.out.println(roundedResult);
		
		
	}
	public static double cartesianPlane (double x1, double y1, double x2, double y2 ) {
		double xDifference = x2-x1;
		double yDifference = y2-y1;
		
		return Math.sqrt(xDifference*xDifference + yDifference*yDifference);
	}

}
