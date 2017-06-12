package home.edu.vn;

import java.util.Scanner;

public class While_DoWhile_For {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*Demo for command While*/
		//Demo1_MultiplicationTable();
		//Demo2_MinOfNumberDividedBy3();
		
		/*Demo for command While*/
		//Demo3_PositiveNumber();
		//Demo4_GuessNumberGame();
		
		/*Demo for command For*/
		//Demo5_MultiplicationTable();
		
		/*Demo for command For-Each*/
		//Demo6_SumOfArray();
	}

	private static void Demo6_SumOfArray() {
		
		int[] a = {7,8,2,9,30};
		
		System.out.print("Using command for-each: ");
		for(int x: a){
			System.out.print(x+" ");
		}
		
		System.out.print("\nUsing command for: ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
	}

	private static void Demo5_MultiplicationTable() {
		
		int n;
		
		for(n=1; n<=9; n++){
			int i, r;
			for(i=1;i<=10;i++){
				r = i * n;
				System.out.printf("%d x %d = %d",n,i,r);
				System.out.println();
			}		
			System.out.println();
		}
		
	}

	private static void Demo4_GuessNumberGame() {
		
		int number = (int)Math.round(Math.random()*100);	
		int enter_number, guess_number=0;
		
		do{
			System.out.print("Enter number: ");
			enter_number = input.nextInt();
			guess_number++;
			
			if(enter_number < number){
				System.out.println("Guess number need > Enter number!");
			}
			else if(enter_number>number){
				System.out.println("Guess number need < Enter number!");
			}
			else{
				System.out.println("Congratulation! You won the game!");
				System.out.printf("Quantity of guess number = %d",guess_number);
			}
		}
		while(enter_number!=number);
		
	}

	private static void Demo3_PositiveNumber() {
		
		int positive_number;
		
		do{
			System.out.print("Positive Number: ");
			positive_number = input.nextInt();
		}
		while(positive_number<0);
		
		System.out.printf("Entered positive number is: %d",positive_number);
		
	}

	private static void Demo2_MinOfNumberDividedBy3() {
		
		System.out.print("Min: ");
		int min = input.nextInt();
		
		System.out.print("Max: ");
		int max = input.nextInt();
		
		int i = min;
		double total = 0;
		
		while(i <= max){
			if(i%3 == 0){
				total += i;
			}
			i++;
		}
		
		System.out.printf("Total of numbers which divided by 3 = %.2f",total);
		
	}

	private static void Demo1_MultiplicationTable() {
		
		int n=2;
		
		while(n<=9){
			int i=1;
			while(i<=10){
				int r = i * n;
				System.out.printf("%d x %d = %d",n,i,r);
				System.out.println();
				i++;
			}		
			n++;
			System.out.println();
		}
		
	}
	
}
