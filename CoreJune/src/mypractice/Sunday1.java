package mypractice;

public class Sunday1 extends Sunday {
	public Sunday1()
	{   this(1);
		System.out.println("Child Default Constructor");
	}
	public Sunday1(int a)
	{   this(3,4,9);
		System.out.println("Child 1 Parameterize Constructor");	
	}
	
	public Sunday1(int a, int b, int c)
	{   super(1,2);
		System.out.println("Child 3 Parameterize Constructor");	
	}
	public Sunday1(int a, int b, int c, int d)
	{   this();
		System.out.println("Child 4 Parameterize Constructor");		
	}
	
	public static void main(String[] args) {
		Sunday1 hs = new Sunday1(2,3,4,5);
}
}
