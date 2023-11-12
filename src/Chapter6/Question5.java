package Chapter6;

/**
 * Class: Question5
 * @author Sidibaba Simpara
 * @version 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: November 4, 2023
 * Description: Program will check for any similarities
 * and differences within the two ArrayLists
 * and print out the similar numbers within the lists
 */
import java.util.ArrayList;

public class Question5 {
    public static boolean helper(int[] l1, int l2){
        for(int i = 0; i < l1.length; i++){
            if(l1[i] == l2){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        ArrayList<Integer> intersection = new ArrayList<>();
        int[] list1 = {1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 8, 8, 9, 10};
        int[] list2 = {2, 4, 8, 10, 12, 14, 16, 18, 20};

        for (int i: list1) {
            if(helper(list2,i) && !intersection.contains(i)){
                intersection.add(i);
            }
        }

        System.out.println(intersection);
    }
}
