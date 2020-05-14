package studataapp;

public class Student{

	private String name;
	private int year;
	private String StudentID;
	private int balance;
	private static int ID=0;

	public Student() {
		Scanner in = new Scanner(System.in);
		// Input Full Name
		System.out.println("Enter your full name name: ");
		name = in.nextLine();
		//Input in which Year a Student is
		System.out.println("Choose your year");
		System.out.println("1) First year\n2)Second year\n3)Third year\n4)Fourth year");
		year = in.nextInt();
		// method create ID called
		createID();
		// printing the information taken and genrated
		System.out.println("Name: " + name + "\nYear: " + year + "\nStudentID: " + StudentID);
	}
        private void createID() {
                  // always must starts from tear in which a student is 
		  ID++;
		  StudentID = year + "000" + ID;
         }   
}

