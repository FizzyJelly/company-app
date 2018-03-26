package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedBudgetManagerTest {

    @Test
    void isSatisfied() {
        FixedBudgetManager Bob = new FixedBudgetManager("Bob",21_000,10_000);
        boolean result=Bob.isSatisfied();
        assertTrue(result);
    }

    @Test
    void canHire() {
        FixedBudgetManager Bob = new FixedBudgetManager("Bob",13_000,10_000);
        boolean result=Bob.canHire(3_000);
        assertTrue(result);
    }

}