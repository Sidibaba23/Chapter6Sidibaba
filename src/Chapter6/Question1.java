package Chapter6;

/**
 * Class: Question1
 * @author sidibaba Simpara
 * @version 1.0
 * Course: ITEC 2140 Section 9, Fall 2023
 * Written: November 1, 2023
 * Description: Program will use an int value array and
 * print out through using an enhanced loop
 */
import java.util.Random;
public class Question1 {
    public static void main(String[] args){
           int[] dice1 = new int[10];
           Random obj = new Random();
           for(int i = 0; i < dice1.length; i++){
               dice1[i] = obj.nextInt(6) + 1;
           }
        for (int i:dice1) {
            System.out.print(i + " ");
        }
    }

}
