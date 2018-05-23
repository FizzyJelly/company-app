package bit.javaoop.EmployeeTypes;

import bit.javaoop.Payments.NoInsurancePayment;

public class Employee extends AbstractEmployee {


    public Employee(String name, double salary) {
        super(name, salary, new NoInsurancePayment());
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > 10_000;
    }
}
