package com.sharad.properties;

/* Write a Java program to create a class called Employee with methods called work() and getSalary().
 Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().*/
public class Employee {
    final int salary;
    public Employee(int salary){
        this.salary = salary;
    }
    public void work(){
        System.out.println("working as an employee!");
    }
    public int getSalary(){
        return salary;
    }

    static class HRManager extends Employee{
        public HRManager(int salary){
            super(salary);
        }
        public void work(){
            System.out.println("\nManaging Employees");
        }
        public void addEmployee(){
            System.out.println("\nAdding new Employee!");
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee(56000);
        HRManager hrmanager = new HRManager(78090);
        employee.work();
        System.out.println("Employee salary: "+employee.salary);

        hrmanager.work();
        System.out.println("Manager salary: "+hrmanager.salary);
    }
}