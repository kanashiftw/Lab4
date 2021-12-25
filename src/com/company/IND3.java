package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите строку, содержащую подстроку вида - 23:59:59.");
        Scanner in = new Scanner(System.in);
        String line = in.next();
	    Pattern pattern = Pattern.compile("([0-2]{1}[0-9]{1})(:)([0-5]{1}[0-9]{1})(:)([0-5]{1}[0-9]{1})");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()){
            System.out.println("Все строки формата - 23:59:59:");
        }
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
