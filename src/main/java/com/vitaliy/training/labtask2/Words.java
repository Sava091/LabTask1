package com.vitaliy.training.labtask2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Words {
    private Set<Word> wordSet = new HashSet<>();

    public Set<Word> getWordSet() {
        return wordSet;
    }

    public void parseString(String string) {
        if (string != null) {
            Pattern pattern = Pattern.compile("[A-z]+'?[A-z]+");
            Matcher matcher = pattern.matcher(string);
            while (matcher.find()) {
                wordSet.add(new Word(matcher.group()));
            }
        } else {
            throw new IllegalArgumentException("Null String input");
        }
    }

    public void printWords() {
        Word[] array = new Word[wordSet.size()];
        wordSet.toArray(array);
        Arrays.sort(array, (o1, o2) -> o1.getFirstSymbol().compareTo(o2.getFirstSymbol()));

        Symbol firstChar = new Symbol('1');
        for (Word word : array) {
            if (firstChar.compareTo(word.getFirstSymbol()) != 0) {
                System.out.print("\t");
            }
            System.out.println(word);
            firstChar = word.getFirstSymbol();
        }
    }
}
