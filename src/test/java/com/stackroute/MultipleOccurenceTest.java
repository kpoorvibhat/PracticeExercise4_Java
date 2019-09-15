package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class MultipleOccurenceTest {
    private static MultipleOccurence multipleOccurence;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        multipleOccurence = new MultipleOccurence();
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        multipleOccurence = null;
    }
    @Test
    public void testMultipleOccurence_FromGivenString_ShouldReturnStartAndEndIndex() {
        ArrayList<int[]> index = new ArrayList<>();
        ArrayList<int[]> index2 = new ArrayList<>();
        index.add(new int[]{4, 6});
        index.add(new int[]{10, 12});
        index.add(new int[]{27, 29});
        index2 = multipleOccurence.findMultipleOccurences(
                "She sells seashells by the seashore", "se");
        assertArrayEquals(index.get(0), index2.get(0));
        assertArrayEquals(index.get(1), index2.get(1));
        assertArrayEquals(index.get(2), index2.get(2));
    }
}

