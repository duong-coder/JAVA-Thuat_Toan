//
//Cho một xâu kí tự, tìm số lượng xâu con khác nhau của xâu đó (không tính xâu rỗng)
//
//        Ví dụ
//
//        Với inputString = "abac", thì kết quả differentSubstringsTrie(inputString) = 9.
//        9 xâu con khác nhau của xâu đầu vào là:
//        "a", "b", "c", "ab", "ac", "ba", "aba", "bac", "abac"

package xulidem;

import java.util.HashSet;
import java.util.Set;

public class Bai4DifferentSubstrings {
    static int differentSubstringsTrie(String inputString) {
        Set<String> hashSet =  new HashSet<String>();
        for (int j = 1; j <= inputString.length(); j++) {
            for (int i = 0; i + j  <= inputString.length(); i++) {
                String word = inputString.substring(i, i + j);
                hashSet.add(word);
//                System.out.println(word);
            }
        }
        return hashSet.size();
    }

    public static void main(String[] args) {
        String s = "asdasadwd";
        System.out.println(s.substring(8, 9));
        System.out.println(differentSubstringsTrie("abac"));
    }
}
