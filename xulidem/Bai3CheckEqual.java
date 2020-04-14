package xulidem;

import java.util.HashSet;
import java.util.Set;

public class Bai3CheckEqual {
    static boolean checkEqualFrequency(int[] inputArray) {
        Set<Integer> hashSet = new HashSet<Integer>();

        for(int i = 0; i<inputArray.length; i++){
            hashSet.add(inputArray[i]);
        }
        int[] loopInput = new int[hashSet.size()];
        int i = 0;
        for(Integer soN:hashSet){
            loopInput[i] = 1;
            for(int number:inputArray){
                if(number == soN){
                    loopInput[i] ++;
                }
            }
            i++;
        }
        for(int number:loopInput){
            if(number != loopInput[0]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 1, 3, 1, 3};
        System.out.printf("aa" + checkEqualFrequency(a));
    }
}
