package bit.javaoop.EmployeeTypes;

import bit.javaoop.Payments.SalaryCalculator;

public abstract class AbstractEmployee {
    private String name;
    private double salary;
    private SalaryCalculator cal;

    public AbstractEmployee(String name, double salary, SalaryCalculator cal) {
        this.name = name;
        this.salary = salary;
        this.cal = cal;
    }

    public abstract boolean isSatisfied();

    public String getName() {
        return name;
    }


    public double getSalary() {
        return cal.getActualSalary(salary);
    }
}
