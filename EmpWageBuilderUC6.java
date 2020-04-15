public class EmpWageBuilderUC6{
	//Constants
	static final int IS_FULL_TIME =2;
	static final int EMP_RATE_PER_HOUR =20;
	static final int IS_PART_TIME=1;
	static final int MAX_HOURS=100;
	static final int MAX_DAYS=20;
	public static void main(String[] args){
		//variables
		int empHrs=0;
		int empWage=0;
		int monthsHours=0;
		int days=0;
		//Computation
		while( days<MAX_DAYS && empHrs<MAX_HOURS ) {
			int empCheck = (int) (Math.random() * 100) % 3;
			switch (empCheck) {
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				case IS_PART_TIME:
					empHrs = 4;
					break;
				default:
					empHrs = 0;
					break;
			}
			monthsHours += empHrs;
			days++;
		}
		empWage=monthsHours* EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
	}
}