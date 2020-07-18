package mypractice;

public class Student1 {
	static int student_age = 12;                    //static keyword used to use the variable in same class
	static int student_rollnumber = 13;
	
	public void welcome() {
	    System.out.println("Welcome to all of you in class of Core Java");
	}
	
	public static void main(String[] args) {
		Student hs = new Student();
		hs.welcome();
	    System.out.println(student_age);
	    System.out.println(student_rollnumber);

	}

}
