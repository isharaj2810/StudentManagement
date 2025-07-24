package com.studentInterface;

import com.Student.studentDetails;

public interface StudentInterface {
	public boolean insertStudent(studentDetails s);
	public boolean delete(int roll);
	public boolean update(int roll, String update, int choice, studentDetails s);
	public void showAllStudent();
	public boolean showStudentById(int roll);
	
}
