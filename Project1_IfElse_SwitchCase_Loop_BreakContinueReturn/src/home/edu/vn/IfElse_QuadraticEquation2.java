package home.edu.vn;

import java.util.Scanner;

public class IfElse_QuadraticEquation2 {

	public static void main(String[] args) {
		
		System.out.println("Quadratic equation 2");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("A: ");
		double A = input.nextDouble();
		
		System.out.print("B: ");
		double B = input.nextDouble();
		
		System.out.print("C: ");
		double C = input.nextDouble();
		
		double delta = Math.pow(B, 2)-4*A*C;
		
		if(A==0){
			System.out.println("This is not a second order equation!");
		}
		else{//A!=0
			if(delta<0){
				System.out.println("Equation has no solution!");
			}
			else if(delta==0){
				double Xo = -B/2*A;
				System.out.printf("Equation has dual solution Xo = %.2f",Xo);
			}
			else{
				double X1 = (-B+Math.sqrt(delta))/(2*A);
				double X2 = (-B-Math.sqrt(delta))/(2*A);
				System.out.printf("Equation has two solution X1 = %.2f, X2 = %.2f",X1,X2);
			}
		}
		
	}

}
