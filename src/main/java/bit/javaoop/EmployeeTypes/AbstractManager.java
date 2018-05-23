package bit.javaoop.EmployeeTypes;

import bit.javaoop.Payments.SalaryCalculator;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractManager extends AbstractEmployee {

    protected List<Employee> employees;


    public AbstractManager(String name, double salary, SalaryCalculator cal) {
        super(name, salary, cal);
        this.employees = new ArrayList<Employee>();
    }

    public Employee getEmployeeByName(String name) {
        for (Employee x : employees) {
            if (x.getName() == name) return x;
        }
        return null;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public abstract boolean canHire(double salary);

    public abstract void hire(String name, double salary);

}
