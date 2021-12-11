package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String line;
        int i = 0;
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите строку, завершите точкой.");
                line = in.nextLine();
                boolean check = line.endsWith(".");
                if (!check) throw new Exception("Ввод необходимо завершить точкой");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                continue;
            }
            break;
        }
        String [] splitted = line.split(" ");
        for (i = splitted.length-1; i >= 0;i--){
            if (i == splitted.length -1){
                System.out.print(removeCharAt(splitted[i],splitted[i].indexOf('.')) + " ");
            }else if (i == 0){
                System.out.print(splitted[i]);
            }else {
                System.out.print(splitted[i] + " ");
            }
        }
        System.out.print(".");
    }
    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}

