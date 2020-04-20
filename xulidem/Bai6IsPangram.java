//Một pangram là một câu mà mỗi kí tự chữ cái (a-z) được sử dụng ít nhất một lần
//
//        Cho một xâu kí tự, kiểm tra xem nó có phải là một pangram hay không?
//
//        Ví dụ:
//
//        Với sentence = "The quick brown fox jumps over the lazy dog.", thì kết quả isPangram(sentence) = true;
//        Với sentence = "abcdefghijklmnopqrstuvwxya", thì kết quả isPangram(sentence) = false.
//        Đầu vào/Đầu ra:
//
//        [Thời gian chạy] 0.5 giây
//
//        [Đầu vào] string sentence
//
//        Xâu kí tự chứa các kí tự ASCII có mã nằm trong khoảng [32, 126].
//
//        Điều kiện:
//        1 ≤ sentence.length ≤ 100.
//
//        [Đầu ra] boolean
//
//        true nếu sentence là một câu pangram, false nếu ngược lại.

package xulidem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Bai6IsPangram {
    static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();
        Set<String> hashSet = new HashSet<String>();
        String[] arr = sentence.split("");
        Arrays.sort(arr);
        String string = "";
        sentence = "";
        for (int i = 97; i<=122; i++){
            string += (char)i;
        }

        int j = 0;
        for (int i = 0; i<arr.length; i++){
            hashSet.add(arr[i]);
            if(hashSet.size()>j){
                sentence += arr[i];
                j++;
            }
        }
        return sentence.contains(string);
    }

    public static void main(String[] args) {
        String s = "#[]$!asdwydv";
        String[] a = s.split("");
        Arrays.sort(a);
        String string = "";
        for (int i = 97; i<=122; i++){
            string += (char)i;
        }
        System.out.println(isPangram("plmkonjiBhuvgycftxdrzseAwq"));
    }
}
