package org.emp;

public class StudentDetails {
public static void csc() {
	System.out.println("CSC Department Student Details");
}
public void it()
{
	System.out.println("IT Department Student Details");
}
public void eee()
{
	System.out.println("EEE Department Student Details");
}
static {
	System.out.println("Overall department student details");
}
public static void main(String[] args) {
	csc();
	StudentDetails s = new StudentDetails();
	s.it();
	s.eee();
	
}
}

