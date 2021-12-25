package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isLetter;
        boolean isDigit;
        boolean check = false;
        System.out.println("Введите строку.");
        Scanner in = new Scanner(System.in);
        String line = in.next();
        String line2;
        line2 = line.replace("-", " ");
        line2 = line2.replace(":", " ");
        line2 = line2.replace(",", " ");
        String[] splitted = line2.split(" ");
        for (String str : splitted) {
            check = false;
            str = str.replace(" ","");
            char[] qwe = str.toCharArray();
            if (!Character.isLetter(qwe[1])) {
                check = true;
            } else {
                for (int i = 0; i < str.length(); i++) {
                    if (!Character.isLetter(qwe[i]) && !Character.isDigit(qwe[i])) {
                        check = true;
                    }
                }
            }
            if (check){
                line = line.replace(str,"");
            }
        }
        System.out.println(line);
    }
}
