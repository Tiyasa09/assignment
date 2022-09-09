package lab08th;

public class Manager {
		public static void main(String[] args) {
			System.out.println("manager's details:");
			Employeee aa=new Employeee();
			aa.Employeee(126534,"peter", "Chennai India", 237844, 65000);
			aa.calculateSalary();
	}
}
class Travel1 extends Manager{
	void calculateTransportAllowance() {
		double basicSalary=65000;
		double transportAllowance=(15*basicSalary)/100;
		System.out.println("manager's travelallowance:"+transportAllowance);
		
}}
class InheritanceActivity2{
	public static void main(String[] args) {
		Travel1 xx=new Travel1();
		xx.calculateTransportAllowance();
	}
}