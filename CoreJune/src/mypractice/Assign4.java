package mypractice;
import java.util.Scanner;
public class Assign4 {                          //Factorial of a number

	public static void main(String[] args) {
		int i, fact=1, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for factorial: ");
		num = sc.nextInt();
		for(i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of " +num+ " is " +fact);
	}
}
