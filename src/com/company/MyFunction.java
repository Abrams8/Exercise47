package com.company;

public class MyFunction {

    public static void counerWord(String str) {
        System.out.println("Количество слов в тексте: " + str.split("[^A-Za-zА-Яа-я0-9]+").length);
    }

    public static void counterPunctuation(String str) {
        int charBefore = str.length();
        int charAfter = str.replaceAll("[.,!?:\\s]", "").length();
        int result = charBefore - charAfter;
        System.out.println("В тексте " + result + " знаков препинания.");
    }
}
