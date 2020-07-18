package mypractice;

public class Student4 {
	int student_age = 12;                    
	int student_rollnumber = 13;
	
	public void welcome() {
	    System.out.println("Welcome to all of you in class of Core Java");
	}
	

	public static void main(String[] args) {
		Student4 hs = new Student4();
		hs.welcome();
	    System.out.println(hs.student_age);
	    System.out.println(hs.student_rollnumber);

	}

}
