package thamlam;

import java.util.ArrayList;
import java.util.List;

public class NumberOfSubArray {
    static int numberOfSubArray(int[] arr) {
        int length = 1;
        int max = 1;
        for (int i = 0; i < arr.length; i++) {
            int num1 = 1;
            length = 1;
            List<Integer> includeIndex = new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                for (int z = 0; z < arr.length; z++) {
                    if (i == z) {
                        continue;
                    }
                    int[] num = new int[length];
                    for (int index = 0; index < length; index++) {
                        int indexNumArr = z + index;
                        if (indexNumArr == i || includeIndex.contains(indexNumArr)) {
                            break;
                        }
//                        while (indexNumArr >= arr.length) {
//                            indexNumArr--;
//                        }
                        if(indexNumArr >= arr.length){
                            num[index] = 0;
                        }else {
                            num[index] = arr[indexNumArr];
                        }
                    }
                    int sum = 0;
                    for (int n : num) {
                        sum += n;
                    }
                    if (arr[i] == sum) {
                        num1 += 1;
                        for(int t = z; t < z + length; t++ ){
                            includeIndex.add(t);
                        }
                        z += length;
                    }
                }

                length++;
            }
            if (num1 > max) {
                max = num1;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,4,1,4,3,5,5,4,3,2,4,5,2,3,4,4,3,5};

        System.out.println(numberOfSubArray(arr));
    }

}
