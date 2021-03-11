package codesignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MakeArrayConsecutive {
    public static void main(String[] args) {
        int[] statues = {6, 2, 3, 8};
        Arrays.sort(statues);
//        System.out.println(statues[0] + "" + statues[3]);
        int min = statues[0];
        int max = statues[statues.length - 1];
        boolean flag = false;
        int res = 0;
        for(int i = min; i <= max; i++){
            for(int j = 0; j < statues.length; j++){
                if(i == statues[j]){
                    flag = true;
                    break;
                }
            }
//            System.out.println(i);
            if(!flag){
                res ++;
            }
            flag = false;
        }
//        System.out.println(res);
    }
}
