package codesignal;

import java.util.Arrays;
import java.util.Collections;

public class AlmostIncreasingSequence {
    public static void main(String[] args) {
        int[] sequence = {1, 3, 2, 1};
        int[] sequenceClone = sequence.clone();
        Arrays.sort(sequenceClone);
        int amountReverse = 0;
        int amountDuplicate = 0;
        for(int i = 1; i < sequence.length; i++){
            if(sequence[i] <= sequence[i-1]){
                amountReverse ++;
            }
            if(sequenceClone[i] == sequenceClone[i-1]){
                amountDuplicate ++;
            }
        }
        if(amountReverse >=2 || amountDuplicate >= 2){
        System.out.println("false");

        }
    }
}
