package thamlam;

import java.util.Arrays;
import java.util.List;

public class NumberOfToys {
    static int numberOfToys(int[] arr, int k) {
//        Integer[] aI = Arrays.stream( arr ).boxed().toArray( Integer[]::new );
        Arrays.sort(arr);
        int sum = 0;
        int res = 0;
        for(int i = 0; i < arr.length; i ++){
            sum += arr[i];
            if(sum > k ){
//                res -= 1;
                break;
            }else{
                res += 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 9, 7, 10, 7};
        int k = 2;

        System.out.println(numberOfToys(arr, k));
    }
}
