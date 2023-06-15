package com.sharad.properties;

/* Write a Java program to create a class called Employee with methods called work() and getSalary().
 Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().*/

public class Employee {
    final int salary;
    public Employee(int salary){
        this.salary=salary;
    }
    public void work(){
        System.out.println("Working as an Employee");
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
    public static void main(String[] args){
        Employee empl = new Employee(60000);
        HRManager mngr = new HRManager(89000);

        empl.work();
        System.out.println("Employee salary: "+emp.salary);
        mngr.work();
        System.out.println("Manager salary: "+mgr.salary);
    }
}
