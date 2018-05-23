package bit.javaoop.Payments;

public class NoInsurancePayment implements SalaryCalculator {


    @Override
    public double getActualSalary(double salary) {
        return salary * 0.85;
    }
}
