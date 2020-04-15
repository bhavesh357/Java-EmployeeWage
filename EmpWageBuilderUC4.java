public class EmpWageBuilderUC4{
	//Constants
	static final int IS_FULL_TIME =2;
	static final int EMP_RATE_PER_HOUR =20;
	static final int IS_PART_TIME=1;
	public static void main(String[] args){
		//variables
		int empHrs=0;
		int empWage=0;
		//Computation
		int empCheck= (int) (Math.random() * 100)% 3;
		switch (empCheck){
			case IS_FULL_TIME: 	empHrs=8;
								break;
			case IS_PART_TIME: 	empHrs=4;
								break;
			default: 			empHrs=0;
								break;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: "+empWage);
	}
}