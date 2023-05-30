/*
 * KeyValidatorTest.java                                            May 28, 2023
 * CNAM MILLAU SI03 2022-2023, neither copyright nor copyleft.
 */
package test.glg101.si03.cryptography.monosubstitutioncipher.cipher;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.glg101.si03.cryptography.monosubstitutioncipher.cipher.KeyValidator;
import main.glg101.si03.cryptography.monosubstitutioncipher.cipher.InvalidKeyException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for KeyValidator class.
 */
public class KeyValidatorTest {
    private KeyValidator keyValidator;

    /**
     * Setup method that runs before each test. Here, it initializes a new
     * KeyValidator object.
     */
    @BeforeEach
    public void setUp() {
        keyValidator = new KeyValidator();
    }

    /**
     * [INIT-00] Test to verify the KeyValidator object is created successfully.
     */
    @Test
    public void testObjectCreation() {
        assertNotNull(keyValidator, "KeyValidator object should not be null");
    }

    /**
     * [CODE-00] Tests that the key is a bijection.
     */
    @Test
    public void testIsBijection() {
        assertTrue(keyValidator.isBijection("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        assertFalse(keyValidator.isBijection("ABCDEFGHIJKLMNOPQRSTUVWXYA"));
    }

    /**
     * [CODE-00] Tests that the key contains no duplicate characters.
     */
    @Test
    public void testNoDuplicates() {
        assertTrue(keyValidator.noDuplicates("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        assertFalse(keyValidator.noDuplicates("ABCDEFGHIJKLMNOPQRSTUVWXYA"));
    }

    /**
     * [CODE-00] Tests that an error is thrown if the key is invalid.
     */
    @Test
    public void testThrowsErrorOnInvalidKey() {
        Exception exception = assertThrows(
                InvalidKeyException.class, 
                () -> keyValidator.validate("ABCDEFGHIJKLMNOPQRSTUVWXYA"));

        String expectedMessage = "Invalid key";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
