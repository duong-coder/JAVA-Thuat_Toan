package hackathon2;

import java.io.*;

public class D {
    private static BufferedReader in;

    public static void main(String[] args) throws IOException {
        String input = "5 5\n" +
                "1 1 1 0 0\n" +
                "0 1 1 1 0\n" +
                "0 0 1 1 1\n" +
                "0 0 1 1 0\n" +
                "0 1 1 0 0";
        InputStream stream = new ByteArrayInputStream(input.getBytes());
        in = new BufferedReader(new InputStreamReader(stream));
        String str = in.readLine();
        String[] lengthStr = str.split(" ");
        int l1 = Integer.parseInt(lengthStr[0]);
        int l2 = Integer.parseInt(lengthStr[1]);

        int[][] arr = new int[l1][l2];

        for(int i = 0; i < l1; i++){
            String s = in.readLine();
            String[] arrNum = s.split(" ");
            int[] num = new int[l2];
            for(int j = 0; j < l2; j++){
                num[j] = Integer.parseInt(arrNum[j]);
            }
            arr[i] = num;
        }
        int x = l2;
        int y = l1;
        int max = 0;
//        while(true){
            for(int t = x; t >= 1; t--) {
                for (int z = y; z >= 1; z--) {

                    for (int i = 0; i < l1 - z; i++) {
                        for (int j = 0; j < l2 - t; j++) {
                            int temp = 0;
                            for(int b = i; b < z + i; b++){
                                for(int a = j; a < t + j; a++){
                                    if (arr[b][a] == 0) {
                                        temp = 0;
                                        break;
                                    }
                                    temp ++;
                                }
                            }
                            if(temp > max){
                                max = temp;
                            }
                        }
                    }

                }
            }
//        }

        System.out.println(max);
    }
}
