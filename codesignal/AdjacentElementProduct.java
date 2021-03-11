package codesignal;

import java.util.ArrayList;
import java.util.Collections;

public class AdjacentElementProduct {
    public static void main(String[] args) {
        int[] inputArray = {9, 5, 10, 2, 24, -1, -48};
        ArrayList resuilt = new ArrayList<Integer>();

        for(int i = 0; i < inputArray.length; i +=2){
            int number1 = inputArray[i];
            int number2 = 1;
            try {
                 number2 = inputArray[i+1];
            }catch (Exception e){
            }
            resuilt.add(number1 * number2);
        }

        System.out.println(Collections.max(resuilt));
    }
}
