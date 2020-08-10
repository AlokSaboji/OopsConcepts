package com.polymorphism;

class Main
{
    public static void main(String[] args)
    {
        //Parent class reference is pointing to a parent object
        Animal animal = new Animal();
        animal.sound(); //Some sound

        //Parent class reference is pointing to a child object
        Animal animal1 = new Lion();
        animal1.sound(); //Roar
    }
}