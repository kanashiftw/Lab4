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
        //С помощью методов String
        for (i = 0; i < line.lastIndexOf(".")+1;i++){
        }
            //С помощью массива символов
           char array[] = line.toCharArray();
           for (char element:array){
               if (Character.isLetter(element)){
               System.out.print(element);
               }else{
                   System.out.printf("(%d)",num);
                   System.out.print(element);
                   num++;
               }
           }
        }
    }

