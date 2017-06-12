package home.edu.vn;

import java.util.Scanner;

public class Break_Continue_Return {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*Demo for command Break*/
		Demo1_PrimeNumber();
		
	}

	private static void Demo1_PrimeNumber() {
		System.out.print("Enter any number: ");
		int i, n = input.nextInt();
		
		for(i=2;i<=n/2;i++){
			if(n%i==0){
				System.out.printf("%d is not a prime number!",n);
				break;
			}
		}
		
		if(i >= n/2){
			System.out.printf("%d is a prime number!",n);
		}
	}

}
