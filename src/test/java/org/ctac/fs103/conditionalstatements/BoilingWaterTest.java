package org.ctac.fs103.conditionalstatements;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoilingWaterTest {
    @DisplayName("Test boiling() method")
    @Test
    void testBoiling() {
        assertEquals("Water is boiling!", BoilingWater.boiling(214));
    }
    
}
