package mypractice;
public class ConsAssignment2 {
	public ConsAssignment2() {
	    this(3,4,5);
	    System.out.println("Hello, I am default constructor.");
    }
	public ConsAssignment2(int a) {
		this(2,3);
	    System.out.println("Hello, I am a 1 parameterized constructor.");
	}
	public ConsAssignment2(int a, int b) {
	    this(6,7,8,4);
		System.out.println("Hello, I am a 2 parameterized constructor.");
	}
	public ConsAssignment2(int a, int b, int c) {
		
		System.out.println("Hello, I am a 3 parameterized Constructor.");
	}
	public ConsAssignment2(int a, int b, int c, int d) {
		this();
		System.out.println("Hello, I am a 4 parameterized Constructor.");
	}
	
	public static void main(String[] args) {
		ConsAssignment2 hs = new ConsAssignment2(2);
    }
}
