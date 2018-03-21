package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void shouldEvalueateToTrue() {
        //given
        boolean someVariable = false;
        //when
        someVariable = Boolean.logicalXor(!someVariable, someVariable);
        //then
        assertTrue(someVariable);
    }
}
