package com.Student;

import java.util.Scanner;

import com.studentInterface.manageStudentInterface;


public class manageStudent {
	public static void main(String[] args) {
		manageStudentInterface msi = new manageStudentInterface();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Student Management System");
		
		while(true) {
			System.out.println("1. Add Student"+"\n2.Show All Student"+"\n3.Get Student Based On Roll Number"+"\n4.Delete Student"+"\n5.Update Student"+"\n6.Exit");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: System.out.println("Add Student");
					System.out.println("Enter the student name:");
					String name = sc.next();
					System.out.println("Enter Student College Name:");
					String collegeName = sc.next();
					System.out.println("Enter City");
					String city = sc.next();
					System.out.println("Enter Percentage");
					double percentage = sc.nextDouble();
					studentDetails std = new studentDetails(name,collegeName,city,percentage);					
					
					boolean recordAdded = msi.insertStudent(std);
					
					if(recordAdded) {
						System.out.println("Record Added Successfully!!");
					}else {
						System.out.println("Something went wrong please try again!!");
					}
					
					break;
			case 2: System.out.println("Show All Student");
					msi.showAllStudent();
					break;
			case 3: System.out.println("Get Student Based On Roll Number");
					System.out.println("Enter Roll Number");
					int rollNumber = sc.nextInt();
					boolean id = msi.showStudentById(rollNumber);
					if(!id) {
						System.out.println("Student with the given roll number is not Available");
					}
					break;
			case 4: System.out.println("Delete Student");
					System.out.println("Enter Roll Number to delete");
					int rollNum = sc.nextInt();
					boolean delete = msi.delete(rollNum);
					if(delete)
						System.out.println("Record Deleted Successfully");
					else
						System.out.println("Something went wrong Please try after Sometime !");
					break;
			case 5: System.out.println("Update Student");
					System.out.println("1.Update Name \n2.Update CollegeName \n3. Update City \n4.Update Percentage");
					studentDetails stDetails = new studentDetails();
					
					System.out.println("Enter your choice");
					int ch = sc.nextInt();
					
					System.out.println("Enter Roll Number to Update");
					int roll = sc.nextInt();
					
					switch(ch) {
					case 1: System.out.println("Enter new name");
							String sname = sc.next();
					
							stDetails.setName(sname);
							boolean flag = msi.update(roll, sname, ch, stDetails);
							System.out.println(flag?"Record Updated Successfully":"Something went Wrong,Can not update Name");
							break;
					case 2: System.out.println("Enter new College Name");
							String clgName = sc.next();
							
							stDetails.setCollegeName(clgName);
							boolean cln = msi.update(roll,clgName,ch,stDetails);
							System.out.println(cln?"Record Updated Successfully":"Something went wrong, Can not update College Name");
							break;
					case 3: System.out.println("Enter new city name");
							String newCity = sc.next();
							
							stDetails.setCity(newCity);
							boolean updateCity = msi.update(roll, newCity, ch, stDetails);
							System.out.println(updateCity?"Record Updated successfully":"Can not update city");
							break;
							
					}
//					
					break;
			case 6: System.out.println("Thank you for using the application");
					System.exit(0);
			default: System.out.println("Please enter valid choice");
			}
			
		}
	}
	
}
