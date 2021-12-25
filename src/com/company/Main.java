package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        int [] array = new int [3];
        System.out.println("Введите выражение типа a+b=c:");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        line = line.trim();
        line = line.replace(" ","");
        Pattern pattern = Pattern.compile("(-*)(\s*)([0-9]+)");
        Matcher matcher = pattern.matcher(line);
        int j = 0;
        while (matcher.find()) {
            array[j] = Integer.parseInt(matcher.group());
            j++;
        }
        System.out.println("Первый операнд: " + array[0]);
        System.out.println("Второй операнд: " + array[1]);
        System.out.println("Сумма: " + (array[0]+array[1]));
    }
}

