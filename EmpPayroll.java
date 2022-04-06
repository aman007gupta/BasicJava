public class EmpPayroll {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public static int computeEmpWage(String company, int wagePerHr, int numDays, int totalEmpHrs) {
                int empHrs = 0;
		int totalHrs = 0;
		int totalWage = 0;
		int totalEmpWage = 0;
		int totalDays = 0;
		while (totalHrs < totalEmpHrs && totalDays < numDays) {
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
		}
		totalWage = totalHrs * wagePerHr;
		System.out.println("Total wage of company: " + company + " is: " + totalWage);
		System.out.println("Total Days: " + totalDays + " Total Hrs: " + totalHrs);

		return totalWage;
	}

	public static void main(String args[]) {
		System.out.println("Welcome to Emp Payroll");
		computeEmpWage("BB", 100, 20, 40);
		computeEmpWage("RT", 120, 22, 45);
	}
}
