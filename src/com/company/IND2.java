package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String[] names = {"byte", "short", "int", "long", "float", "double", "int", "boolean", "long","String"};
        boolean isLetter;
        boolean isDigit;
        boolean check = false;
        System.out.println("Введите строку.");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String line2;
        line2 = line.replace("-", " ");
        line2 = line2.replace(":", " ");
        line2 = line2.replace(",", " ");
        String[] splitted = line2.split(" ");
        System.out.println("С помощью регулярных выражений:");
        Pattern pattern = Pattern.compile("(\\b[A-Za-z]+)([A-Za-z0-9]*)");
        for (String str : splitted) {
            check = true;
            str = str.replace(" ","");
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                for (String element: names) {
                    if (element.equals(matcher.group())) {
                        check = false;
                    }
                }
                if (check) {
                    System.out.println(matcher.group());
                }
            }
        }
            System.out.println("С помощью массива символов:");
            for (String str : splitted) {
                check = false;
                for (String element: names){
                    if (str.equals(element)){
                        check = true;
                    }
                }
                str = str.replace(" ", "");
                char[] qwe = str.toCharArray();
                if (!Character.isLetter(qwe[0])) {
                    check = true;
                } else {
                    for (int i = 1; i < str.length(); i++) {
                        if (!Character.isLetter(qwe[i]) & !Character.isDigit(qwe[i]) & qwe[i] != '_') {
                            check = true;
                        }
                    }
                }
                if (check) {
                    line = line.replace(str, "");
                }
            }
            System.out.println(line);
        }
}
