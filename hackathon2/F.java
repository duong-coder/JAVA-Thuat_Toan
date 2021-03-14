package hackathon2;

import java.io.*;

public class F {
    private static BufferedReader in;

    public static void main(String[] args) throws IOException {
        String input = " *    * \n" +
                " *   ** \n" +
                " *  * * \n" +
                " *  * * \n" +
                " * *  * \n" +
                " * *  * \n" +
                " **   * \n" +
                " *    * ";

        InputStream stream = new ByteArrayInputStream(input.getBytes());
        in = new BufferedReader(new InputStreamReader(stream));
        String[][] res = new String[8][8];
        for(int i = 0; i < 8; i++){
            String lengthStr = in.readLine();
            String[] arrLength = lengthStr.split("");
            res[i] = arrLength;
        }
        String[][] res2 = new String[8][8];
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                String temp = res[i][j];
                res2[i][j] = res[i][7 - j];
                res2[i][7 - j] = temp;
            }
        }
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                String s = res2[i][j];
                s = s.trim();
                if(s.contains("*")){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            if(i != 7){
                System.out.println();
            }
        }

    }
}
