package com.company;

import java.io.*;

public class Main extends MyFunction {

    public static void main(String[] args) throws IOException {
        File text = new File("data/input_task47.txt");
        System.out.println(text.getAbsolutePath());
        BufferedWriter writeText;
        try {
            writeText = new BufferedWriter(new FileWriter("input_task47.txt"));
        } catch (IOException e) {
            System.out.println("Фаил не найден!");
            return;
        }
        writeText.write("Текст для записи в фаил. Просто   текст");
        writeText.close();

        BufferedReader readFile;
        try {
            readFile = new BufferedReader(new FileReader("input_task47.txt"));
        } catch (IOException e) {
            System.out.println("Фаил не найден!!");
            return;
        }
        String str = readFile.readLine();
        System.out.println(str);

        counerWord(str);
        counterPunctuation(str);
    }

}
