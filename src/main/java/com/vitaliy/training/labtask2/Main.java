package com.vitaliy.training.labtask2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Words words = new Words();
        try {
            List<String> strings = Files.readAllLines(Paths.get("src/main/resources/text.txt"));
            for (String string : strings) {
                words.parseString(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        words.printWords();
    }
}