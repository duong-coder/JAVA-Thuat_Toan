package codelearn;

import java.util.ArrayList;

public class ChuyenCoSo {
    public static final char CHAR_55 = 55;
    public static void main(String[] args) {
        int l = 17;
        int r = 95;
        int base = 3;
        ArrayList<String> arrayList = new ArrayList<>();
        for(l = l;l<r;l++){
            String str = convertNumber(l,base);
            if(checkPalindrome(str)){
                arrayList.add(str);
            System.out.println(str);
            }
        }
    }

    public static String convertNumber(int n, int b) {
        if (n < 0 || b < 2 || b > 16 ) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int m;
        int remainder = n;

        while (remainder > 0) {
            if (b > 10) {
                m = remainder % b;
                if (m >= 10) {
                    sb.append((char) (CHAR_55 + m));
                } else {
                    sb.append(m);
                }
            } else {
                sb.append(remainder % b);
            }
            remainder = remainder / b;
        }
        return sb.reverse().toString();
    }

    static boolean checkPalindrome(String inputString) {
        int n = inputString.length();
        String[] str = inputString.split("");
        for(int i = 0; i <= n/2; i++){
            if(!str[i].equals(str[n - i - 1])){
                return false;
            }
        }
        return true;
    }
}
