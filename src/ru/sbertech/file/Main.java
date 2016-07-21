package ru.sbertech.file;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите путь к считываемому файлу:");
        String filepath = sc.nextLine();
        //String filepath = "N://Java//lessons//text.txt";
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get(filepath), StandardCharsets.UTF_8);
            for (String line : lines) System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<String> ColString = new ArrayList<>();
        for (String line : lines) {
            String[] str = (line.split(" "));
            for (int i = 0; i < str.length; i++){
                ColString.add(str[i]);
            }
        }
        /*for(String word : ColString){
            if (word.contains(".")){
                String[] s1 = word.split(".");
                ColString.remove(word);
                for (int i = 0; i < s1.length; i++){
                    ColString.add(s1[i]);
                }
            }
        }*/
        for (String word : ColString)
            System.out.println(word);

    }
}
