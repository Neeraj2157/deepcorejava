package mypractice;

import java.util.Scanner;

public class Assign5 {                                      // fabinoci Series
	public void fabinoci()
	{
		int i, a, b, sum, num = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		a = sc.nextInt();
		System.out.println("Enter the value of b: ");
		b= sc.nextInt();
		System.out.println("Fabinoci series is here:  ");
		for(i=0;i<=10;i++)
		{   System.out.println(+a);
			sum=a+b;
			a=b;
			b=sum;		}
}
     public static void main(String[] args) {
		Assign5 as = new Assign5();
		as.fabinoci();
 }
}
