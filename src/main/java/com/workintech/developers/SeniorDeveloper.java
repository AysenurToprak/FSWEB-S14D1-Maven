package com.workintech.developers;

public class SeniorDeveloper extends Employee{


    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }


    @Override
    public void work() {
        System.out.println(getName() + " is leading projects and mentoring others.");
        setSalary(getSalary() + 600);
    }
}
