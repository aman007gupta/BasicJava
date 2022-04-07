public class EmpPayroll {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private final String company;
	private final int wagePerHr;
	private final int numDays;
	private final int totalEmpHrs;
	private int totalWage;

	public EmpPayroll(String company, int wagePerHr, int numDays, int totalEmpHrs) {
		this.company = company;
		this.wagePerHr = wagePerHr;
		this.numDays = numDays;
		this.totalEmpHrs = totalEmpHrs;
	}

	public void computeEmpWage() {
                int empHrs = 0;
		int totalHrs = 0;
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
		System.out.println("Total Days: " + totalDays + " Total Hrs: " + totalHrs);
	}

	@Override
	public String toString() {
		return "Total Emp Wage for Comapny: " + company + " is: " + totalWage;
	}
	public static void main(String args[]) {
		System.out.println("Welcome to Emp Payroll");
		EmpPayroll BB = new EmpPayroll("BB", 100, 20, 40);
		EmpPayroll RT = new EmpPayroll("RT", 120, 25, 45);
		BB.computeEmpWage();
		System.out.println(BB);
		RT.computeEmpWage();
		System.out.println(RT);
	}
}
