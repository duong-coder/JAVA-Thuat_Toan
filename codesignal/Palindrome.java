package codesignal;

public class Palindrome {
    public static void main(String[] args) {
        String inputString = "aaba";
        int lengthStr = inputString.length();
//        if(lengthStr % 2 ==0){
//
//        }else{
            for(int i = 0; i < lengthStr/2; i++){
                if(inputString.charAt(i) != inputString.charAt(lengthStr - i - 1)){
                    System.out.println("false//");
                }
            }
//        }
        System.out.println("true");
    }
}
