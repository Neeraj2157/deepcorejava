package mypractice;
import java.util.Scanner;
public class Assign7 {                                            //Armstrong Number
public static void main(String[] args) {
		int a, b, c, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		a= sc.nextInt();
		b=a;
		while(b>0) {
			c= b%10;
			sum = sum+(c*c*c);
			b = b/10;}
		if(a==sum)
		{   System.out.println("The number is Armstrong");
		}
		else
		{	System.out.println("The number is not Armstrong");
		}
	}
}
