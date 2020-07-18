package mypractice;
public class ConsAssignment1 {
	                                                 //Creation of constructor
	public ConsAssignment1() {
		this(2,3,4,5);
	    System.out.println("Hello, I am default constructor.");
    }
	public ConsAssignment1(int a) {
		this();
	    System.out.println("Hello, I am a 1 parameterized constructor.");
	}
	public ConsAssignment1(int a, int b) {
		this(2,3,4);
		System.out.println("Hello, I am a 2 parameterized constructor.");
	}
	public ConsAssignment1(int a, int b, int c) {
		this(2);
		System.out.println("Hello, I am a 3 parameterized Constructor.");
	}
	public ConsAssignment1(int a, int b, int c, int d) {
		
		System.out.println("Hello, I am a 4 parameterized Constructor.");
	}
	public static void main(String[] args) {
		ConsAssignment1 hs = new ConsAssignment1(2,3);
	}
}
