/*
 * FrequencyAnalyzerTest.java                                       May 28, 2023
 * CNAM MILLAU SI03 2022-2023, neither copyright nor copyleft.
 */
package test.glg101.si03.cryptography.monosubstitutioncipher.analysis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.glg101.si03.cryptography.monosubstitutioncipher.analysis.FrequencyAnalyzer;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for FrequencyAnalyzer class.
 */
public class FrequencyAnalyzerTest {
    private FrequencyAnalyzer analyzer;

    /**
     * Setup method that runs before each test.
     * Here, it initializes a new FrequencyAnalyzer object.
     */
    @BeforeEach
    public void setUp() {
        analyzer = new FrequencyAnalyzer();
    }

    /**
     * [INIT-00]
     * Test to verify the FrequencyAnalyzer object is created successfully.
     */
    @Test
    public void testObjectCreation() {
        assertNotNull(analyzer, "FrequencyAnalyzer object should not be null");
    }
}
