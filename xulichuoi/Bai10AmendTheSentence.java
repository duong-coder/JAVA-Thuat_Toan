//Cho một xâu kí tự s gồm nhiều từ. Trong đó mỗi từ sẽ được bắt đầu bởi một kí tự in hoa.
//
//        Vì một lí do gì đó, người ta quên chèn các khoảng trắng giữa các từ.
//
//        Hãy viết chương trình sửa lại xâu kí tự đó theo yêu cầu sau:
//
//        Tách các từ, và thêm 1 kí tự cách (space) giữa 2 từ liên tiếp
//        Chuyển đổi các kí tự in hoa thành kí tự in thường
//        Ví dụ
//
//        Với s = "CodesignalIsAwesome", thì kết quả amendTheSentence(s) = "codesignal is awesome"
//        Với s = "Hello", thì kết quả amendTheSentence(s) = "hello".
//        Đầu vào/Đầu ra:
//
//        [Thời gian chạy] 0.5 giây với C++, 3s với Java và C#, 4s với Python, JS và GO
//
//        [Đầu vào] string s
//        Một xâu chứa kí tự chữ cái in hoa và in thường.
//        Điều kiện:
//        3 ≤ s.length ≤ 100.
//
//        [Đầu ra] string
//        Câu đã thay đổi.

package xulichuoi;

import java.util.Arrays;

public class Bai10AmendTheSentence {
    static String amendTheSentence(String s) {
        String[] kiTu = s.split("");
        String resuilt = "";
        for (int i = 0; i<s.length(); i++){
            if(kiTu[i].toUpperCase() == kiTu[i]){
                kiTu[i] = " " + kiTu[i];
            }
            resuilt += kiTu[i];
        }
        return resuilt.toLowerCase();
    }
    public static void main(String[] args) {
//        String s = "NgoHuuDuong";
//        String str = "N";
//        boolean kq = str.toUpperCase() == str;
//        System.out.println(kq +" "+ str);
        System.out.println(amendTheSentence("NgoHuuDuong"));
    }
}
