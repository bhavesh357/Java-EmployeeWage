package EmployeeWage;

import java.util.ArrayList;

public class CompanyEmpWage {
    private String companyName;
    private int empRatePerHour;
    private int maxHours;
    private int maxDays;
    private int totalWage;
    ArrayList<Integer> dailyWage=new ArrayList<Integer>();

    public CompanyEmpWage(String companyName,int ratePerHour,int maxHours,int maxDays){
        this.companyName = companyName;
        this.empRatePerHour = ratePerHour;
        this.maxHours = maxHours;
        this.maxDays = maxDays;
    }

    public int getEmpRatePerHour() {
        return empRatePerHour;
    }

    public int getMaxDays() {
        return maxDays;
    }

    public int getMaxHours() {
        return maxHours;
    }

    public int getTotalWage() {
        return totalWage;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void addDailyWage(int wage){
        dailyWage.add(wage);
    }
}
