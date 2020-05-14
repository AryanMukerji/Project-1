package studataapp;

public class app {
	public static void main(String[] args) {
               studentadd();
	}
	public static void studentadd() {
		Scanner in = new Scanner(System.in);
		System.out.println("ENter the number of students you wanna add: ");
		int num = in.nextInt();
		Student[] students = new Student[num];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
		}
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].toString());
		}
	}
}

