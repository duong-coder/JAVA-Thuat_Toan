//Định nghĩa phép toán crossover của hai xâu có độ dài bằng nhau A và B như sau:
//
//        Kết quả của phép toán này là một xâu result có độ dài bằng với hai xâu đầu vào
//        result[i] bằng A[i] hoặc B[i]
//        Cho một danh sách các xâu có độ dài bằng nhau inputArray và một xâu result, hãy đếm xem có bao nhiêu cặp xâu trong mảng đã cho mà kết quả của phép toán crossover cho ra kết quả là result.
//
//        Ví dụ:
//
//        Với inputArray = ["abc", "aaa", "aba", "bab"] và result = "bbb", kết quả stringsCrossover(inputArray, result) = 2.
//        Có 2 cặp xâu kí tự thỏa mãn yêu cầu đề bài là:
//        abc vs bab
//        aba vs bab

package xulichuoi;

public class Bai15StringsCrossover {
    static int stringsCrossover(String[] inputArray, String result) {
        int length = 0;
        for(int i = 0; i<inputArray.length; i++){
            for(int j = i+1; j<inputArray.length; j++){
                for(int z = 0; z < result.length(); z++){
                    char wordResuilt = result.charAt(z);
                    char wordInput1 = inputArray[i].charAt(z);
                    char wordInput2 = inputArray[j].charAt(z);
                    if(wordInput1 == wordResuilt || wordInput2 == wordResuilt){
                        if(z == (result.length() - 1)){
                            length++;
                        }
                        continue;
                    } else {
                        break;
                    }

                }
            }
        }
        return length;
    }

    public static void main(String[] args) {
        String[] input  = {"a","b","c", "d", "e"};
        System.out.println(stringsCrossover(input, "c"));
    }
}
