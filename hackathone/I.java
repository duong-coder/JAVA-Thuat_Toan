package hackathone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I {
    private static BufferedReader in;
    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(in.readLine());

//        int[] arr = new int[n];
        String[][] matrix = new String[8][8];
        String[][] matrixCop = new String[8][8];
        for(int i = 0; i < 8; i++){
            String str = in.readLine();
            String[] m = str.split("");
//            matrix[i] = str.split("");
            matrix[i][0] = " ";
//            for(int j = 0; j < 8; j++){
                for(int z = 0; z < m.length; z++){
                    matrix[i][z + 1] = m[z];

                }

                String space = "";
                for (int s = 1; s < 8 - m.length; s ++){
                    matrix[i][8 - s] = " ";
                }

//            }
        }
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                int x = j;
                int y = 7 - i;
                matrixCop[x][y] = matrix[i][j];
            }
        }
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                System.out.print(matrixCop[i][j]);

            }
            System.out.println();
        }
    }
}
