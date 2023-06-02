package org.ctac.fs103.conditionalstatements;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SameOrNahTest {
    @DisplayName("Test match() method")
    @Test
    void testMatch() {
        assertTrue(SameOrNah.match("LOrd", "loRD"));
        assertFalse(SameOrNah.match("jeep", "jeepp"));
    }
}
