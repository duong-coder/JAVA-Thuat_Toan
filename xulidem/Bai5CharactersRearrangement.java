//Cho hai xâu kí tự, hãy kiểm tra xem có tồn tại phương án đổi chỗ các kí tự ở trong xâu thứ nhất để trở thành xâu thứ hai được hay không?
//
//        Ví dụ
//
//        Với string1 = "abcd" và string2 = "cbad" thì kết quả charactersRearrangement(string1, string2) = true;
//        Với string1 = "a" và string2 = "b" thì kết quả charactersRearrangement(string1, string2) = false.
//        Đầu vào/Đầu ra
//
//        [Thời gian chạy] 0.5 giây
//
//        [Đầu vào] string s1, s2
//        Xâu kí tự chứa các kí tự chữ cái in thường
//        Điều kiện:
//        1 ≤ string1.length ≤ 105.
//
//        [Đầu ra] boolean
//
//        true nếu tồn tại phương án đổi chỗ, false nếu ngược lại.

package xulidem;

import java.util.*;

public class Bai5CharactersRearrangement {
    static boolean charactersRearrangement(String String1, String String2) {
        if(String1.length() != String2.length()){
            return false;
        }
        List<String> stringList1 = new ArrayList<String>();
        List<String> stringList2 = new ArrayList<String>();
        stringList1 = changeString(String1);
        stringList2 = changeString(String2);
        for(int i = 0; i<stringList1.size(); i++){
            if(stringList1.size() != stringList2.size()){
                return false;
            }
            if (!(stringList1.get(i)).equals(stringList2.get(i))) {
                return false;
            }
        }
        return true;
    }
    static List<String> changeString(String str){
        List<String> strArray = new ArrayList<String>();
        Set<String> hashSet = new HashSet<String>();
        String[] strings = str.split("");
        for (int i = 0; i < str.length(); i++){
            hashSet.add(strings[i]);
        }
        for(String word:hashSet){
            int j = 0;
            for (int i = 0; i<str.length(); i++) {
                if (word.equals(strings[i])) {
                    j++;
                }
            }
            strArray.add(word + j);
        }
        Collections.sort(strArray);
        return strArray;
    }
    public static void main(String[] args) {
        System.out.println(charactersRearrangement("abcdef", "badcfe"));
    }
}
