package Chapter6;
/**
 * Class: Question8
 * @author Sidibaba Simpara
 * @version 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: November 4, 2023
 * Description: Program will check if there's
 * the centennial (1876, at 100 years) is present
 */
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Month;
public class Question8 {

    public static void main(String[] args) {

        ArrayList<LocalDate> centennials = new ArrayList<>();
        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));

        boolean present = false;
        for (LocalDate date: centennials) {
            if(date.equals(LocalDate.of(1876, Month.JULY, 4))){
                present = true;
            }

        }
        System.out.println("Centennials present is " + present);

    }

}
