package mypractice;
import java.util.Scanner;     //Prime number
public class Assign6 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");     
		int num = sc.nextInt();
		boolean result = false;
		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				result = true;
				break;
			}
		}
			if(!result)
			   System.out.println("Number is a prime number");
			else
				System.out.println("Number is not a prime number  ");
		}
}
