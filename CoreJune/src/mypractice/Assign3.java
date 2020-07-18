package mypractice;

import java.util.Scanner;               //(Table of 5)
public class Assign3 {
   public static void main(String[] args) {
	  int i, num, result;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number and get complete table: ");
	  num = sc.nextInt();
	  for(i=1;i<=10;i++)
	  {
		 result = num*i;
		 System.out.println(num+"*"+i+"="+result);
      }
}
}
