/*
 * FileHandlerTest.java                                             May 28, 2023
 * CNAM MILLAU SI03 2022-2023, neither copyright nor copyleft.
 */
package test.glg101.si03.cryptography.monosubstitutioncipher.file;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.glg101.si03.cryptography.monosubstitutioncipher.file.FileHandler;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for FileHandler class.
 */
public class FileHandlerTest {
    private FileHandler fileHandler;

    /**
     * Setup method that runs before each test.
     * Here, it initializes a new FileHandler object.
     */
    @BeforeEach
    public void setUp() {
        fileHandler = new FileHandler();
    }

    /**
     * [INIT-00]
     * Test to verify the FileHandler object is created successfully.
     */
    @Test
    public void testObjectCreation() {
        assertNotNull(fileHandler, "FileHandler object should not be null");
    }
}
