package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class CountCharacterTest {
    private static CountCharacter countCharacter;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        countCharacter = new CountCharacter();
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        countCharacter = null;
    }
    @Test
    public void testCountCharacter_CharacterAndStringGiven_ShouldReturnFrequencyOfOccurenceOfCharacter() {

        assertEquals(10, countCharacter.countOccurences("Java is java again java again", 'a'));

        assertEquals(0, countCharacter.countOccurences("My Name is Poorvi", 'j'));

        assertNotNull(countCharacter.countOccurences("I learn at stackroute", ' '));

        assertNotEquals(-1, countCharacter.countOccurences("CGI is a software company", 'z'));
    }
}
