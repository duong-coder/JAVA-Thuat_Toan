//Cho một xâu kí tự s
//
//        Hãy kiểm tra xem xâu s có thể tạo ra bằng cách ghép một xâu vào chính nó hay không?
//
//        Ví dụ:
//
//        Với inputString = "tandemtandem", kết quả isTandemRepeat(inputString) = true
//        Có thể tạo ra xâu "tandemtandem" bằng cách ghép xâu "tandem" vào phía sau của chính nó
//        Với inputString = "qqq", kết quả isTandemRepeat(inputString) = false
//        Với inputString = "2w2ww", kết quả isTandemRepeat(inputString) = false
//        Đầu vào/Đầu ra
//
//        [Thời gian chạy] 0.5 seconds
//
//        [Đầu vào] string inputString
//
//        Điều kiện:
//        2 ≤ inputString.length ≤ 20.
//
//        [Đầu ra] boolean

package xulichuoi;

public class Bai13TandemRepeat {
    static boolean isTandemRepeat(String inputString) {
        if(inputString.length() % 2 != 0){
            return false;
        }
        int length = inputString.length() / 2;
        String str = inputString.substring(length);
        String str2 = inputString.substring(0, length);
        if(!str.equals(str2)){
            return false;
        }
        return  true;
    }

    public static void main(String[] args) {
        System.out.println(isTandemRepeat("2w2w"));
    }
}
