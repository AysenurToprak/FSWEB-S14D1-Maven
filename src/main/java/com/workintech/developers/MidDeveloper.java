package com.workintech.developers;

public class MidDeveloper extends  Employee{

    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }


    @Override
    public void work() {
        System.out.println(getName() + " is working on complex tasks.");
        setSalary(getSalary() + 400);
    }
}
