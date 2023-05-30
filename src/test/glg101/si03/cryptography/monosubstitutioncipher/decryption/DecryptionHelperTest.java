/*
 * DecryptionHelperTest.java                                        May 28, 2023
 * CNAM MILLAU SI03 2022-2023, neither copyright nor copyleft.
 */
package test.glg101.si03.cryptography.monosubstitutioncipher.decryption;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.glg101.si03.cryptography.monosubstitutioncipher.decryption.DecryptionHelper;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for DecryptionHelper class.
 */
public class DecryptionHelperTest {
    private DecryptionHelper decryptionHelper;

    /**
     * Setup method that runs before each test.
     * Here, it initializes a new DecryptionHelper object.
     */
    @BeforeEach
    public void setUp() {
        decryptionHelper = new DecryptionHelper();
    }

    /**
     * [INIT-00]
     * Test to verify the DecryptionHelper object is created successfully.
     */
    @Test
    public void testObjectCreation() {
        assertNotNull(decryptionHelper, "DecryptionHelper object should not be null");
    }
}
