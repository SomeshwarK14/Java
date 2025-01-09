package DivBy4;

import java.util.Scanner;

public class DivBy4If {
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number :");
		int x=obj.nextInt();
		if(x%4==0) {
			System.out.println(x+ " is divisible by 4 ");
		}
		if(x%4!=0) {
			System.out.println(x+ " is not divisible by 4 ");
		}
	}
}
