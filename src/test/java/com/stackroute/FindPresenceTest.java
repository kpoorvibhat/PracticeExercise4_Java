package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class FindPresenceTest {
    private static FindPresence findPresence;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        findPresence = new FindPresence();
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        findPresence = null;
    }
    @Test
    public void testFindPresence_FromGivenString_ShouldReturnBoolean() {

        assertTrue(findPresence.findPresence("This is Harry"));

        assertFalse(findPresence.findPresence("This is Henry"));

        assertTrue(findPresence.findPresence("Henry is Harry's brother"));

    }
}
