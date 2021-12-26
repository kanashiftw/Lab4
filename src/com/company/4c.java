package com.company;

import java.util.Scanner;

public class Main {
    static int minIterative(int[] myArray) {
        int min = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = i+1;
            }
        }
        return min;
    }
    static int FindSpaceStr(String[] Array){
        int [] count = new int[Array.length];
        for (int i = 0; i < Array.length; i++){
            while (Array[i].lastIndexOf(' ') != -1){
                count[i]++;
                Array[i] = Array[i].substring(Array[i].indexOf(' ')+1,Array[i].length());
            }
        }
        return minIterative(count);
    }
    static int FindSpaceArr(String[] Array) {
        int[] count = new int[Array.length];
        for (int i = 0; i < Array.length; i++) {
            char[] mas = Array[i].toCharArray();
            for (char element : mas) {
                if (element == ' ') {
                    count[i]++;
                }
            }
        }
        return minIterative(count);
    }

    public static void main(String[] args) {
        String[] array = new String[7];
        boolean isLetter;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите строку.");
            array[i] = in.nextLine();
        }
        System.out.println("Вы ввели:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + 1 + ". " + array[i]);
        }
        System.out.println("Строки в которых есть слова оканчивающееся на '.com': ");
        for (String element : array) {
            int j = 1;
            if (element.indexOf(".com") != -1) {
                if (element.length() == element.indexOf(".com")+4) {
                    System.out.println((j)+ ". " + element);
                    j++;
                } else {
                    if (!Character.isLetter(element.charAt(element.indexOf(".com") + 4))) {
                        System.out.println((j)+ ". " + element);
                        j++;
                    }
                }
            }
        }
        System.out.println("Строка, содержащая наименьшее количество пробелов (с помощью массива символов): " + FindSpaceArr(array));
        System.out.println("Строка, содержащая наименьшее количество пробелов (с помощью методов String): " + FindSpaceStr(array));
    }
}
