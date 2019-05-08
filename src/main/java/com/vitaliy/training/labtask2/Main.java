package com.vitaliy.training.labtask2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Text sentence = new Text();
        TextService textService = new TextService();
        try {
            String text = new String(Files.readAllBytes(Paths.get("src/main/resources/text.txt")));
            textService.parseString(sentence.getWordSet(), text);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(textService.formatWords(sentence.getWordSet()));
    }
}