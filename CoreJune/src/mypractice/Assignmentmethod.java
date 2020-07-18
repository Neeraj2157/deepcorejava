package mypractice;

public class Assignmentmethod {
	public void method1() {
		this.method4(5, 6, 7);
		System.out.println("Default Method");
	}
	public void method2(int a) {
		this.method3(2, 4);
		System.out.println("1 Parameterized Method");
	}
	public void method3(int a, int b) {
		this.method5(2, 3, 4, 5);
		System.out.println("2 Parameterized Method");
	}
	public void method4(int a, int b, int c) {
		System.out.println("3 Parameterized Method");
	}
	public void method5(int a, int b, int c, int d) {
		this.method1();
		System.out.println("4 Parameterized Method");
	}
	public static void main(String[] args) {
		Assignmentmethod hs = new Assignmentmethod();
		hs.method2(2);
    }
}
