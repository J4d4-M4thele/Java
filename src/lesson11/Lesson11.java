/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson11;

import java.util.ArrayList;
import java.time.*;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.format.FormatStyle;

/**
 *
 * @author Jada
 */
public class Lesson11 {
    public static void main(String[] args) {

//        LocalDate myDate = LocalDate.now();
//        System.out.println("Today's date is " + myDate);
//        LocalDate newDate = myDate.minusMonths(10);
//        System.out.println("The new date is " + newDate);
//        JapaneseDate jDate = JapaneseDate.from(myDate);
//        System.out.println("Today's date in Japan is " + jDate);
        
        LocalDate today = LocalDate.now();
        System.out.println("Today's date (without formatting) is " + today);
        
        String sdate = today.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Today's date (in ISO_DATE_TIME format) is " + sdate);
        
        String fdate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("Today's date (in Medium Localized format) is " + fdate);

//        int sales[][] = new int[3][4];
//        int[][] salesArray = initArray(sales);
//        System.out.println("Yearly sales by quarter beginning 2010:");
//        for (int i = 0; i < sales.length; i++) {
//            for (int j = 0; j < sales[i].length; j++) {
//                System.out.println("\tQ" + (j + 1) + " " + sales[i][j]);
//            }
//            System.out.println();
//        }

//        ArrayList<String> names;
//        names = new ArrayList();
//        
//        names.add("Jamie");
//        names.add("Gustav");
//        names.add("Alisa");
//        names.add("Jose");
//        //replaces line 2
//        names.add(2, "Prashant");
//        System.out.println(names);
//        System.out.println();
//        //removes first element
//        names.remove(0);
//        //remove last element
//        names.remove(names.size() - 1);
//        names.remove("Gustav");
//        
//        System.out.println(names);
    }

    public static int[][] initArray(int[][] salesArray) {
        int salesAmt = 100;
        for (int outer = 0; outer < 3; outer++) {
            for (int inner = 0; inner < 4; inner++) {
                salesArray[outer][inner] = salesAmt++;
            }

        }
        return salesArray;
    }
}
