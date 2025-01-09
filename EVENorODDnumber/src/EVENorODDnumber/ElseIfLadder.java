package EVENorODDnumber;

import java.util.Scanner;

public class ElseIfLadder {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int x=obj.nextInt();
		if(x%2==0)
		{
			System.out.println(x + " is an even number ");
		}
		else if(x%2!=0)
		{
			System.out.println(x + " is an odd number ");
		}
	}

}
