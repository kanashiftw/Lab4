package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        String line;
        int i, j;
        int k = 0;
        boolean find = false;
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
        System.out.println("Ваша строка: " + line);
        //С помощью методов String
        for (i = 0; i < line.lastIndexOf(".")+1;i++){
            if (line.indexOf(line.charAt(i)) == line.lastIndexOf(line.charAt(i))){
                System.out.print(line.charAt(i) + " ");
            }
        }
        System.out.println(" ");
        //С помощью массива символов
        char[] mas = line.toCharArray();
        for (i = 0; i < mas.length; i++) {
            k = 0;
          for (j = 0; j < mas.length;j++){
              if (mas[i] == mas[j]){
                  k++;
              }
          }
          if (k==1){
              System.out.print(mas[i] + " ");
              find = true;
          }
        }
        if (find) {
            System.out.print(" - Все символы, встречающиеся ровно по одному разу.");
        }else{
            System.out.println("Не найдено символов, встречающихся в строке единожды.");
        }
    }
}