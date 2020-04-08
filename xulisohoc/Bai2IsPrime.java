package xulisohoc;/*GCPD (Greatest Common Prime Divisor) được định nghĩa là số nguyên tố lớn nhất
        là ước của các số nguyên dương cho trước. Nhiệm vụ của bạn là tìm GCPD
        của hai số nguyên a và b.

        Ví dụ

        Với a = 12 và b = 18, đầu ra là greatestCommonPrimeDivisor(a, b) = 3;
        Với a = 12 và b = 13, đầu ra là greatestCommonPrimeDivisor(a, b) = -1.*/

import java.util.ArrayList;

public class Bai2IsPrime {
    public static int UCLN(int a, int b){
        int temp;
        while (b != 0){
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static int isPrime(int number){
        if(number == 1) {
            return -1;
        }
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int j = 0; j <= number; j++ ) {
            for (int i = 2; i <= number; i++) {
                if(number % i == 0) {
                    numbers.add(i);
                    number = number/i;
                    break;
                }
            }
        }
        int resuilt = numbers.get(numbers.size() - 1);
        return resuilt;
    }
    public static void main(String[] args) {
        int GCPD = UCLN(12, 13);
        System.out.println(isPrime(GCPD));
    }
}
