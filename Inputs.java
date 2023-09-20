
public class Inputs {

	public static void main(String[] args) {
		String employeeNo,name,designation,genDate;
		int daysWork,payRate;
		int basPay=(daysWork*payRate);
		int pf=basPay/10;
		final int profTax=0.2 * basPay;
		int deduct=pf+profTax;
		int net=basPay-deduct;
		
		Scanner employee=new Scanner(System.in);
		employeeNo=employee.next();
		System.out.println("ENTER THE EMPLOYEE NUMBER TO GENERATE PAYSLIP:");
		System.out.println("");
		System.out.println("SHREE KRISHNA CHEMISTS AND DRUGGIST");
		System.out.println("SALARY MONTH 9 2013");
		System.out.println("");
		System.out.println("EMP.NO.:"+employeeNo+"             EMP.NAME:"+name+"      DESIGNATION:"+designation);
		System.out.println("DAYS WORKED:"+daysWork+"           PAY RATE:"+payRate+"   GEN.DATE:"+genDate);
		System.out.println("__________________________________________________________________________________");
		System.out.println("EARNINGS         AMOUNT(RS.)            DEDUCTIONS         AMOUNT(RS.)");
		System.out.println("_________________________________________________________________________________");
		System.out.println("BASIC PAY        "+basPay+"             P.F.               "+pf);
		System.out.println("                                        PROF.TAX           "+profTax);
		System.out.println("");
		System.out.println("______________________________________________________________________________________");
		System.out.println("GROSS EARN.      "+basPay+"             TOTAL DEDUCT.      "+deduct);
		System.out.println("                                        NET PAY            "+net);
		System.out.println("_______________________________________________________________________________________");
		

	}

}
