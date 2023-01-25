package org.college;

public class College extends Student {
	
	public void collegCname() {
		// TODO Auto-generated method stub
		collegeCode();
		
	}
	
	public void collegeCode() {
		// TODO Auto-generated method stub
		System.out.println("5308");

	}
	

	public static void main(String[] args) {
		College a=new College();
		a.collegCname();
		a.studentDept();
		a.studentName();
		a.studentId();
		a.hostelName();
		a.departmentName();
	}
}
