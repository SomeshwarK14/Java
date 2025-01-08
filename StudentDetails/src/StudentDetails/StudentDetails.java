package StudentDetails;

import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String S1a,S1b,S1c,S1d;
		//Student Name
		System.out.println("Enter the Name of the Student:");
		S1a=obj.nextLine();
		
		//Student roll no
		System.out.println("Enter the Roll number of Student:");
		S1b=obj.nextLine();
		
		//Student class
		System.out.println("Enter the class of the Student:");
		S1c=obj.nextLine();
		
		//Student Section
		System.out.println("Enter the Section of the Student:");
		S1d=obj.nextLine();
		
		//Student Mark
		System.out.println("Enter the Mark 1 :");
		int mark1=obj.nextInt();
		System.out.println("Enter the Mark 2 :");
		int mark2=obj.nextInt();
		System.out.println("Enter the Mark 3 :");
		int mark3=obj.nextInt();
		System.out.println("Enter the Mark 4 :");
		int mark4=obj.nextInt();
		System.out.println("Enter the Mark 5 :");
		int mark5=obj.nextInt();
		
		double sum,average;
		sum=mark1+mark2+mark3+mark4+mark5;
		average=sum/5;
		System.out.println("The Name of Student is -"+" "+S1a);
		System.out.println("The Roll Number of Student is -"+" "+S1b);
		System.out.println("The class of Student is -"+" "+S1c);
		System.out.println("The Section of Student is -"+" "+S1d);
		System.out.println("Mark 1:"+" "+mark1);
		System.out.println("Mark 2:"+" "+mark2);
		System.out.println("Mark 3:"+" "+mark3);
		System.out.println("Mark 4:"+" "+mark4);
		System.out.println("Mark 5:"+" "+mark5);
		System.out.println("The Total Mark is :"+" "+sum);
		System.out.println("The Average is :"+" "+average);


	}

}