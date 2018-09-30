package testBasic;

import java.time.LocalDate;

public class Employee {
	
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param name the employee's name
	 * @param salary the employee's salary
	 */
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public Employee(String name, double salary,int year,int month,int day) {
		this(name,salary);
		this.hireDay = LocalDate.of(year, month, day);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getHireDay() {
		return hireDay;
	}
	public void setHireDay(LocalDate hireDay) {
		this.hireDay = hireDay;
	}
	
	public void raiseSalary(double byPercent) {
		double raise=salary*byPercent/100;
		salary+=raise;
	}
	

}
