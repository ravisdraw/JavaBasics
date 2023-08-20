package PractisePrograms;

import java.util.Scanner;

public class SumOfPrime {
	/*
	 * Sum of primes
	 * 
	 * Your task is to calculate sum of primes present as digits of given number N.
	 * 
	 * Example 1:
	 * 
	 * Input: 333 Output: 9 Explaination: 3 is a prime number. It is present 3
	 * times. So 3+3+3 = 9. Example 2:
	 * 
	 * Input: 686 Output: 0 Explaination: Neither 6 nor 8 is a prime number.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int N = scanner.nextInt();
		scanner.close();
		int sum=0;
        while(N!=0){
            int rem=N%10;
            N/=10;
            if(isPrime(rem)){
                sum+=rem;
            }
        }
        System.out.println(sum);
	}
	
	public static boolean isPrime(int N) {
		if(N<=1) return false;
		for(int i=2;i<Math.sqrt(N);i++) {
			if(N%i==0) {
				return false;
			}
		}
		return true;
	}

}
