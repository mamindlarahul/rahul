package task10;

import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private String studentID;

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentID);
    }

	public int length() {
		return 0;
	}
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter student's name: ");
        student.setName(scanner.nextLine());

        System.out.println("Enter student's age: ");
        student.setAge(scanner.nextInt());
        scanner.nextLine();  // Consume newline

        System.out.println("Enter student's ID: ");
        student.setStudentID(scanner.nextLine());

        if(student.length() != 5) {
        	System.err.println("invalid studentID");
        }
        else {
        student.displayInfo();
        }
    }
}

