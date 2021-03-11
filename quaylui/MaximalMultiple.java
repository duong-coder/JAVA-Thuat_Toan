package quaylui;

public class MaximalMultiple {
    static int maximalMultiple(int[] arr) {
        int max = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum = 0;
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 1; i <= arr.length / 2; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum1 = 0;
                sum2 = 0;
                res = 1;
                for (int z = j; z < j + i; z++) {
                    if (z >= arr.length) {
                        sum1 += arr[z - arr.length];
                    } else {
                        sum1 += arr[z];

                    }
                }
                sum2 = sum - sum1;
                res = sum1 * sum2;
                if(j == 0 && i == 1){
                    max = res;
                }else {
                    if (res > max) {
                        max = res;
                    }
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 7, 99, -1000, 8, 34, 76, 88, 39, 59, 44, 12, 87, 88, 76, 34, 1, 2};
        System.out.println(maximalMultiple(arr));
    }
}
