package com.techmeskills.homework_11.task_2;

import com.techmeskills.homework_11.task_2.service.choose.word.Utils;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input some words: ");
        String nameCurrent = sc.nextLine();

        Utils.findWords(nameCurrent);
    }
}
