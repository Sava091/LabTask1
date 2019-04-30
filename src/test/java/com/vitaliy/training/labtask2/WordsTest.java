package com.vitaliy.training.labtask2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordsTest {
    @Test
    public void testParseStringDifferentWords() {
        Words words = new Words();
        words.parseString("Asd Fgh sd'a fgtr");
        assertEquals(4, words.getWordSet().size());
    }

    @Test
    public void testParseStringSameWords() {
        Words words = new Words();
        words.parseString("Asd asd aSd asD");
        assertEquals(1, words.getWordSet().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseStringNull() {
        Words words = new Words();
        words.parseString(null);
    }
}