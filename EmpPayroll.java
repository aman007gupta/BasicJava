public class EmpPayroll {
	public static void main(String args[]) {
		System.out.println("Welcome to Emp Payroll");
		//Contant variable in capital latter
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int WAGE_PER_HOUR = 100;
		//Variables
		int empHrs = 0;
		int totalWage = 0;
		double empCheck = Math.floor(Math.random()*10)%3;
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Emp is permanent");
			empHrs = 8;
		} else if (empCheck == IS_PART_TIME) {
			System.out.println("Emp is part time");
			empHrs = 4;
		} else 
			System.out.println("Emp is absent");
		totalWage = empHrs * WAGE_PER_HOUR;
		System.out.println("Total wage of emp: " + totalWage);
	}
}
