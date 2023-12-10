package com.techmeskills.homework_11.task_3.util;

public class DoubleLetterWord {
    public static void doDoubleEveryLetterWord(String currentWord) {

        String[] words = currentWord.split(" ");

//        to create new empty row for outputting result
        String result = "";

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                result += word.charAt(i);
                result += word.charAt(i);
            }
        }
        System.out.println(result);
    }
}
