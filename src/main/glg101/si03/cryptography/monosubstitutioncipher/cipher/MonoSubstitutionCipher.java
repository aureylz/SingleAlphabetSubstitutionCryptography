/*
 * MonoSubstitutionCipher.java                                      May 28, 2023
 * CNAM MILLAU SI03 2022-2023, neither copyright nor copyleft.
 */
package main.glg101.si03.cryptography.monosubstitutioncipher.cipher;

/**
 * This class is responsible for encoding text using a substitution cipher.
 * 
 * @author aureylz
 */
public class MonoSubstitutionCipher {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String key;

    /**
     * Constructs a MonoSubstitutionCipher with the given key.
     * 
     * @param key The substitution cipher key.
     * @throws InvalidKeyException If the key is not valid.
     */
    public MonoSubstitutionCipher(String key) throws InvalidKeyException {
        KeyValidator validator = new KeyValidator();
        if (!validator.isBijection(key)) {
            throw new InvalidKeyException("Invalid key");
        }
        this.key = key;
    }
    /**
     * Encodes the given text using the substitution cipher key.
     * 
     * @param text The text to encode.
     * @return The encoded text.
     */
    public String encode(String text) {
        StringBuilder encoded = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                int alphabetIndex = ALPHABET.indexOf(c);
                encoded.append(key.charAt(alphabetIndex));
            } else {
                encoded.append(c);
            }
        }

        return encoded.toString();
    }
}
