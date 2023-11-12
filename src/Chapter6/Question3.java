package Chapter6;

/**
 * Class: Question3
 * @author sidibaba Simpara
 * @version 1.0
 * Course: November 1, 2023
 * Written: ITEC 2140 Section 9, Fall 2023
 * Description: Program will use an int value through using an arraylist
 * print out through using an enhanced loop
 */
import java.util.Random;
import java.util.ArrayList;
public class Question3 {
    public static void main(String[] args){
//        int[] dice3 = new int[10];
        ArrayList<Integer> dice3 = new ArrayList<>();
        Random obj = new Random();
        for(int i = 0; i < 10; i++){
            dice3.add(obj.nextInt(6) + 1);
        }
        for (int i:dice3) {
            System.out.print(i + " ");
        }
    }

}
