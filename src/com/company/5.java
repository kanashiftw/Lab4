package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        char[] separators = {' ', '.',',','-',':'};
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку.");
        String line = in.nextLine();
        Pattern pattern = Pattern.compile("([A-Z]{1})([a-z]*)([0-9]{2})");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            System.out.println(line.substring(matcher.start(), matcher.end()));
        }
    }
}


