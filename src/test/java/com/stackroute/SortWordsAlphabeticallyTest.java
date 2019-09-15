package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class SortWordsAlphabeticallyTest {
    private static SortWordsAlphabetically sortWordsAlphabetically;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        sortWordsAlphabetically = new SortWordsAlphabetically();
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        sortWordsAlphabetically = null;
    }
    @Test
    public void testSortWordsAlphabetically_FromGivenString_ShouldReturnSortedString() {

        assertArrayEquals(new String[]{"A", "a", "a", "called", "central", "developing", "idea,", "is", "of", "paragraph", "related", "sentences", "series", "the", "topic"},
                sortWordsAlphabetically.sortWordsAlphabetically("A paragraph is a series of related sentences developing a central idea, called the topic"));

        assertNotNull(sortWordsAlphabetically.sortWordsAlphabetically(("")));

        assertNotEquals("abc def ghi", sortWordsAlphabetically.sortWordsAlphabetically(("ghi def abc")));

    }
}
