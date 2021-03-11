package hackathone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class K {
    private static BufferedReader in;
    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(in.readLine());
//        int[] arr = new int[n];
        String lengthStr = in.readLine();
        String[] arrLength = lengthStr.split(" ");
            int length1 = Integer.parseInt(arrLength[0]);
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        String[] map1 = new String[length1];
            int length2 = Integer.parseInt(arrLength[1]);
        String[] map2 = new String[length2];

        int resuilt = 0;
        int totalLength = length1 + length2;
        int minLength = Math.min(length1, length2);
        for(int i = 0; i < length1; i++){
            String str = in.readLine();
            list1.add(str);
        }
        for(int i = 0; i < length2; i++){
            String str = in.readLine();
            list2.add(str);
        }
        for (int i = 0; i < minLength; i++){
            if(list1.get(i).equals(list2.get(i)) && i + length2 <= length1){
                resuilt +=1;
            }
        }
        System.out.print(resuilt);
    }
}
