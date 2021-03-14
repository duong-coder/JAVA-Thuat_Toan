package hackathon2;

import java.io.*;

public class E {
    private static BufferedReader in;

    public static void main(String[] args) throws IOException {
        String input = "Today is Saturday. And tomorrow is Sunday";
        char[] compare = {'a', 'e', 'i', 'o', 'u', 'y'};
        int[][] rs = new int[6][2];
        InputStream stream = new ByteArrayInputStream(input.getBytes());
        in = new BufferedReader(new InputStreamReader(stream));
        String str = in.readLine();
        str = str.toLowerCase();
        char[] arrIn = str.toCharArray();
        for(int i = 0; i < compare.length; i ++){
            int[] slxh = new int[2];
            slxh[0] = (int) compare[i];
            slxh[1] = 0;
            rs[i] = slxh;
        }
        for(int i = 0; i < compare.length; i ++){
            int count = 0;
            for(char c : arrIn){
                int numC = (int) c;
                if(c ==  rs[i][0]){
                    count ++;
                }
            }
            rs[i][1] = count;
        }
        for(int i = 0; i < compare.length; i ++){
            for(int j = i + 1; j < compare.length; j ++){
                if(rs[i][1] < rs[j][1]){
                    int[] temp = rs[i];
                    rs[i] = rs[j];
                    rs[j] = temp;
                } else if(rs[i][1] == rs[j][1]){
                    if(rs[i][0] > rs[j][0]){
                        int[] temp = rs[i];
                        rs[i] = rs[j];
                        rs[j] = temp;
                    }
                }
            }
        }
        String result = "";
        for(int i = 0; i < compare.length; i ++){
            if(rs[i][1] != 0){
                char c = (char) rs[i][0];
                result += (c + "(" + rs[i][1] + ") ");
            }
        }
        System.out.print(result.trim());
    }
}
