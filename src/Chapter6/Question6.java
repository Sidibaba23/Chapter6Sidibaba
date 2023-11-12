package Chapter6;
/**
 * Class: Question6
 * @author Sidibaba Simpara
 * @version 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: November 4, 2023
 * Description: Program would remove ArrayList mistake
 * from the programmer
 */
import java.time.Month;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//Found this from the java API
import java.util.ArrayList;

public class Question6 {

    public static void main(String[] args) {

        ArrayList<LocalDate> centennials = new ArrayList<>();
        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1900, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm/dd/yyyy");
        for (LocalDate date: centennials) {
            System.out.println(DateTimeFormatter.ofPattern("MM/dd/yyyy").format(date));
        }
        int size = centennials.size();
        System.out.println("The size is " + size);

        centennials.remove(LocalDate.of(1900, Month.JULY, 4));
        for (LocalDate date: centennials) {
            System.out.println(DateTimeFormatter.ofPattern("MM/dd/yyyy").format(date));
        }
        size = centennials.size();
        System.out.println("The size is " + size);



    }
}
