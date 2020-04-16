package EmployeeWage;

public class EmployeeBuilder {
    EmpWageBuilder builder;
    public EmployeeBuilder(String companyName,int ratePerHour,int maxHours,int maxDays){
        this.builder= new EmpWageBuilder(companyName,ratePerHour,maxHours,maxDays);
    }

    public static void main(String[] args){
        //variables
        new EmployeeBuilder("Reliance",20,100,20);
        new EmployeeBuilder("BridgeLabz",40,80,14);
    }
}
