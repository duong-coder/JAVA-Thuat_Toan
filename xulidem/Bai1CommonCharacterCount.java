//Cho hai xâu kí tự, tìm số lượng kí tự chung giữa chúng.
//
//        Ví dụ:
//
//        Với s1 = "aabcc" và s2 = "adcaa", thì kết quả commonCharacterCount(s1, s2) = 3.
//        2 xâu s1 và s2 có 3 kí tự chung: 2 kí tự 'a' và 1 kí tự 'c'.
//        Đầu vào/Đầu ra:
//
//        [Thời gian chạy] 0.5 giây
//
//        [Đầu vào] string s1, s2
//
//        Xâu kí tự chỉ chứa các kí tự chữ cái in thường, in hoa
//
//        Điều kiện:
//        1 ≤ s1.length, s2.length < 15.
//
//        [output] integer

package xulidem;

public class Bai1CommonCharacterCount {
    static int commonCharacterCount(String s1, String s2) {
        String[] strArray1;
        String[] strArray2;
        if(s1.compareTo(s2) == -1){
            strArray1 = s2.split("");
            strArray2 = s1.split("");
        } else{
            strArray1 = s1.split("");
            strArray2 = s2.split("");
        }

        int resuilt = 0;
        for(String s:strArray1){
            for (int i = 0; i<strArray2.length; i++){
                if(s.equals(strArray2[i])){
                    strArray2[i] = "";
                    resuilt++;
                    break;
                }
            }
        }
        return resuilt;
    }

    public static void main(String[] args) {
        System.out.println(commonCharacterCount("aabcc", "adcaa"));
    }
}
