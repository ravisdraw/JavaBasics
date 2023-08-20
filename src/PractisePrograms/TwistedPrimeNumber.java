package PractisePrograms;

import java.util.Scanner;

public class TwistedPrimeNumber {
	/*
	 * Twisted Prime Number
	 * 
	 * Given a number N. Check whether N is a Twisted Prime number or not. Note: A
	 * number is called Twisted Prime if it is a prime and its reverse is also a
	 * prime.
	 * 
	 * Example 1:
	 * 
	 * Input: N = 97 Output: 1 Explanation: 97 is a prime number. Its reverse 79
	 * is also a prime number. Thus 97 is a twisted Prime and so, answer is 1.
	 * Example 2:
	 * 
	 * Input: N = 43 Output: 0 Explanation: 43 is a prime number but its reverse 34
	 * is not a prime.So, 43 is not a twisted prime and thus, answer is 0.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int N = scanner.nextInt();
		if(checkPrime(N)) {
	           if(checkPrime(reverseNumber(N))) {
	               System.out.println(1);
	           } else {
	        	   System.out.println(0);
	           }
	       }else {	    	   
	    	   System.out.println(0);
	       }
		
	}
	
	public static boolean checkPrime(int N) {
		for(int i=2;i<Math.sqrt(N);i++){
	        if(N%i==0) {
	            return false;
	        }
	    }
	    return true;
	}
	public static int reverseNumber(int N) {
		int temp = N;
		int r = 0;
		while(temp>0) {
			r = r*10 + temp%10;
			temp = temp/10;
		}
		return r;
	}
}
