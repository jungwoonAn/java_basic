package oop_exam2;

public class Sales extends Employee implements Bouns {
	
	public Sales() {}	

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public double tax() {
		return getSalary() * 0.13;
	}
	
	@Override
	public void incentive(int pay) {
		setSalary(getSalary() + (pay *= 1.2));
	}
	
	public double getExtraPay() {	
		return getSalary() * 0.03;
	}

}
