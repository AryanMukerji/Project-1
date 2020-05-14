package studataapp;

public class Student{

	private String name;
	private int year;
	private String StudentID;
	private int balance;
	private static int ID=0;
	private String Courses = "";
	private int numcour=0;


	public Student() {
		Scanner in = new Scanner(System.in);
		// Input Full Name
		System.out.println("Enter your full name name: ");
		name = in.nextLine();
		//Input in which Year a Student is
		System.out.println("Choose your year");
		System.out.println("1)First year\n2)Second year\n3)Third year\n4)Fourth year");
		year = in.nextInt();
		// method create ID called
		createID();
		// printing the information taken and genrated
		System.out.println("Name: " + name + "\nYear: " + year + "\nStudentID: " + StudentID);
		enrool();
	}
        private void createID() {

                  // always must starts from tear in which a student is 
		  ID++;
		  StudentID = year + "000" + ID;
         }   
	public void enrool() {
		do {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter the courses in which you wanna enroll (Q to quit): ");
			String Choice = in.nextLine();
			if (!Choice.equals("Q")) {
				Courses = Courses + "\n" + Choice;
				numcour++;
				// balance should be numcour *10000
				balance=(int) (numcour*totalfees());


			} else {
				break;
			}
		} while (1 != 0);
		System.out.println("\nENROLLED IN: " + Courses+"\n");
		// System.out.println("BALANCE: " + balance);

	}
	public void showdues() {
		System.out.println("Tution Fees to be paid according to the number of courses you enrolled in: " + balance);
	}
	public void paydues() {
		showdues();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the amount of payment: ");
		int pay = in.nextInt();
		if (pay == balance) {
			System.out.println("Thanks for the payment no dues");
			showdues();
		} else {
			balance = balance - pay;
			System.out.println("sry you transaction incomplete due: "+balance);
		}
	}
}

