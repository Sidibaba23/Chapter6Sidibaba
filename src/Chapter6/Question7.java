package Chapter6;

/**
 * Class: Question7
 * @author Sidibaba Simpara
 * @version 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: November 4, 2023
 * Description: Program will print out the size
 * of the ArrayList
 *
 * Sample output:  size = 4
 */

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
public class Question7 {

    public static void main(String[] args) {
        ArrayList<LocalDate> centennials = new ArrayList<>();

        centennials.add(LocalDate.of(1776, Month.JULY, 4));

        centennials.add(LocalDate.of(1876, Month.JULY, 4));

        centennials.add(LocalDate.of(1900, Month.JULY, 4));

        centennials.add(LocalDate.of(1976, Month.JULY, 4));

        centennials.add(LocalDate.of(2076, Month.JULY, 4));

        int size = centennials.size();

        System.out.println("The size is " + size);
    }
}
