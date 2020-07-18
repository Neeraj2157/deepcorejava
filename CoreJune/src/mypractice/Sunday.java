package mypractice;

public class Sunday {
	
	public Sunday()
	{   this(2,3,4,5);
		System.out.println("Parent Default Constructor");
	}
	
	public Sunday(int a)
	{   this();
		System.out.println("Parent 1 Parameterize Constructor");	
	}
	public Sunday (int a, int b)
	{   this(2,3,4);
		System.out.println("Parent 2 Parameterize Constructor");		
	}
	public Sunday (int a, int b, int c)
	{   this(1);
		System.out.println("Parent 3 Parameterize Constructor");	
	}
	public Sunday (int a, int b, int c, int d)
	{
		System.out.println("Parent 4 Parameterize Constructor");		
	}
	
	}
