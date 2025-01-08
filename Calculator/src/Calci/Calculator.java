package Calci;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		double sum,multi,sub,div;
		//Values
		System.out.println("Enter the First value :");
		int value1=obj.nextInt();
		System.out.println("Enter the Second value :");
		int value2=obj.nextInt();
		
		//Calculations
		sum=value1+value2;
		multi=value1*value2;
		sub=value1-value2;
		div=value1%value2;
		System.out.println("The sum of First & Second value ="+" "+sum);
		System.out.println("The multiplication of First & Second value ="+" "+multi);
		System.out.println("The subtraction of First & Second value ="+" "+sub);
		System.out.println("The division of First & Second value ="+" "+div);

	}

}
