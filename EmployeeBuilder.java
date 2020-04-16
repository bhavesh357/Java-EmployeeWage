package EmployeeWage;

import java.util.ArrayList;

public class EmployeeBuilder {
    static ArrayList<CompanyEmpWage> companies;

    public EmployeeBuilder(){
        EmpWageBuilder builder=new EmpWageBuilder(companies);
        builder.getTotalWage(companies);
    }
    public static void main(String[] args){
        //variables
        companies=new ArrayList<CompanyEmpWage>();
        companies.add(new CompanyEmpWage("Reliance",20,100,10));
        companies.add(new CompanyEmpWage("Bridgelabz",30,80,24));
        new EmployeeBuilder();
    }
}
