package com.cognizant.tax;

public class TaxCalculator {
float basicSalary;
float tax;
boolean citizenship;

 public void calculateTax() {
	float tax=30*basicSalary/100;
	System.out.println("the tax of the employee for the"+" " +basicSalary+ "is" +" "+tax);
	
}
 public void deductTax() {
	 float tax=30*basicSalary/100;
	int nettSalary=((int) (basicSalary)-(int)(tax));
	System.out.println("the nett salary of the employee:" +nettSalary);
	
}
 public void validateSalary() {
	System.out.println("the salary and citizenship eligibility:");
	if(basicSalary>100000 && citizenship==true) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
}
	
}

