package testBasic;

public class Manager extends Employee {

	private double bonus;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public Manager(String name, double salary,int year,int month,int day) {
		super(name, salary, year, month, day);
		this.bonus=0d;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary+this.bonus;
	}
	
}
