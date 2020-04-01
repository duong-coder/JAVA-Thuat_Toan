package xulichuoi;//Một trang web định nghĩa 1 mật khẩu được gọi là mạnh (strong) nếu đảm bảo các yếu tố sau:
//
//        Có độ dài tối thiểu là 6
//        Chứa ít nhất 1 chữ số (1234567890)
//        Chứa ít nhất kí tự chữ cái in thường (abc...z)
//        Chứa ít nhất 1 kí tự chữ cái in hoa (ABC...Z)
//        Chứa ít nhất 1 kí tự đặc biệt: !@#$%^&*()-+
//        Cho một xâu kí tự thể hiện password, hãy kiểm tra xem đó có phải là password mạnh hay không?
//
//        Ví dụ:
//
//        Với password = "abc", kết quả checkStrongPassword(password ) = false;
//        Với password = "Aa1!", kết quả checkStrongPassword(password ) = false;
//        Với password = "Aabc1!", kết quả checkStrongPassword(password ) = true;
//        Đầu vào/đầu ra:
//
//        [Thời gian chạy] 0.5s với C++, 3s với Java và C#, 4s với Python, JS, Go
//
//        [Đầu vào] string password
//
//        Điều kiện:
//        3 ≤ password.length ≤ 100.
//
//        [Đầu ra] boolean
//
//        true nếu password là strong, false ngược lại

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai9 {
    static boolean checkStrongPassword(String password) {
        if((password.length() < 6)){
            return false;
        }
        int[] kiTuDB = {33,35,36,37,38,40,41,42,43,45,64,94};
        int[] passInt = new int[password.length()];
        boolean[] resuilt = new boolean[4];
//        String[] pass = password.split("");

        for(int i = 0; i<passInt.length; i++){
            passInt[i] =(int) password.charAt(i);
        }
        if(check(passInt, 48, 57)){
            resuilt[0] = true;
        }
        if(check(passInt, 97, 122)){
            resuilt[1] = true;
        }
        if(check(passInt, 65, 90)){
            resuilt[2] = true;
        }
        for(int pass:passInt){
            for (int kitudb:kiTuDB){
                if(pass == kitudb){
                    resuilt[3] = true;
                    break;
                }
            }
        }
        for(boolean res:resuilt){
            if(!res){
                return false;
            }
        }
        return true;
    }
    static boolean check(int[] passInt, int start, int end){
        for(int pass:passInt){
            if(pass >= start && pass<=end) {
                for (int i = start; i <= end; i++) {
                    if (pass == i) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    static boolean useRegex(String password){
//        final String abcRegex = "[a-b]";
        final String regex = "[!@#$%^&*()-+]*\\w+[!@#$%^&*()-+]+\\w*";
        boolean resuilt = false;
        if(password.length() >= 6) {
            resuilt = Pattern.matches(regex, password);
        }
        return resuilt;
    }
    public static void main(String[] args) {
        System.out.println(checkStrongPassword("Aa123A!"));
        System.out.println(useRegex("ABC1&!aaaa"));
    }
}
