package staff.management;

import staff.Employee;

public class Director extends Employee {

    private double budget;

    public Director(String name, String NI, int salary, double budget) {
        super(name, NI, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public int payBonus() {
        return getSalary() / 50;
    }

}
