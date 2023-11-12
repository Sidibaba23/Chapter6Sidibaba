package Chapter6;


/**
 * Class: Question2
 * @author Sidibaba Simpara
 * @version 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: November 4, 2023
 * Description: Program will use an int value array and
 * print out through using an indexed for loop
 */
import java.util.Random;

public class Question2 {
    public static void main(String[] args){
        int[] dice2 = new int[6];
        Random object = new Random();
        for(int i = 0; i < dice2.length; i++) {
            int[] diceValue = new int[]{(int) (Math.random() * (6) + 1)};

            System.out.println(diceValue[dice2[i]]);
        }
    }
}
