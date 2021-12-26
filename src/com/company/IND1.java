package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key;
        System.out.println("Введите размер массива(четное число).");
        while(!in.hasNextInt()) {
            System.out.println("Вводятся только числа.");
            in.next();
        }
        key = in.nextInt();
        String str = in.nextLine();
        System.out.println(str);
        System.out.println(Vernam(str, key));
    }
    private static String Vernam(String s, int key) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            res.append((char) (c ^ key));
        }
        return res.toString();
    }
}
