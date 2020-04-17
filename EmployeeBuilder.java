package EmployeeWage;

import java.util.ArrayList;

public class EmployeeBuilder {

    public EmployeeBuilder(ArrayList<CompanyEmpWage> companies){
        EmpWageBuilder builder=new EmpWageBuilder(companies);
        int wage=builder.getTotalWage("Reliance",companies);
        System.out.println(wage);
    }
    public static void main(String[] args){
        //variables
        ArrayList<CompanyEmpWage> companies=new ArrayList<CompanyEmpWage>();
        companies.add(new CompanyEmpWage("Reliance",20,100,10));
        companies.add(new CompanyEmpWage("Bridgelabz",30,80,24));
        new EmployeeBuilder(companies);
    }
}
