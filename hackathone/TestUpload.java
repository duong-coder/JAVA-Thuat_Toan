package hackathone;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestUpload {
    private static BufferedReader in;

    public static void main(String[] args) throws IOException {
        String input = "6 7 3 3\n" +
                "206 205 247 245 244 253 111\n" +
                "244 161 137 244 254 255 111\n" +
                "192 154 75 200 249 255 111\n" +
                "90 109 96 143 223 255 111\n" +
                "67 69 107 196 236 255 111\n" +
                "55 51 45 134 218 251 111\n" +
                "0 0 0\n" +
                "0 1 0\n" +
                "0 0 0";

        InputStream stream = new ByteArrayInputStream(input.getBytes());
        in = new BufferedReader(new InputStreamReader(stream));
        String lengthStr = in.readLine();
        String[] arrLength = lengthStr.split(" ");

        int rowImg = Integer.parseInt(arrLength[0]);
        int colImg = Integer.parseInt(arrLength[1]);

        int rowFil = Integer.parseInt(arrLength[2]);
        int colFil = Integer.parseInt(arrLength[3]);

        String[][] images = new String[rowImg][colImg];
        String[][] fils = new String[rowFil][colFil];
        for(int  i = 0; i < rowImg; i++){
            String str = in.readLine();
            String[] arrNum = str.split(" ");
            images[i] = arrNum;
        }

        for(int  i = 0; i < rowFil; i++){
            String str = in.readLine();
            String[] arrNum = str.split(" ");
            fils[i] = arrNum;
        }

        int resuilt = 0;
        for (int i = 0; i < (rowImg - rowFil + 1); i++) {
            for (int j = 0; j < (colImg - colFil + 1); j++) {

                for (int x = 0; x < rowFil; x++) {
                    for (int y = 0; y < colFil; y++) {
                        int numCompare = Integer.parseInt(fils[x][y]);
                        if (numCompare == 1) {
                            resuilt += Integer.parseInt(images[i + x][j + y]);

                        }
                    }
                }
                System.out.print(resuilt);
                resuilt = 0;
                if(j < (colImg - colFil + 1) - 1){
                    System.out.print(" ");
                }
            }
            if(i < (rowImg - rowFil + 1) - 1) {
                System.out.println();
            }
        }
    }

}
