package mypractice;             //((((X1+X2)-X3)+X4)*X5/X6)
import java.util.Scanner;
public class scanapp {
	public float sum(float a, float b)
	{  float c = a+b;
		return c;}
	public float sub(float a, float b)
	{ float c = a-b;
		return c; }
	public float multi(float a, float b)
	{ float c = a*b;
		return c; }
	public void div(float a, float b)
	{ float c = a/b;
		System.out.println("The result of equation ((((X1+X2)-X3)+X4)*X5/X6) is: " +c); }
	public static void main(String[] args) {
		scanapp hs = new scanapp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of X1: " );
		float X1= sc.nextInt();
		System.out.println("Enter value of X2: " );
		float X2= sc.nextInt();
		System.out.println("Enter value of X3: " );
		float X3= sc.nextInt();
		System.out.println("Enter value of X4: " );
		float X4= sc.nextInt();
		System.out.println("Enter value of X5: " );
		float X5= sc.nextInt();
		System.out.println("Enter value of X6: " );
		float X6= sc.nextInt();
		float a = hs.sum(X1, X2);
		float b = hs.sub(a,X3);
		float c = hs.sum(b, X4);
		float d = hs.multi(c, X5);
		hs.div(d, X6);
		
	}

}
