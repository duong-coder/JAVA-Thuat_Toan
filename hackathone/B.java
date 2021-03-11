package hackathone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {

    private static BufferedReader in;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));

        String s = in.readLine();
        String[] a = s.split(" ");
        int row = Integer.parseInt(a[0]);
        int col = Integer.parseInt(a[1]);
        int dest = Integer.parseInt(a[2]);
        String[][] src = new String[row][col];
        for (int i = 0; i < row; i++) {
            s = in.readLine();
            String[] data = s.split(" ");
            src[i] = data;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int srcInt = Integer.parseInt(src[i][j]);
                if(srcInt > dest){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
                if(j < col - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
