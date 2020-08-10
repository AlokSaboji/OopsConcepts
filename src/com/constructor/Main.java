package com.constructor;


public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(emp.getNationality());
        emp.setNationality("German");
        System.out.println(emp.getNationality());

    }
}
