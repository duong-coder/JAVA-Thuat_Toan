package codelearn;

import java.util.ArrayList;
import java.util.HashSet;

public class ToaDo {
    public static void main(String[] args) {
        int[][] p = {{4, -2}, {2, 4}, {7,3}};
        HashSet<Integer> arr = new HashSet<>();
        for(int i =0; i < p.length; i++){
                if(p[i][0] > 0 && p[i][1] > 0){
                    arr.add(1);
                }else if(p[i][0] < 0 && p[i][1] > 0){
                    arr.add(2);
                }else if(p[i][0] < 0 && p[i][1] < 0){
                    arr.add(3);
                }else if(p[i][0] > 0 && p[i][1] < 0){
                    arr.add(4);
                }
        }
        Object[] arrClone =  arr.toArray();
        for(Object i : arrClone){
            System.out.println(i);
        }
//        arr.
        System.out.println(arrClone[0] + "" + arrClone[1]);
    }
}
