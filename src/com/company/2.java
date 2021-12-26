package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isLetter;
        int i;
        int num = 1;
        String line;
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
        //С помощью массива символов
        char array[] = line.toCharArray();
        for (i = 0; i < array.length; i++) {
            if (Character.isLetter(array[i])) {
                System.out.print(array[i]);
            } else {
                System.out.printf("(%d)", num);
                System.out.print(array[i]);
                num++;
            }
        }
        System.out.println("");
        //С помощью методов String
        int q = 1;
        String linezxc = line.replace(",","(),");
        linezxc = linezxc.replace("-","()-");
        linezxc = linezxc.replace(":","():");
        linezxc = linezxc.replace(".","().");
        linezxc = linezxc.replace(" ","() ");
        for (i = 0; i < linezxc.length();i++){
            if (linezxc.charAt(i) == '(') {
                linezxc = linezxc.substring(0, i+1) + (q) + linezxc.substring(i+1,linezxc.length());
                q++;
            }
        }
        System.out.println(linezxc);
    }
}
