package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class StringTransposeTest {
    private static StringTranspose stringTranspose;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        stringTranspose = new StringTranspose();
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        stringTranspose = null;
    }
    @Test
    public void testStringTranspose_GivenString_ShouldReturnTransposedString() {

        assertEquals("yliad 4rd", stringTranspose.transpose("daily dr4"));

        assertEquals("a kciuq nworb xof spmuj revo eht yzal god", stringTranspose.transpose("a quick brown fox jumps over the lazy dog"));

        assertNotEquals("yrd yliad", stringTranspose.transpose("Daily Dry"));

        assertNotNull(stringTranspose.transpose(""));

    }
}
