package mypractice;

public class Assignment2 {
	public int add(int x, int y)
	{int z = x+y;
		return z;
	}
	public int sub( int x, int y)
	{int z= x-y;
		return z;
	}
	public int multi(int x, int y)
	{int z = x*y;
		 return z;
	}
	public void div(int x, int y)
	{int z= x/y;
		System.out.println("Assignment 1:  The result of equation ((((10+2)-2)*2)+2)/2) is :  " +z);
	}
	public static void main(String[] args)
	{
    Assignment2 hs = new Assignment2();
    final int x = 2;
    int Add_result = hs.add(10,x);
    int Sub_result = hs.sub(Add_result,x);
    int Multi_result = hs.multi(Sub_result,x);
    int Add_result1 = hs.add(Multi_result,x);
    hs.div(Add_result1,x);
    }

}
