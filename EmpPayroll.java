public class EmpPayroll {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int WAGE_PER_HOUR = 100;
	public static final int NUM_OF_DAYS = 20;

	public static void main(String args[]) {
		System.out.println("Welcome to Emp Payroll");
		int empHrs = 0;
		int totalWage = 0;
		int totalEmpWage = 0;
		for (int days = 0; days < NUM_OF_DAYS; days++) {
			int empCheck = (int) Math.floor(Math.random()*10)%3;
			switch (empCheck) {
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				case IS_PART_TIME:
					empHrs = 4;
					break;
				default:
					empHrs = 0;
			}
		totalWage = empHrs * WAGE_PER_HOUR;
		totalEmpWage += totalWage;
		}
		System.out.println("Total wage of emp: " + totalEmpWage);
	}
}
