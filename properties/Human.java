package com.sharad.properties;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

    Human(){
        this.age = 20;
        this.name = "Sharad Kumar";
        this.salary = 57500;
        this.married = false;
    }
    Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
    }

    public static void main(String[] args){
        Human Sharad = new Human(20, "Sharad Kumar", 56500, false);

        System.out.println(Sharad.name);
    }
}
