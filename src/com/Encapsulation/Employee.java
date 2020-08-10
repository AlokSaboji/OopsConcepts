package com.Encapsulation;

public class Employee {
    private String name;
    private String lastName;
    private int age;
    private String nationality;


    Employee(){
        this.nationality = "Indian";
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if(name.length()<=1){
            System.out.println("Name not set as name cannot have a single letter");
        }else
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }



}
