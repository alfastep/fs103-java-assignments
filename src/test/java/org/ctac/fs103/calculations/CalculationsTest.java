package org.ctac.fs103.calculations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationsTest {
    @DisplayName("Test add(), subtract(), multiply(), and divide() methods")
    @Test
    void testAdd() {
        assertEquals(4, Calculations.add(3, 1));
        assertEquals(9, Calculations.subtract(17,8));
        assertEquals(15, Calculations.multiply(5,3));
        assertEquals(11, Calculations.divide(77,7));
    }

}
