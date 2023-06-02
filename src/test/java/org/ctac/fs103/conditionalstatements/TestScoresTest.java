package org.ctac.fs103.conditionalstatements;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestScoresTest {
    @DisplayName("Test grade() method")
    @Test
    void testGrade() {
        assertEquals("Your grade is an A :)", TestScores.grade(95));
        assertEquals("Your grade is a D", TestScores.grade(65));
    }
}
