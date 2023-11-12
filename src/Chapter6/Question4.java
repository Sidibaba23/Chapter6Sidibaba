package Chapter6;

/**
 * Class: Question4
 * @author Sidibaba Simpara
 * @version 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: November 4, 2023
 * Description: Program will use an int value through using an arraylist
 * print out through using an enhanced loop
 */
import java.util.ArrayList;
import java.util.Random;
public class Question4 {
    public static void main(String[] args) {
        ArrayList<Integer> dice4 = new ArrayList<>();
        Random ran = new Random();
        for(int i = 0; i < 5; i++){
            dice4.add(ran.nextInt(6) + 1);
        }
        for (int i:dice4) {
            System.out.print(i + " ");
        }

    }








}
