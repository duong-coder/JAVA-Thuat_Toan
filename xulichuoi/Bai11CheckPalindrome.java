//Một xâu được gọi là palindrome nếu viết xuôi hay viết ngược xâu đó đều cho ra kết quả giống nhau
//
//        Cho một xâu kí tự, kiểm tra nó có phải xâu palindrome không.
//
//        Ví dụ
//
//        Với inputString = "aabaa", kết quả checkPalindrome(inputString) = true;
//        Với inputString = "abac", kết quả checkPalindrome(inputString) = false;
//        Với inputString = "a", kết quả checkPalindrome(inputString) = true.
//        Đầu vào/Đầu ra
//
//        [Thời gian chạy] 0.5 giây
//
//        [Đầu vào] string inputString.
//        Xâu không rỗng chứa các kí tự chữ cái in thường
//        Điều kiện:
//        1 ≤ inputString.length ≤ 105.
//
//        [Đầu ra] boolean
//
//        true nếu inputString là xâu palindrome, false nếu không.

package xulichuoi;

public class Bai11CheckPalindrome {
    static boolean checkPalindrome(String inputString) {
        int n = inputString.length();
        String[] str = inputString.split("");
        for(int i = 0; i <= n/2; i++){
            if(!str[i].equals(str[n - i - 1])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkPalindrome("aabaa"));
        System.out.println(checkPalindrome("aaba"));
    }
}
