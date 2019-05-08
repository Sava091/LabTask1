package com.vitaliy.training.labtask2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextService {
    public void parseString(Map<Symbol, Set<Word>> wordSet, String string) {
        if (string != null) {
            Pattern pattern = Pattern.compile("[A-z]+'?[A-z]+");
            Matcher matcher = pattern.matcher(string);
            while (matcher.find()) {
                Word word = new Word(matcher.group());
                wordSet.computeIfAbsent(word.getFirstSymbol(), words -> {
                    Set<Word> hashSet = new HashSet<>();
                    hashSet.add(word);
                    return hashSet;
                });
                wordSet.computeIfPresent(word.getFirstSymbol(), (s, words) -> {
                    words.add(word);
                    return words;
                });
            }
        } else {
            throw new IllegalArgumentException("Null String input");
        }
    }

    public StringBuilder formatWords(Map<Symbol, Set<Word>> wordSet) {
        StringBuilder sb = new StringBuilder();
        //Word[] array = new Word[wordSet.size()];
        for (Map.Entry<Symbol, Set<Word>> entry : wordSet.entrySet()) {
            Iterator<Word> itr = entry.getValue().iterator();
            for (int i = 0; itr.hasNext(); i++) {
                Word word = itr.next();
                if (i == 0) {
                    sb.append("\t")
                        .append(word)
                    .append("\n");
                } else {
                    sb.append(word)
                            .append("\n");
                }
            }
        }
        return sb;
    }
}
