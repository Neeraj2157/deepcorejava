package mypractice;

import java.util.Scanner;

public class Swap2 {                        //Swap 2 numbers without using 3rd variable  // In main method

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A");
		a= sc.nextInt();
	    System.out.println("Enter the value of B");
	    b= sc.nextInt();
	    a=a+b;
	    b=a-b;
	    a=a-b;
	    System.out.println("Value of A after swapping:  " +a);
	    System.out.println("Value of B after swapping:  " +b);

	}

}
