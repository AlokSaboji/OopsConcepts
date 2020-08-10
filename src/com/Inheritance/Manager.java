package com.Inheritance;

import java.util.List;

public class Manager extends Employee{
     private List<Employee> reportees;

     Manager(){
         super();
     }

    public List<Employee> getReportees() {
        return reportees;
    }

    public void setReportees(List<Employee> reportees) {
        this.reportees = reportees;
    }
}
