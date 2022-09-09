package lab08th;

public class Trainee {
	public static void main(String[] args) {
		System.out.println("trainee's details:");
			Employeee cc=new Employeee();
			cc.Employeee(29846, "jack", "Mumbai India", 442085, 45000);
			cc.calculateSalary();

}}
class Travel extends Trainee{
	void calculateTransportAllowance() {
		double basicSalary=45000;
		double transportAllowance=(10*basicSalary)/100;
		System.out.println("trainee's travelallowance:"+transportAllowance);
		
}}
class InheritanceActivity1{
	public static void main(String[] args) {
		Travel xx=new Travel();
		xx.calculateTransportAllowance();
	}
}