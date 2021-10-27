package org.student.details;

import java.util.Scanner;

public class StudentInfo {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter student Id: ");
		int studentId = s.nextInt();
		System.out.println("Student Id: " +studentId);
		
		System.out.println("Enter student Name: ");
		String studentName = s.next();
		System.out.println("Student Name: " +studentName);
		
		System.out.println("Enter student email: ");
		String studentEmail = s.next();
		System.out.println("Student email: " +studentEmail);
		
		System.out.println("Enter student Phone no: ");
		long studentPhoneNo = s.nextLong();
		System.out.println("Student Phone No: " +studentPhoneNo);
		
		System.out.println("Enter student Dept: ");
		s.nextLine();
		String studentDept = s.nextLine();
		System.out.println("Student Dept: " +studentDept);
		
		System.out.println("Enter student gender: ");
		String studentGender = s.next();
		System.out.println("Student Gender: " +studentGender);
		
		System.out.println("Enter student city: ");
		String studentCity = s.next();
		System.out.println("Student City: " +studentCity);
		
				
	}

}
