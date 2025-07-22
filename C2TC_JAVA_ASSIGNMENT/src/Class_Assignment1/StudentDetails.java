package Class_Assignment1;
import java.util.Scanner;
public class StudentDetails {

	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);
	        Student[] students = new Student[3];

	        for (int i = 0; i < 3; i++) {
	            System.out.println("Enter details for Student " + (i + 1));

	            System.out.print("Name: ");
	            String name = scanner.nextLine();

	            System.out.print("Roll Number: ");
	            int rollNo = Integer.parseInt(scanner.nextLine());

	            System.out.print("Department: ");
	            String dept = scanner.nextLine();

	            students[i] = new Student(name, rollNo, dept);
	            System.out.println();
	        }

	        System.out.println("----- Student Details -----");
	        for (Student student : students) {
	            student.displayDetails();
	        }

	        scanner.close();
	    }
	}