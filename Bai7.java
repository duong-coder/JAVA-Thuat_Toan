//Một bài nâng cao từ bài kiểm tra số nguyên tố:
//
//        Cho số nguyên n, hãy tính tổng các số nguyên tố nhỏ hơn hoặc bằng n
//
//        Bởi vì tổng các số nguyên tố nhỏ hơn hoặc bằng n có thể rất lớn, nên hãy trả ra kết quả của tổng trên dưới dạng là số dư trong phép chia của tổng trên cho 22082018.
//
//        Example
//
//        Với n = 2 thì primeSum(n) = 2
//        Với n = 3 thì primeSum(n) = 5
//        Đầu vào/Đầu ra:
//
//        [Thời gian chạy] 0.5 giây
//        [Đầu vào] integer n
//        -10^7 < n < 10^7
//        [Đầu ra] integer
//        Gợi ý:
//
//        Kiểm tra và tính tổng các số nguyên tố từ 1 tới n có thể tốn nhiều thời gian
//        Để tăng tốc tìm các số nguyên tố, có thể sử dụng sàng Eratosthenes

public class Bai7 {
    static int primeSum(int n){
        boolean[] prime = new boolean[n+2];
        for(int i = 2; i <= n; i++){
            prime[i] = true;
        }
        int sum = 0;
        for(int i = 2; i<=n; i++){
            if(prime[i]){
                sum+=i;
                for (int j = 0; j<n/2; j++){
                     int notPrime = i*i + j*i;
                     if(notPrime <= n) {
                         prime[notPrime] = false;
                     }
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(primeSum(5));
    }
}
