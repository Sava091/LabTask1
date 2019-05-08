package com.vitaliy.training.labtask2;

import java.util.Objects;

public class Word {
    private String value;

    public Word(String value) {
        this.value = value.toLowerCase();
    }

    public Symbol getFirstSymbol() {
        return new Symbol(value.charAt(0));
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Objects.equals(value, word.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}