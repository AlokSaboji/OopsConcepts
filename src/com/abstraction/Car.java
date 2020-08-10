package com.abstraction;

public class Car {
    private String company;
    private String variant;
    private int numberOfTyres;

    Car(){
        this.numberOfTyres =4;
    }


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public void changeGear(int toNumber){
        System.out.println("Gear changed to :" + toNumber);
    }

}
