package com.vitaliy.training.labtask2;

import org.junit.Test;

import static org.junit.Assert.*;

public class SymbolTest {
    @Test
    public void testCompareToNull() {
        assertEquals(-1, new Symbol('t').compareTo(null));
    }

    @Test
    public void testCompareToLower() {
        assertTrue(new Symbol('b').compareTo(new Symbol('a')) > 0);
    }

    @Test
    public void testCompareToHigher() {
        assertTrue(new Symbol('a').compareTo(new Symbol('b')) < 0);
    }

    @Test
    public void testCompareToEqual() {
        assertEquals(0, new Symbol('b').compareTo(new Symbol('b')));
    }
}