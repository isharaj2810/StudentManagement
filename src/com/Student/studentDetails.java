package com.Student;


public class studentDetails {
	private String name;
	private int rollNumber;
	private String collegeName;
	private String City;
	private double percentage;
//	
//	studentDetails(){
//		
//	}
	
	public studentDetails(String name, String collegeName, String city, double percentage) {
		this.name = name;
		this.collegeName = collegeName;
		City = city;
		this.percentage = percentage;
	}

	public studentDetails(String name, int rollNumber, String collegeName, String city, double percentage) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.collegeName = collegeName;
		this.City = city;
		this.percentage = percentage;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "studentDetails [name=" + name + ", rollNumber=" + rollNumber + ", collegeName=" + collegeName
				+ ", City=" + City + ", percentage=" + percentage + "]";
	}
	
	
	
    
}
