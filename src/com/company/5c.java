package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку.");
        String line = in.nextLine();
        //С помощью регулярных выражений
        System.out.println("С помощью регулярных выражений:");
        Pattern pattern = Pattern.compile("([A-Z]{1})([a-z]*)([0-9]{2})");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            System.out.println(line.substring(matcher.start(), matcher.end()));
        }
        //С помощью массива символов
        String line2 = line.replace("-", " ");
        line2 = line2.replace(":", " ");
        line2 = line2.replace(",", " ");
        String[] splitted = line2.split(" ");
        System.out.println("С помощью массива:");
        for(String element :splitted){
            element = element.trim();
            char [] mas = element.toCharArray();
            if ((mas[0]>='A') && (mas[0]<= 'Z') && (mas[mas.length-1]>= '0') && (mas[mas.length-1]<='9') && (mas[mas.length-2]>= '0') && (mas[mas.length-2]<='9')){
            System.out.println(mas);
            }

        }
    }
}


