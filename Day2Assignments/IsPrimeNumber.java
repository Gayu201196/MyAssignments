package week1.Day2.Day2Assignments;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int num = 13;
		boolean isPrime = true;
		if(num <= 1) {
			System.out.println("The value "+num+" is not a prime number");
		}
		else {
			for (int i=2; i<num/2 ;i++) {
				if(num%i==0) {
					isPrime = false;
				}
				
			}
		}
		if(isPrime == true) {
			System.out.println("The value "+num+" is a prime number");
		}
		else {
		System.out.println("The value "+num+" is not a Prime number");
	}


	}

}
