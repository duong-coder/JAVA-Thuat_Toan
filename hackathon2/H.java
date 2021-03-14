package hackathon2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class H {
    private static BufferedReader in;

    public static void main(String[] args) throws IOException {
        String input = "1 50";

        InputStream stream = new ByteArrayInputStream(input.getBytes());
        in = new BufferedReader(new InputStreamReader(stream));
        String str = in.readLine();
        String[] arr = str.split(" ");
        int num1 = Integer.parseInt(arr[0]);
        int num2 = Integer.parseInt(arr[1]);
        int index = 0;
        List<Integer> lst = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for(int i = 1; i <= num2; i++){
            int sum1 = 0;
            int sum2 = 0;
            for(int j = i; j >=1; j--){
                if(i % j == 0){
                    sum1 += j;
                }
            }
            if(index != 0){
                sum2 = lst.get(index - 1);
            }
            if(sum1 > sum2){
                lst.add(sum1);
                res.add(i);
                index++;
            }
        }
        Collections.sort(lst);
        for(Integer num : lst){
            if(num > num2){
                break;
            }
            System.out.print(num + " ");
        }
        System.out.println();
        for(Integer num : res){
            if(num < num1){
                continue;
            }
            System.out.print(num + " ");
        }
    }
}
