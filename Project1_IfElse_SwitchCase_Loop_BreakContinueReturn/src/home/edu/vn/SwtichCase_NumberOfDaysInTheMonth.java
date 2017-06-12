package home.edu.vn;

import java.util.Scanner;

public class SwtichCase_NumberOfDaysInTheMonth {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {

		//daysInMonth();
		
		while(true){
			menu();
		}

	}

	private static void menu() {
		
		System.out.println("+-------MENU------+");
		System.out.println("|1. Add           |");
		System.out.println("|2. Sub           |");
		System.out.println("|3. Days in month |");
		System.out.println("|4. Exit          |");
		System.out.println("+-----------------+");
		
		System.out.print(">> Choose the option? ");
		int choose = input.nextInt();
		
		switch(choose){
		case 1:
			add();
			break;
		case 2:
			sub();
			break;
		case 3:
			daysInMonth();
			break;
		case 4:
			System.exit(0);
			break;
		default:
			System.out.println("Please choose option 1,2 or 3!");
			break;
		}
		
	}

	private static void sub() {

		System.out.print("Enter number a: ");
		double a = input.nextDouble();
		System.out.print("Enter number b: ");
		double b = input.nextDouble();

		double c = a - b;

		System.out.printf("Multip of %.2f and %.2f is: %.2f\n", a, b, c);
	}

	private static void add() {

		System.out.println("Enter number a: ");
		double a = input.nextDouble();
		System.out.println("Enter number b: ");
		double b = input.nextDouble();

		double c = a + b;

		System.out.printf("Sum of %.2f and %.2f is: %.2f\n", a, b, c);
	}

	private static void daysInMonth() {

		System.out.print("Month: ");
		int month = input.nextInt();

		switch (month) {
		case 2:
			System.out.print("Year: ");
			int year = input.nextInt();
			if(year%4==0 && year%100!=0){
				System.out.println("29 days!");
			}
			else{
				System.out.println("28 days!");
			}
			break;
		case 4:
		case 6:
		case 8:
		case 11:
			System.out.println("30 days!");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 10:
		case 12:
			System.out.println("31 days!");
			break;
		default:
			System.out.println("Month is invalid!");
			break;
		}

	}

}
