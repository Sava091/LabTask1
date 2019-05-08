package com.vitaliy.training.labtask2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Text {

    private Map<Symbol, Set<Word>> wordSet = new TreeMap<>();

    public Map<Symbol, Set<Word>> getWordSet() {
        return wordSet;
    }
}
