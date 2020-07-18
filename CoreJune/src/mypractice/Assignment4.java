package mypractice;
                                        // (((((10*2)-2)+2)-2)/2)     ///Method Program
public class Assignment4 {
	static int x = 2;
	public int multi(int x, int y)
	{int z = x*y;
	System.out.println("The result of Multi method is: "+z);
		 return z;
	}
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
	public void div(int x, int y)
	{int z= x/y;
    System.out.println("Assignment 3: The result of complete equation "
    		+ "(((((10*2)-2)+2)-2)/2) is: "+z);
	}
	public static void main(String[] args) {
		Assignment4 ms = new Assignment4();
		int result1 = ms.multi(10, x);
		int result2 = ms.sub(result1, x);
		int result3 = ms.add(result2, x);
		int result4 = ms.sub(result3, x);
		ms.div(result4, x);
		}

}
