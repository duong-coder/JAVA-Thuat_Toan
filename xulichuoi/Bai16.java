//Một hệ thống hỏi đáp trực tuyến cần chuẩn hóa câu hỏi của người dùng
//
//        Một câu hỏi đã được chuẩn hóa cần tuân thủ các luật sau:
//
//        Luật chung:
//        Câu hỏi chỉ chứa kí tự chữ cái (a-zA-Z), chữ số (0-9), dấu phẩy (,), dấu cách (' '), dấu hỏi (?). Các kí tự khác đều được thay thế bằng dấu cách
//       Luật dấu cách:
//        Không có dấu cách ở đầu hay ở cuối câu. Giữa các từ chỉ có 1 dấu cách duy nhất. Sau mỗi dấu cách là 1 chữ cái hoặc chữ số?
//        Luật dấu phẩy:
//        Trước dấu phẩy luôn là 1 chữ cái hoặc chữ số. Sau dấu phẩy luôn là một dấu cách
//        Trường hợp đứng trước dấu phẩy là dấu cách, hãy xóa dấu phẩy này đi
//        Luật chữ hoa/chữ thường:
//        Chữ cái bắt đầu câu luôn được viết hoa. Các chữ cái khác đều viết thường
//        Luật dấu hỏi:
//        Luôn có 1 dấu ? kết thúc câu. Trước dấu ? luôn là kí tự chữ cái hoặc chữ số
//        Trường hợp có các dấu ? xuất hiện khi chưa kết thúc câu, hãy thay thế nó bằng dấu cách
//        Trường hợp trước dấu cách là dấu phẩy và dấu cách, hãy xóa dấu cách và dấu phẩy
//        Ví dụ:
//
//        Với đầu vào s="this is not a relevant question , is it???", thì kết quả questionCorrection(s) = "This is not a relevant question, is it?"
//        Với đầu vào s="who are you,,???", thì kết quả questionCorrection(s) = "Who are you?"
//        Đầu vào/đầu ra:
//
//        [Thời gian chạy] 0.5 giây
//        [Đầu vào] string s
//        Xâu kí tự chứa ít nhất 1 kí tự chữ cái (a-zA-Z)
//        1 <= x.length <= 1000
//        [Đầu ra] string
//        Xâu kí tự được chuẩn hóa theo các luật trên

package xulichuoi;

import javax.swing.*;

public class Bai16 {
    static String questionCorrection(String s) {
        s = (s.trim()).toLowerCase();
        String resuilt = "";
        String[] strArray = s.split("");
        strArray = endWithQuest(strArray);
        strArray = startWithUpper(strArray);
        strArray = betweenString(strArray);
        for (int i = 0; i<strArray.length; i++){
            resuilt += strArray[i];
        }
        return resuilt;
    }
    static String[] endWithQuest(String[] strArray){
        String endWithKiTu = "\\w";
        int i = 0;
        while(true){
            if(strArray[strArray.length-i-1].matches(endWithKiTu)){
                strArray[strArray.length-i-1] += "?";
                break;
            } else {
                strArray[strArray.length-i-1] = "";
                i+=1;
            }
        }
        return strArray;
    }
    static String[] startWithUpper(String[] strArray){
        String startWithKiTu = "\\w";
        int i = 0;
        if(!strArray[i].matches(startWithKiTu)){
            strArray[i] = strArray[i].toUpperCase();
            return strArray;
        }
        while(true){
            if(strArray[i].matches(startWithKiTu)){
                strArray[i] = strArray[i].toUpperCase();
                break;
            } else {
                strArray[i] = "";
                i+=1;
            }
        }
        return strArray;
    }
    static String[] betweenString(String[] strArray){
        String regexWord = "\\w";
        for(int i = 1; i<strArray.length-2; i++){
            if(strArray[i].equals(" ") || strArray[i].equals("")){
                if(strArray[i+1].equals(" ")){
                    strArray[i+1] = "";
                } else if(strArray[i+1].equals(",")){
                    strArray[i] = "";
                }
            } else if(strArray[i].equals(",")){
                if(strArray[i+1].matches(regexWord)){
                    strArray[i+1] = " "+ strArray[i+1];
                } else if(strArray[i+1].equals(",")){
                    strArray[i+1] = "";
                }
            } else if(strArray[i].equals("?")){
                strArray[i] = "";
            }
        }
        return strArray;
    }
    public static void main(String[] args) {
        String a = "ddd";
        String[] n = {" ", ".", ",", "a", " ", " ", "a", " ", ",", "a", ",", "g", ",", " ", "a"};
        char[] b = {'a', 'b', 'a'};
//        n = endWithQuest(n);
//        n = startWithUpper(n);
//        n = betweenString(n);
//        System.out.println(n);
//        for (int i = 0; i<n.length; i++){
//            System.out.println(n[i]);
//        }
//        System.out.println(String.join("", ));
//        System.out.println(endWithQuest(n));
        System.out.println(questionCorrection("z,,,,,zzz"));
    }
}
