package EmployeeWage;

import java.util.ArrayList;

public class EmployeeBuilder {
    static CompanyEmpWage[] companies;

    public EmployeeBuilder(){
        new EmpWageBuilder(companies);
    }
    public static void main(String[] args){
        //variables
        companies=new CompanyEmpWage[2];
        //companies.add(new CompanyEmpWage("Reliance",20,100,20));
        //companies.add(new CompanyEmpWage("Bridgelabz",40,80,24));
        companies[0]=new CompanyEmpWage("Reliance",20,100,20);
        companies[1]=new CompanyEmpWage("Bridgelabz",40,80,24);
        new EmployeeBuilder();
    }
}
