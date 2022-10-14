package com.cognizant.tax;

public class EmployeeTax {
	public static void main(String[] args) {
		TaxCalculator p=new TaxCalculator();
		p.basicSalary=25000;
		p.citizenship=true;
		p.calculateTax();
		p.deductTax();
		p.validateSalary();
		TaxCalculator t=new TaxCalculator();
		t.basicSalary=125000;
		t.citizenship=true;
		t.calculateTax();
		t.deductTax();
		t.validateSalary();
	}

}
