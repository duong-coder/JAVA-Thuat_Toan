//Cho một xâu kí tự, viết hàm mã hóa xâu đó theo các luật sau:
//
//        Đầu tiên, cắt xâu ban đầu thành các xâu con mà mỗi xâu con chỉ chứa các kí tự giống nhau và xâu con tạo ra có độ dài là lớn nhất
//        Ví dụ, xâu "aabbbc" được tách thành ["aa", "bbb", "c"]
//        Tiếp theo, với mỗi xâu con có chiều dài lớn hơn 1, hãy thay thế xâu đó bằng việc viết liền độ dài của xâu với kí tự lặp lại
//        Ví dụ, xâu con "bbb" được thay thế bằng "3b"
//        Cuối cùng, viết liên tiếp các xâu con vừa được mã hóa theo thứ tự ban đầu để tạo ra xâu kết quả
//        Ví dụ:
//
//        Với s = "aabbbc", thì kết quả lineEncoding(s) = "2a3bc".
//        Đầu vào/Đầu ra:
//
//        [Thời gian chạy] 0.5 seconds
//
//        [Đầu vào] string s
//        Xâu kí tự chứa các kí tự chữ cái in thường.
//        Điều kiện:
//        4 ≤ s.length ≤ 100.
//
//        [Đầu ra] string
//
//        Xâu kí tự mã hóa.

package xulichuoi;

public class Bai17LineEncoding {
    static String lineEncoding(String s) {
        String[] strArray = s.split("");
        String[] filStrings = new String[100];
        String temp = strArray[0];
        String string = "";
        int indexString = 0;
        for(int i = 0; i<strArray.length; i++){

            if(strArray[i].equals(temp)){
                string += strArray[i];
            } else{
                filStrings[indexString] = string;
                string = "";
                string += strArray[i];
                temp = strArray[i];
                indexString++;
            }
            if(i == strArray.length-1){
                filStrings[indexString] = string;
                indexString++;
            }

        }
        String resuilt = "";
        for(int i = 0; i<indexString; i++){
            if(filStrings[i].length()>1) {
                resuilt += filStrings[i].length() + filStrings[i].substring(0, 1);
            }else {
                resuilt += filStrings[i].substring(0, 1);
            }
        }

        return resuilt;
    }

    public static void main(String[] args) {
//        String s = "asdhuwdu";
//        StringBuilder builder = new StringBuilder();
//        builder.append(s);
//        builder.append("asdwd");
//        String[] strArray = s.split("");
//        System.out.println(builder);
        System.out.println(lineEncoding("aabbbc"));
    }
}
