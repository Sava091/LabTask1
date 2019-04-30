package com.vitaliy.training.labtask2;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordTest {
    @Test
    public void testGetFirstSymbol() {
        assertEquals(0, new Word("telegram").getFirstSymbol().compareTo(new Symbol('t')));
        assertEquals(0, new Word("Telegram").getFirstSymbol().compareTo(new Symbol('t')));
    }
}
