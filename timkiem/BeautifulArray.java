package timkiem;

public class BeautifulArray {
    static boolean beautifulArray(int[] arr) {
        if(arr.length < 3){
            return false;
        }
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1; i < arr.length - 1; i++){
            sum1 = 0;
            sum2 = 0;

            for(int j = 0; j < i; j++){
                sum1 += arr[j];
            }
            for(int z = i + 1; z < arr.length; z++){
                sum2 += arr[z];
            }
            if(sum1 == sum2){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3};
        int[] arr = {0};
//        int[] arr = {1, 2, 3, 3};

        boolean res = beautifulArray(arr);
        System.out.println(res);
    }
}
