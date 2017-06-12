package home.edu.vn;

import java.util.Scanner;

public class IfElse_PersonalIncomeTax {

	public static void main(String[] args) {
		
		System.out.println("Personal Income Tax");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter salary: ");
		double salary = input.nextDouble();
		
		System.out.print("Enter bonus: ");
		double bonus = input.nextDouble();
		
		double income = salary + bonus;
		double tax;
		
		if(income<9){
			tax = 0;
		}
		else if(income<=15){
			tax = (income-9)*0.1;
		}
		else{
			tax = (income-15)*0.15+6*0.1;
		}
		
		System.out.printf("Personal Income Tax = %.2f",tax);
		
	}

}
