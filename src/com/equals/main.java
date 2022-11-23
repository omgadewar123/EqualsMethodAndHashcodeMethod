package com.equals;

public class main {
	
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setId(10);
		emp.setName("om");
		
		Employee emp1 = new Employee();
		emp1.setId(10);
		emp1.setName("om");
		
		System.out.println(emp.hashCode());
		
		System.out.println(emp1.hashCode());
		
		System.out.println("Shallow compare : "+(emp==emp1));
		
		System.out.println("Deep compare :"+ (emp.equals(emp1)));
	}

}
