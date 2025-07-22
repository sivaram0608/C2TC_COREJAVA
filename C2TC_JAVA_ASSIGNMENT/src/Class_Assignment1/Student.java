package Class_Assignment1;

public class Student {
	 private String name;
	    private int rollNo;
	    private String department;

	    // Constructor
	    public Student(String name, int rollNo, String department) {
	        this.name = name;
	        this.rollNo = rollNo;
	        this.department = department;
	    }

	    // Method to display student details
	    public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Roll Number: " + rollNo);
	        System.out.println("Department: " + department);
	        System.out.println("--------------------------");
	    }
	}