package com.vitaliy.training.labtask2;

import org.junit.Test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

public class TextTest {
    @Test
    public void testParseStringDifferentWords() {
        TextService sentence = new TextService();
        Map<Symbol, Set<Word>> wordSet = new TreeMap<>();
        sentence.parseString(wordSet, "Asd Fgh sd'a fgtr");
        assertEquals(3, wordSet.size());
    }

    @Test
    public void testParseStringSameWords() {
        TextService sentence = new TextService();
        Map<Symbol, Set<Word>> wordSet = new TreeMap<>();
        sentence.parseString(wordSet,"Asd asd aSd asD");
        assertEquals(1, wordSet.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseStringNull() {
        TextService sentence = new TextService();
        Map<Symbol, Set<Word>> wordSet = new TreeMap<>();
        sentence.parseString(wordSet, null);
    }
}