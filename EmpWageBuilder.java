package EmployeeWage;

public class EmpWageBuilder {
    //Constants
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;
    //variables
    String companyName;
    int empRatePerHour;
    int maxHours;
    int maxDays;
    int empHrs;
    int empWage;
    int monthsHours;
    int days;

    public EmpWageBuilder(String companyName, int ratePerHour, int maxHours, int maxDays) {
        this.companyName = companyName;
        this.empRatePerHour = ratePerHour;
        this.maxHours = maxHours;
        this.maxDays = maxDays;
        calculate();
    }

    public void calculate() {
        this.empHrs = 0;
        this.empWage = 0;
        this.monthsHours = 0;
        this.days = 0;
        //Computation
        while (days < this.maxDays && monthsHours < this.maxHours) {
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
        empWage = monthsHours * this.empRatePerHour;
        System.out.println(this.companyName + " Emp Wage: " + empWage);
    }
}
