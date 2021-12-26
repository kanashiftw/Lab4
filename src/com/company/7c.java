package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static int  FindLongest(String[] tracklist){
        int Longest = FindTime(tracklist)[0];
        int lngst = 0;
        for (int i = 0; i < tracklist.length; i++){
            if (Longest < FindTime(tracklist)[i]){
                Longest = FindTime(tracklist)[i];
                lngst = i;
            }
        }
        return lngst;
    }
    static int FindShortest(String[] tracklist){
        int Shortest = FindTime(tracklist)[0];
        int shrt = 0;
        for (int i = 0; i < tracklist.length; i++){
            if (Shortest > FindTime(tracklist)[i]){
                Shortest = FindTime(tracklist)[i];
                shrt = i;
            }
        }
        return shrt;
    }
    static int [] FindTime(String[] tracklist) {
        Pattern pattern = Pattern.compile("([0-5]{0,1}[0-9]{1})(:)([0-5]{1}[0-9]{1})");
        int [] time = new int[tracklist.length];
        for (int i = 0; i < tracklist.length; i++) {
            Matcher matcher = pattern.matcher(tracklist[i]);
            matcher.find();
            String x = matcher.group();
            x = x.replace("[", "");
            x = x.replace("]", "");
            x = x.replace("(", "");
            x = x.replace(")", "");
            x = x.replace(":", " ");
            String[] str = x.split(" ");
            time[i] = Integer.parseInt(str[0]) * 60 + Integer.parseInt(str[1]);
        }
        return time;
    }
    static int [] MinDifference(String[] tracklist){
        int i,j;
        int [] Nums = new int [2];
        int MinDiff = Math.abs(FindTime(tracklist)[0] - FindTime(tracklist)[1]);
        for (i = 0; i < tracklist.length; i++){
            for (j = i+1; j < tracklist.length; j++){
                if ((Math.abs(FindTime(tracklist)[i] - FindTime(tracklist)[j])) < MinDiff){
                    MinDiff = Math.abs(FindTime(tracklist)[i]- FindTime(tracklist)[j]);
                    Nums[0] = i+1;
                    Nums[1] = j+1;
                }
            }
        }
        return Nums;
    }
    static int SumTime(String[] tracklist) {
        int SumTime = 0;
        for (int i = 0; i < tracklist.length; i++) {
            SumTime += FindTime(tracklist)[i];
        }
        return SumTime;
    }

    public static void main(String[] args) {
        System.out.println("Треклист:");
        String[] tracklist = {"Gentle Giant – Free Hand [6:15]",
                "Supertramp – Child Of Vision [07:27]",
                "Camel – Lawrence [10:46]",
                "Yes – Don’t Kill The Whale [3:55]",
                "10CC – Notell Hotel [04:58]",
                "Nektar – King Of Twilight [4:16]",
                "The Flower Kings – Monsters & Men [21:19]",
                "Focus – Le Clochard [1:59]",
                "Pendragon – Fallen Dream And Angel [5:23]",
                "Kaipa – Remains Of The Day (08:02)"};
        for (int i = 0; i < tracklist.length; i++) {
            System.out.println(i + 1 + ". " + tracklist[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Общее время звучания песен: " + SumTime(tracklist) + " секунд.");
        System.out.println("Минимальная разница между продолжительностью песен между " + MinDifference(tracklist)[0] + " и "  + MinDifference(tracklist)[1]);
        System.out.println("Самый длительный трек: " + (FindLongest(tracklist)+1));
        System.out.println("Самый короткий трек: " + (FindShortest(tracklist)+1));
    }
}
