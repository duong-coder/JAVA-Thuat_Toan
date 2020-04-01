package xulisohoc;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        do {
            ArrayList<Integer> numbers = new ArrayList<>();
            int m = n;
            for(int i = 0; i <=n; i++){
                for(int j = 2; j <=n; j++){
                    if(m%j == 0 ){
                        numbers.add(j);
                        m = m/j;
                        break;
                    }
                }
                if(m==1){
                    break;
                }
            }
            int sum = 0;
            for(Integer number : numbers){
                sum += number;
            }
            if(sum == n){
                n = sum;
                break;
            } else {
                n = sum;
            }
        } while(true);
        System.out.println("n = " + n);
    }
}
