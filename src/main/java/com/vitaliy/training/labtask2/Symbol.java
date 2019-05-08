package com.vitaliy.training.labtask2;

public class Symbol implements Comparable<Symbol> {
    private char value;

    public Symbol(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    @Override
    public int compareTo(Symbol symbol) {
        if (symbol == null) {
            return -1;
        }
        return value - symbol.getValue();
    }
}