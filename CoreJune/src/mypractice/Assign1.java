package mypractice;

import java.util.Scanner;
      //Swap 2 numbers using 3rd variable  // separate method creation
   public class Assign1 {
	public void swap()
	{   int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A");
		a= sc.nextInt();
	    System.out.println("Enter the value of B");
	    b= sc.nextInt();
	    c=a;
	    a=b;
	    b=c;
	    System.out.println("Value of A after swapping:  " +a);
	    System.out.println("Value of B after swapping:  " +b);
	 }
	public static void main(String[] args) {
		Assign1 as = new Assign1();
		as.swap();}
}
