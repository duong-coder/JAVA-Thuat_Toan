package lqd;

import java.io.*;

public class MAXMOD {

    private static BufferedReader in;

    public static void main(String[] args) throws IOException {
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

        String input = "2 0 999999999";

        InputStream stream = new ByteArrayInputStream(input.getBytes());
        in = new BufferedReader(new InputStreamReader(stream));

        String inputStr = in.readLine();
        String[] arrStr = inputStr.split(" ");
        int[] arrNum = new int[3];
        for(int i = 0; i < 3; i++){
            int num = Integer.parseInt(arrStr[i]);
            arrNum[i] = num;
        }
        int num1 = arrNum[0];
        int num2 = arrNum[1];
        for(int i = arrNum[2]; i >= 0; i--){
            if(i % num1 == num2){
                System.out.println(i);
                break;
            }
        }
//        System.out.println();
    }
}
