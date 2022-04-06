public class EmpPayroll {
	public static void main(String args[]) {
		System.out.println("Welcome to Emp Payroll");
		//Contant variable in capital latter
		int IS_FULL_TIME = 1;
		int WAGE_PER_HOUR = 100;
		//Variables
		int empHrs = 0;
		int totalWage = 0;
		double empCheck = Math.floor(Math.random()*10)%2;
		if (empCheck == IS_FULL_TIME) {  //for single statement no need of brackets
			System.out.println("Emp is present");
			empHrs = 8;
		} else {
			System.out.println("Emp is absent");
			empHrs = 0;
		}
		totalWage = empHrs * WAGE_PER_HOUR;
		System.out.println("Total wage of emp: " + totalWage);
	}
}
