package mypractice;                         //((((10-2)+2)+2)*2)/2)  

public class Assignment3 {
	static int x = 2;
	public int sub( int x, int y)
	{int z= x-y;
	System.out.println("The result of Sub method is: "+z);
		return z;
	}
	public int add(int x, int y)
	{int z = x+y;
	System.out.println("The result of Add method is: "+z);
		return z;
	}
	public int multi(int x, int y)
	{int z = x*y;
	System.out.println("The result of Multi method is: "+z);
		 return z;
	}
	public void div(int x, int y)
	{int z= x/y;
    System.out.println("Assignment 2: The result of complete equation "
    		+ "((((10-2)+2)+2)*2)/2) is: "+z);
	}
	
	public static void main(String[] args) {
	    Assignment3 ms = new Assignment3();
		int result1 = ms.sub(10, x);
		int result2 = ms.add(result1, x);
		int result3 = ms.add(result2, x);
		int result4 = ms.multi(result3, x);
		ms.div(result4, x);
     }
}