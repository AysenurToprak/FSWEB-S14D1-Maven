package com.workintech.developers;

public class HRManager extends Employee {


    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;


    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        int juniorSize = 0;
        int midSize = 0;
        int seniorSize = 0 ;
        this.juniorDevelopers = new JuniorDeveloper[juniorSize];
        this.midDevelopers = new MidDeveloper[midSize];
        this.seniorDevelopers = new SeniorDeveloper[seniorSize];
    }


    @Override
    public void work() {
        System.out.println(getName() + " is managing employees.");
        setSalary(getSalary() + 500); // HRManager maaş artışı
    }


    public void addEmployee(JuniorDeveloper junior) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = junior;
                System.out.println("Junior Developer added.");
                return;
            }
        }
        System.out.println("Junior Developer array is full.");
    }


    public void addEmployee(MidDeveloper mid) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = mid;
                System.out.println("Mid Developer added.");
                return;
            }
        }
        System.out.println("Mid Developer array is full.");
    }

    // Senior Developer ekleme
    public void addEmployee(SeniorDeveloper senior) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = senior;
                System.out.println("Senior Developer added.");
                return;
            }
        }
        System.out.println("Senior Developer array is full.");
    }
}
