package LeapYearOrNot;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a Year :");
		int year=obj.nextInt();
		if(year%4==0){
			if(year%100==0){
				if(year%400==0){
					System.out.println(year+" "+"is a leap year");
				}
				if(year%400!=0) {
					System.out.println(year+" "+"is not a leap year");
				}
				if(year%100!=0) {
					System.out.println(year+" "+"is a leap year");
				}
				if(year%4!=0) {
					System.out.println(year+" "+"is not a leap year");
				}
				
			}
		}
	}
}
