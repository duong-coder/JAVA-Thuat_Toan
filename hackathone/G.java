package hackathone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G {
    private static BufferedReader in;
    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));

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
