package com.company;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static char[] alph = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public static char[][] alphsq = {{'A', 'B', 'C', 'D', 'E'}, {'F', 'G', 'H', 'I', 'K'}, {'L', 'M', 'N', 'O', 'P'}, {'Q', 'R', 'S', 'T', 'U'}, {'V', 'W', 'X', 'Y', 'Z'}};

    public static void main(String[] args) {
        //Щифр Гронсфельда
        String line = "HELLO";
        line = line.toUpperCase(Locale.ROOT);
        System.out.println(line);
        int [] key = {3,1,3,4,5};
        char[] xr = line.toCharArray();
        char[] yabezdar = line.toCharArray();
        System.out.println("Шифр Гронсфельда:");
        System.out.println("Расшифровка:");
        for (int j = 0; j < line.length(); j++) {
            for (int i = 0; i < 25; i++) {
                if (yabezdar[j] == (alph[i])) {
                    if (i + key[j] > 25) {
                        xr[j] = alph[(i + key[j]) - 25];
                    }else {
                        xr[j] = alph[i + (key[j])];
                    }
                }
            }
        }
        System.out.println(xr);
        System.out.println("Расшифровка:");
        for (int j = 0; j < line.length(); j++) {
            for (int i = 0; i < 25; i++) {
                if (xr[j] == (alph[i])) {
                    if (i + key[j] > 25) {
                        xr[j] = alph[(i - key[j]) + 25];
                    }else {
                        xr[j] = alph[i - (key[j])];
                    }
                }
            }
        }
        System.out.println(xr);
        System.out.println("");
        //Шифр Полибия
        char[] xe = line.toCharArray();
        System.out.println("Шифр Полибия:");
        System.out.println("Зашифровка:");
        for (int k = 0; k < line.length(); k++) {
            for (int j = 0; j < 5; j++) {
                for (int i = 0; i < 5; i++) {
                    if (yabezdar[k] == (alphsq[i][j])) {
                        if(i == 4){
                            xe[k] = alphsq[0][j];
                        }
                        xe[k] = alphsq[i+1][j];
                    }
                }
            }
        }
        System.out.println(xe);
        System.out.println("Расшифровка:");
        for (int k = 0; k < line.length(); k++) {
            for (int j = 0; j < 5; j++) {
                for (int i = 0; i < 5; i++) {
                    if (xe[k] == (alphsq[i][j])) {
                        if (i == 0) {
                            xe[k] = alphsq[4][j];
                        } else {
                            xe[k] = alphsq[i - 1][j];
                        }
                    }
                }
            }
        }
        System.out.println(xe);
        System.out.println("");
        //Книжный Шифр
        System.out.println("Книжный Шифр:");
        System.out.println("Зашифровка:");
        int [] xd = new int [line.length()];
        char [] marla = new char [line.length()];
        String example = ("The quick brown fox jumps over the lazy dog");
        example = example.toUpperCase(Locale.ROOT);
        for (int j = 0; j < line.length(); j++){
         xd[j] = example.indexOf(line.charAt(j));
        }
        for (int element: xd){
            System.out.print(element + " ");
        }
        System.out.println("");
        System.out.println("Расшифровка:");
        for (int j = 0; j < line.length(); j++){
            marla[j] = example.charAt(xd[j]);
        }
        for (char element: marla){
            System.out.print(element);
        }
    }
}
