package hackathone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class H {
    private static BufferedReader in;
    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
//        int[] arr = new int[n];
        String strNum = in.readLine();
        String[] arrStrNum = strNum.split(" ");
        long a = Long.parseLong(arrStrNum[0]);
        long b = Long.parseLong(arrStrNum[1]);


    }
}
