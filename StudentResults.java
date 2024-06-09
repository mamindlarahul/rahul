package task10;

import java.util.Scanner;

public class  StudentResults {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter your rollnumber :");
		int rollnumber =input.nextInt();

		if (rollnumber == 1234567801 || rollnumber == 1234567802 || rollnumber == 1234567803 ||
				rollnumber == 1234567804 || rollnumber == 1234567805 || rollnumber == 1234567806 ||
				rollnumber == 1234567807 || rollnumber == 1234567808 || rollnumber == 1234567809 ||
				rollnumber == 1234567810) {

		}
		if(rollnumber == 1234567801) {
			System.out.println("you have been passed by geting markes 50");
		}
		else if(rollnumber == 1234567802) {
			System.out.println("you have been passed by geting markes 40");
		}
		else if(rollnumber == 1234567803) {
			System.out.println("you have been passed by geting markes 80");
		}
		else if(rollnumber == 1234567804) {
			System.out.println("you have been falied by geting markes 23");
		}
		else if(rollnumber == 1234567805) {
			System.out.println("you have been passed by geting markes 38");
		}
		else if(rollnumber == 1234567806) {
			System.out.println("you have been passed by geting markes 56");
		}
		else if(rollnumber == 1234567807) {
			System.out.println("you have been falied by geting markes 16");
		}
		else if(rollnumber == 1234567808) {
			System.out.println("you have been passed by geting markes 89");
		}
		else if(rollnumber == 1234567809) {
			System.out.println("you have been falied by geting markes 32");
		}
		else if(rollnumber == 1234567810) {
			System.out.println("you have been passed by geting markes 96");
		}
		else {
			System.err.println("Invalid roll number");
		}

	}
}
