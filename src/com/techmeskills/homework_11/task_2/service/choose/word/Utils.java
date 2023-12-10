package com.techmeskills.homework_11.task_2.service.choose.word;

import java.util.Arrays;

public class Utils {

    public static void findWords(String nameCurrent) {
        System.out.println("Ours row is : " + nameCurrent);

        String[] words = nameCurrent.split(" ");

        String shortestWord = words[0];
        String largestWord = words[0];

        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
            else if ((word.length() > largestWord.length())) {
                largestWord = word;
            }
        }
        System.out.println("The biggest word is: " + largestWord);
        System.out.println("The laggest word is: " + shortestWord);
    }
}

