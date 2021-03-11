package hackathone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J {
    private static BufferedReader in;
    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
//        int[] arr = new int[n];
        String numberStr = in.readLine();
        String[] arrNum = numberStr.split(" ");
        int resuilt = 0;
        int nk = Integer.parseInt(arrNum[n-1]);
        for(int i = 0; i < arrNum.length - 1; i++){
            int num = Integer.parseInt(arrNum[i]);
            int test = num % nk;
            if( test != 0){
                if(test % 2 != 0){
                    resuilt += test;
                }
            }
        }
        System.out.println(resuilt);
    }
}
