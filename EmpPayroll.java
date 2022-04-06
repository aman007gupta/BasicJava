public class EmpPayroll {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int WAGE_PER_HOUR = 100;
	public static final int NUM_OF_DAYS = 20;
	public static final int TOTAL_HRS = 50;

	public static void main(String args[]) {
		System.out.println("Welcome to Emp Payroll");
		int empHrs = 0;
		int totalHrs = 0;
		int totalWage = 0;
		int totalEmpWage = 0;
		int totalDays = 0;
		while (totalHrs < TOTAL_HRS && totalDays < NUM_OF_DAYS) {
			totalDays++;
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
			totalHrs += empHrs; 
			//totalWage = totalHrs * WAGE_PER_HOUR;
			//totalEmpWage += totalWage;
		}
		totalWage = totalHrs * WAGE_PER_HOUR;
		System.out.println("Total wage of emp: " + totalWage);
		System.out.println("Total Days: " + totalDays + " Total Hrs: " + totalHrs);
	}
}
