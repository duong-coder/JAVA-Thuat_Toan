package codelearn;

public class DemSoTapHop {
    public static void main(String[] args) {
        System.out.println(consecutiveFreeSubsets2(5));
    }
     static  int consecutiveFreeSubsets(int n) {
        long[] arr = new long[n-1];
        for(int i = 1; i<=n; i++){
            arr[i-1] = i;
        }
        int maxPT = 0;
        if(n%2==0){
            maxPT = n/2;
        }else{
            maxPT = n/2 + 1;
        }

        for(int i = 2; i <= maxPT; i++){

        }
        return 0;
    }
    static  int consecutiveFreeSubsets2(int n) {
        int kq = 1;
        for(int i = 3; i <=n; i++){
            kq = kq+2*(i-3);
            kq =kq%( (int) Math.pow(10, 9) + 7);
        }

        return kq;
    }
}
