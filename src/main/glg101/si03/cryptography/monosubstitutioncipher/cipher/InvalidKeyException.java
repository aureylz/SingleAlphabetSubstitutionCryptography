/*
 * InvalidKeyException.java                                         May 28, 2023
 * CNAM MILLAU SI03 2022-2023, neither copyright nor copyleft.
 */
package main.glg101.si03.cryptography.monosubstitutioncipher.cipher;

/**
 * This exception is thrown when an invalid key is used in a
 * MonoSubstitutionCipher.
 * 
 * @author aureylz
 */
public class InvalidKeyException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidKeyException with the specified detail message.
     * 
     * @param message The detail message saved for later retrieval by the
     *                getMessage() method.
     */
    public InvalidKeyException(String message) {
        super(message);
    }
}
