package org.emp;

public class Department {
static int id=1;
String name;
public static void main(String[] args) {
	Department d = new Department();
	d.id=2;
	d.name="Csc";
	
	Department i = new Department();
	i.id=3;
	i.name="IT";
	Department c = new Department();
	c.id=4;
	c.name="EEE";
	
	System.out.println(d.id);
	System.out.println(d.name);
	System.out.println(i.id);
	System.out.println(i.name);
	System.out.println(c.id);
	System.out.println(c.name);
	
	
}
}
