package com.techmeskills.homework_11.task_1.methodoutput;

import java.util.Arrays;

public class MethodFabric {

    public static void doBlockDigits(String currentInfoDoc) {

        String[] str = currentInfoDoc.split("-");
        for (int i = 0; i < str.length - 1; i = i + 2) {
            System.out.print(str[i] + " ");
        }
    }

    public static void doChangeBlockLetter(String currentInfoDoc) {

        String str = currentInfoDoc.replace("hjku", "****");
        String str1 = str.replace("HGT", "***");
        System.out.println(str1);
    }

    public static void doOutputLetter(String currentInfoDoc) {

        String[] str1 = currentInfoDoc.toLowerCase().split("-");
        for (int i = 1; i < str1.length - 1; i = i + 2) {
            System.out.print(str1[i] + " ");
        }
        System.out.println(currentInfoDoc.charAt(20) + "" + currentInfoDoc.charAt(22));
    }

    public static void doOutputLetterNewWay(String currentInfoDoc) {

        StringBuilder builder = new StringBuilder(currentInfoDoc);
        String[] res1 = currentInfoDoc.toUpperCase().split("-");

        for (int i = 1; i < res1.length - 1; i = i + 2) {
            builder.append(res1[i] + "");
            builder.append(" ");
        }

        builder.delete(0, 23);
        builder.append(currentInfoDoc.toUpperCase().charAt(20));
        builder.append(currentInfoDoc.toUpperCase().charAt(22));
        System.out.println(builder);
    }

    public static void checkContainDocument(String currentInfoDoc) {

        if (currentInfoDoc.toLowerCase().contains("abс")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static void checkStartDocument(String currentInfoDoc) {

        if (currentInfoDoc.startsWith("555")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void checkEndDocument(String currentInfoDoc) {

        if (currentInfoDoc.endsWith("1a2b")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
