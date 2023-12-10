package com.techmeskills.homework_11.task_1;

import com.techmeskills.homework_11.task_1.methodoutput.MethodFabric;

/**
 * Написать программу со следующим функционалом:
 * На вход передать строку (будем считать, что это некий стандартный номер документа в заданном формате).
 * Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это любая цифра, а y — это буква латинского алфавита (могут быть большие и маленькие).
 * - Вывести на экран в одну строку два первых блока по 4 цифры.
 * - Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
 * - Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
 * - Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
 * - Проверить содержит ли номер документа последовательность "abc" и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
 * - Проверить начинается ли номер документа с последовательности 555.
 * - Проверить заканчивается ли номер документа на последовательность 1a2b.
 * Все эти методы реализовать в отдельном классе в статических методах, каждая задача - в отдельном методе.
 * Методы на вход (входным параметром) будут принимать вводимую на вход программы строку.
 */
public class Runner {
    public static void main(String[] args) {

        String currentInfoDoc = "1234-hjku-4567-HGT-4y8i";
        System.out.println("Ours row: " + currentInfoDoc);

        MethodFabric.doBlockDigits(currentInfoDoc);
        MethodFabric.doChangeBlockLetter(currentInfoDoc);
        MethodFabric.doOutputLetter(currentInfoDoc);
        MethodFabric.doOutputLetterNewWay(currentInfoDoc);
        MethodFabric.checkContainDocument(currentInfoDoc);
        MethodFabric.checkStartDocument(currentInfoDoc);
        MethodFabric.checkEndDocument(currentInfoDoc);
    }
}
