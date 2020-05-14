package studataapp;

public class Student{

	private String Firstname;
	private String lastname;
	private int year;
	private int ID;
	private int balance;

	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		Firstname = in.next();
		System.out.println("Enter your last name: ");
		lastname = in.next();
		System.out.println("Choose your year");
		System.out.println("1) First year\n2)Second year\n3)Third year\n4)Fourth year");
		year = in.nextInt();
	}
}

