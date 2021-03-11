package quaylui;

import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctString {
    static int numberOfDistinctString(String s, String c) {
        String str = s + " ";
        String[] arrStr = str.split("");
        Set<String> set = new HashSet<>();
        set.add(s);
        int length = str.length();
        for(int i = 1; i<=length; i++){
            for(int j = 0; j < length; j++){
                String[] tmp = new String[length];
                for(int x = 0; x < length; x++){
                    tmp[x] = arrStr[x];
                }
                for(int y = j; y < j + i; y ++){
                    if(y >= length){
                        int index = y - length;
                        tmp[index] = c + arrStr[index];
                    }else{
                        tmp[y] = c + arrStr[y];
                    }
                }
                String res = "";
                for(int x = 0; x < length; x++){
                    res = res + tmp[x];
                }
                set.add(res.trim());
            }
        }

        return set.size();
    }

    public static void main(String[] args) {
        String s = "KAFJ";
        String c = "Q";

        System.out.println(numberOfDistinctString(s, c));
    }
}
