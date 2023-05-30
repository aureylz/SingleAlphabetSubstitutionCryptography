/*
 * MonoSubstitutionCipherTest.java                                  May 28, 2023
 * CNAM MILLAU SI03 2022-2023, neither copyright nor copyleft.
 */
package test.glg101.si03.cryptography.monosubstitutioncipher.cipher;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.glg101.si03.cryptography.monosubstitutioncipher.cipher.MonoSubstitutionCipher;
import main.glg101.si03.cryptography.monosubstitutioncipher.cipher.InvalidKeyException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for MonoSubstitutionCipher class.
 */
public class MonoSubstitutionCipherTest {
    private MonoSubstitutionCipher cipher;
    private static final String VALID_KEY = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private static final String INVALID_KEY_SHORT = "QWERTYUIO";
    private static final String INVALID_KEY_DUPLICATE = "QWERTYUIOPASDFGHJKLZXCVBNMB";

    /**
     * Setup method that runs before each test. Here, it initializes a new
     * MonoSubstitutionCipher object.
     */
    @BeforeEach
    public void setUp() {
        cipher = new MonoSubstitutionCipher(VALID_KEY);
    }

    /**
     * [INIT-00] Test to verify the MonoSubstitutionCipher object is created
     * successfully.
     */
    @Test
    public void testObjectCreation() {
        assertNotNull(
                cipher, 
                "MonoSubstitutionCipher object should not be null");
    }

    /**
     * [CODE-01] Test to verify that the encoded text is different from the
     * original.
     */
    @Test
    public void testEncodedTextIsDifferent() {
        String original = "HELLOWORLD";
        String encoded = cipher.encode(original);
        assertNotEquals(original, encoded);
    }

    /**
     * [CODE-01] Test to verify that identical text encoded with the same key
     * produces the same encoded text.
     */
    @Test
    public void testSameTextSameKey() {
        String original1 = "HELLOWORLD";
        String original2 = "HELLOWORLD";
        String encoded1 = cipher.encode(original1);
        String encoded2 = cipher.encode(original2);
        assertEquals(encoded1, encoded2);
    }

    /**
     * [CODE-01] Test to verify that an empty text remains empty after encoding.
     */
    @Test
    public void testEmptyText() {
        String original = "";
        String encoded = cipher.encode(original);
        assertEquals(original, encoded);
    }

    /**
     * [CODE-01] Test to verify that the encoded output matches exactly what is
     * expected.
     */
    @Test
    public void testExactOutput() {
        // First test with the classical alphabet
        String original0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String encoded0 = cipher.encode(original0);
        assertEquals(VALID_KEY, encoded0);

        // For the given KEY, "HELLOWORLD" is encoded as "ITSSGVGKSR"
        String original1 = "HELLO WORLD";
        String expected1 = "ITSSG VGKSR";
        String encoded1 = cipher.encode(original1);
        assertEquals(expected1, encoded1);

        // For the given KEY, "WORLDHELLO" is encoded as "VGKSRITSSG"
        String original2 = "WORLD HELLO";
        String expected2 = "VGKSR ITSSG";
        String encoded2 = cipher.encode(original2);
        assertEquals(expected2, encoded2);
    }

    /**
     * [DECODE-00] Test to verify that the MonoSubstitutionCipher object is created
     * successfully with a valid key.
     */
    @Test
    public static void testObjectCreationWithValidKey() {
        assertDoesNotThrow(() -> new MonoSubstitutionCipher(VALID_KEY));
    }

    /**
     * [DECODE-00] Test to verify that the MonoSubstitutionCipher object throws an
     * exception when a too short key is used.
     */
    @Test
    public void testObjectCreationWithShortKey() {
        assertThrows(
                InvalidKeyException.class, 
                () -> new MonoSubstitutionCipher(INVALID_KEY_SHORT));
    }

    /**
     * [DECODE-00] Test to verify that the MonoSubstitutionCipher object throws an
     * exception when a key with duplicate characters is used.
     */
    @Test
    public void testObjectCreationWithDuplicateKey() {
        assertThrows(
                InvalidKeyException.class, 
                () -> new MonoSubstitutionCipher(INVALID_KEY_DUPLICATE));
    }
}
