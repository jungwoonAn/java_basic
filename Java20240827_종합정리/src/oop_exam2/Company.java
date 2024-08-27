package oop_exam2;

public class Company {

	public static void main(String[] args) {
		// Employee 배열에 객체들을 생성하여 저장한다.		
		Employee[] emps = new Employee[2];
		emps[0] = new Secretary("Duke", 1, "secretary", 800);
		emps[1] = new Sales("Tuxi", 2, "sales", 1200);
		
		
		// printEmployee() 메서드를 호출하여 Employee 배열의 객체들 정보를 출력한다.
		// 이 때는 세금을 출력하지 않는다.
		printEmployee(emps, false);
		
		// 모든 직원에게 인센티브로 100씩 지급한다.(직원에 따라 적용되는 인센티브 금액은 다르다.)
		System.out.printf("\n[인센티브 100 지급]\n");
		for(Employee emp : emps) {			
			if(emp instanceof Secretary) {
				Secretary secretary = (Secretary)emp;
				secretary.incentive(100);
			}else {
				Sales sales = (Sales)emp;
				sales.incentive(100);
			}
		}
		
		// printEmployee() 메서드를 호출하여 Employee 배열의 객체들 정보와 세금을 출력한다.
		printEmployee(emps, true);
		
	}
	
	public static void printEmployee(Employee[] emps, boolean isTax) {
		
		// isTax의 참/거짓 여부에 따라서 텍스 출력 여부를 결정하여 처리한다.
		if(isTax) {
			System.out.printf("name\t department\t salary\t tax\t extra pay \n");
			System.out.println("---------------------------------------------------");
			
			for(Employee emp : emps) {
				if(emp instanceof Sales) {		
					Sales sales = (Sales)emp;
					System.out.printf("%s\t %-9s\t %d\t %.1f\t %.1f \n", sales.getName(), sales.getDepartment(), sales.getSalary(), sales.tax(), sales.getExtraPay());
				}else {
					System.out.printf("%s\t %9s\t %d\t %.1f\t \n", emp.getName(), emp.getDepartment(), emp.getSalary(), emp.tax() );
				}
			}			
		}else {
			// 객체의 정보를 출력한다
			System.out.printf("name\t department\t salary\t extra pay \n");
			System.out.println("-------------------------------------------");
			
			for(Employee emp : emps) {
				if(emp instanceof Sales) {		
					Sales sales = (Sales)emp;
					System.out.printf("%s\t %-9s\t %d\t %.1f \n", sales.getName(), sales.getDepartment(), sales.getSalary(), sales.getExtraPay());
				}else {
					System.out.printf("%s\t %9s\t %d\t \n", emp.getName(), emp.getDepartment(), emp.getSalary() );
				}
			}
		}
	}

}
