package org.emp;

public class Employee {
public void empID(int a,String s)
{
System.out.println("Employee ID: "+a);
System.out.println("Employee name: "+s);
}
public static void main(String[] args) {
	Employee e = new Employee();
	e.empID(1, "Keerthi");
}
}
