//Xóa các khoảng trắng thừa (kí tự cách) trong xâu kí tự cho trước, sao cho giữa các từ chỉ cách nhau bởi 1 khoảng trống. Cũng không có khoảng trống ở đầu và cuối của xâu
//
//        Ví dụ
//
//        Với input = " abc   a aa  a a ", kết quả formatString(input) = "abc a aa a a".
//        Đầu vào/Đầu ra:
//
//        [Thời gian chạy] 0.5 seconds
//
//        [Đầu vào] string input
//        xâu kí tự chứa kí tự chữ số và chữ cái in hoa hoặc in thường,
//        Điều kiện:
//        4 ≤ input.length ≤ 20.
//
//        [Đầu ra] string
//
//        Xâu kí tự sau khi đã xóa các kí tự space thừa

package xulichuoi;

public class Bai12XoaKiTuTrang {
    static String formatString(String input) {
        input = input.trim();
        String[] str1 = input.split("");
        String[] str2 = input.split("");
        String resuilt = "";
        for(int i = 0; i<=(str1.length - 1); i++){
            if(str1[i].equals(" ") && str1[i + 1].equals(" ")){
                str1[i] = "";
            }
            resuilt += str1[i];
        }

        return resuilt;
    }

    public static void main(String[] args) {
        System.out.println(formatString(" a aa  aa a a "));
    }
}
