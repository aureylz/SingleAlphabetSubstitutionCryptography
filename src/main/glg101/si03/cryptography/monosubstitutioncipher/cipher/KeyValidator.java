/*
 * KeyValidator.java                                                May 28, 2023
 * CNAM MILLAU SI03 2022-2023, neither copyright nor copyleft.
 */
package main.glg101.si03.cryptography.monosubstitutioncipher.cipher;

import java.util.HashSet;
import java.util.Set;

/**
 * This class is responsible for validating a cipher key.
 *
 * @author aureylz
 */
public class KeyValidator {

    /** Default constructor. */
    public KeyValidator() {
        // Intentionally left blank.
    }

    /**
     * Checks whether the given key is a bijection.
     * <p>
     * A bijection in the context of a substitution cipher key means that every
     * letter in the alphabet is present exactly once in the key. This is
     * accomplished by checking that the number of unique characters in the key
     * (its set size) is equal to the length of the English alphabet, and that
     * the key's length is also equal to the length of the alphabet.
     * </p>
     * 
     * @param key The substitution cipher key.
     * @return true if the key is a bijection, false otherwise.
     */
    public boolean isBijection(String key) {
        Set<Character> set = new HashSet<>();
        for (char c : key.toCharArray()) {
            set.add(c);
        }
        return set.size() == 26 && key.length() == 26;
    }

    /**
     * Checks whether the given key contains no duplicate characters.
     * <p>
     * If the key is a bijection, it automatically contains no duplicates.
     * </p>
     * 
     * @param key The substitution cipher key.
     * @return true if the key contains no duplicates, false otherwise.
     */
    public boolean noDuplicates(String key) {
        return isBijection(key);
    }

    /**
     * Validates the given key.
     * 
     * @param key The substitution cipher key.
     * @throws InvalidKeyException if the key is invalid.
     */
    public void validate(String key) throws InvalidKeyException {
        if (!isBijection(key)) {
            throw new InvalidKeyException("Invalid key");
        }
    }
}
