package lqd;

import java.io.*;
import java.util.Scanner;

public class HTTP {

    private static BufferedReader in;

    public static void main(String[] args) throws FileNotFoundException {
//        if (!"true".equals(System.getProperty("ONLINE_JUDGE"))) {
//            System.setIn(new FileInputStream(
//                    new File("input.txt")));
//            System.setOut(
//                    new PrintStream(new File("output.txt")));
//        }
//        Scanner in = new Scanner(System.in);
//        PrintStream out = System.out;
//        long x = in.nextInt();
//        long y = in.nextInt();
//        long n = in.nextInt();

        String input = "7 5 12345";

        InputStream stream = new ByteArrayInputStream(input.getBytes());
        in = new BufferedReader(new InputStreamReader(stream));

        int result = 1;
        for(int i = 2 ; i< 46 ; i++){
            result += i;
        }

        System.out.println(result);
    }
}
