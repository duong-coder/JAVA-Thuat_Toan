//
//Tìm chữ số khác không cuối cùng của n!(giai thừa)
//
//        Ví dụ:
//
//        Với n = 5, kết quả lastDigitDiffZero(n) = 2.
//        5! = 1 · 2 · 3 · 4 · 5 = 120.
//        Với n = 6, kết quả lastDigitDiffZero(n) = 2.
//        6! =1 · 2 · 3 · 4 · 5 · 6 = 720.
//        Với n = 10, kết quả lastDigitDiffZero(n) = 8.
//        10! = 3628800.
//[Thời gian chạy] 0.5 giây
//        [input] integer n
//        Điều kiện:
//        1 ≤ n ≤ 10^6.
//        [output] integer
//        Chữ số cuối cùng khác 0 của n!

public class Bai4 {
    public static int lastDigitDiffZero(int n) {
        long factorial = 1;
        for(int i = n; i >=2; i--){
            factorial *= i;
            if(factorial%10==0){
                factorial /= 10;
            }
        }
        while (factorial % 1000 == 0) {
                factorial /= 10;
        }
//        factorial = factorial/(1000000);
//        System.out.println(factorial);
        System.out.println(factorial);
//        String str = factorial + "";

//        String[] kiTu = str.split("");
//        for(int i = kiTu.length - 1; i >=0; i--){
//            if(!kiTu[i].equals("0") && !kiTu[i].equals(".")){
//                return Integer.parseInt(kiTu[i]) ;
//            }
//        }
        return 1;
    }
    public static void main(String[] args) {
        int a = lastDigitDiffZero(1000);
        System.out.println(a);

    }
}
