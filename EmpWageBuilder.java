package EmployeeWage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class EmpWageBuilder {
    //Constants
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;
    //variables
    int empHrs;
    int empWage;
    int monthsHours;
    int days;

    public EmpWageBuilder(ArrayList<CompanyEmpWage> companies) {
        for(CompanyEmpWage c: companies){
            calculate(c);
        }
    }

    public void calculate(CompanyEmpWage c) {
        this.empHrs = 0;
        this.empWage = 0;
        this.monthsHours = 0;
        this.days = 0;
        //Computation
        while (days < c.getMaxDays() && monthsHours < c.getMaxHours()) {
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
            c.addDailyWage(empHrs * c.getEmpRatePerHour());
            monthsHours += empHrs;
            days++;
        }
        empWage = monthsHours * c.getEmpRatePerHour();
        c.setTotalWage(empWage);
        System.out.println(c.getCompanyName() + " Emp Wage: " + empWage);
    }

    public int getTotalWage(String company,ArrayList<CompanyEmpWage> companies) {
        for(CompanyEmpWage c: companies)
        if(company.equals(c.getCompanyName())){
            return c.getTotalWage();
        }
        return 0;
    }
}
