package com.workintech.developers;

public class JuniorDeveloper extends  Employee{
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is learning and coding basic tasks.");
        setSalary(getSalary() + 200); // Junior maaş artışı
    }
}
