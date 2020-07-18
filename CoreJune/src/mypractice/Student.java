package mypractice;

public class Student {
	int student_age;
	int student_rollnumber;
	
	public void welcome() {
	    System.out.println("Welcome to all of you in class of Core Java");
	}
	public void automation() {
		System.out.println("Automation is very easy with core Java");
	}
	
	public static void main(String[] args)
	{
		Student hs = new Student();
		hs.welcome();
		hs.automation();
		hs.student_age = 27;
		System.out.println("student_age is:" +hs.student_age);
		hs.student_rollnumber = 28;
		System.out.println("student_roll number is:" +hs.student_rollnumber);
		}
}
