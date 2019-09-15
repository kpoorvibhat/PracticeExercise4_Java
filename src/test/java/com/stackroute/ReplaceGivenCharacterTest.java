package com.stackroute;

//This program replaces all d with f
//and all l with t in the given string


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class ReplaceGivenCharacterTest {
    private static ReplaceGivenCharacter replaceGivenCharacter;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        replaceGivenCharacter = new ReplaceGivenCharacter();
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        replaceGivenCharacter = null;
    }
    @Test
    public void testReplaceCharacter_FromGivenString_ShouldReturnNewStringWithReplacedCharacter() {

        assertEquals("faity fry", replaceGivenCharacter.replaceDAndL("daily dry"));

        assertNotNull("Poorvi", replaceGivenCharacter.replaceDAndL("Poorvi"));

        assertNotEquals("faity fry", replaceGivenCharacter.replaceDAndL("Daily Dry"));

    }
}
