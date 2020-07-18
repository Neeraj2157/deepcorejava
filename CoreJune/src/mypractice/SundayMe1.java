package mypractice;

public class SundayMe1 extends SundayMe  {

public void method1() {
		this.method2(3);
		System.out.println("Child Default Method");
	}
	public void method2(int a) {
	    this.method4(4, 5, 6);
		System.out.println("Child 1 Parameterized Method");
	}
	
	public void method4(int a, int b, int c) {
		super.method13(3, 4);
		System.out.println("Child 3 Parameterized Method");
		
	}
	public void method5(int a, int b, int c, int d) {
	    this.method1();
		System.out.println("Child 4 Parameterized Method");
	}
	
	public static void main(String[] args) {
		SundayMe1 hs = new SundayMe1();
		hs.method5(2, 3, 4, 5);
		
		
		

	}

}
