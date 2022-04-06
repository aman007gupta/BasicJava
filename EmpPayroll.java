public class EmpPayroll {
	public static void main(String args[]) {
		System.out.println("Welcome to Emp Payroll");
		//Contant variable in capital latter
		int IS_FULL_TIME = 1;
		double empCheck = Math.floor(Math.random()*10)%2;
		if (empCheck == IS_FULL_TIME)  //for single statement no need of brackets
			System.out.println("Emp is present");
		else
			System.out.println("Emp is absent");
	}
}
