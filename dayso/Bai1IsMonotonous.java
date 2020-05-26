package dayso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Bai1IsMonotonous {
    static boolean isMonotonous(int[] sequence) {
        if(sequence.length == 1){
            return true;
        }
        if(sequence.length == 2){
            if(sequence[0] == sequence[1]){
                return false;
            }
        }

        for(int i = 2; i<sequence.length; i++){
            if((sequence[i - 1] - sequence[i - 2]) * (sequence[i] - sequence[i - 1]) <= 0){
                return false;
            }
        }
        return true;

//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i : sequence) {
//            list.add(i);
//        }
//        Collections.sort(list);
//        for (int i = 0; i < list.size() - 1; i++) {
//            System.out.println(list.get(i) + " " + list.get(i + 1));
//            if (list.get(i).equals(list.get(i + 1)) && list.get(i)!=0 && list.get(i + 1)!=0) {
//                return false;
//            }
//
//        }
//        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, -1, -9, 0, 0, 5, 7, 7, 9};
        int[] b = {0};
        int[] c = {3,3};
        System.out.println(isMonotonous(a) + " " + isMonotonous(b) + " " + isMonotonous(c));
    }
}
