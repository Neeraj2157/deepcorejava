package mypractice;

public class SundayMe {
	
	public void method11() {
		this.method15(4, 5, 6, 7);
		System.out.println("Parent Default Method");
	}
	public void method12(int a) {
	    this.method11();
		System.out.println("Parent 1 Parameterized Method");
	}
	public void method13(int a, int b) {
	    this.method14(3, 4, 5);
		System.out.println("Parent 2 Parameterized Method");
	}
	public void method14(int a, int b, int c) {
		this.method12(2);
		System.out.println("Parent 3 Parameterized Method");
	}
	public void method15(int a, int b, int c, int d) {
	
		System.out.println("Parent 4 Parameterized Method");
	}
	
}
