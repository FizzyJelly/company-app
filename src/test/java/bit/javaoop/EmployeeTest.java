package bit.javaoop;

import bit.javaoop.EmployeeTypes.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmployeeTest {

    @Test
    void shouldBeSatisfied() {
        //given
        Employee highSalaryEmployee = new Employee("Bogaty pracownik", 50_000);
        //when
        boolean result = highSalaryEmployee.isSatisfied();
        //then
        assertTrue(result);
    }

    @Test

    void shouldNotBeSatisfied(){
        Employee poorGuy = new Employee(("Biedak"),1000);
        boolean result = poorGuy.isSatisfied();
        assertFalse(result);
    }
}