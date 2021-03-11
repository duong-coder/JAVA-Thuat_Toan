package codelearn;

public class SoChinhPhuong {
    public static void main(String[] args) {

    }

    static boolean roundSquare(int n) {
        long rs = (long) Math.sqrt(n);
        if(Math.pow(rs,2) == n){
            String[] arr = (n+"").split("");
            new String();
            int temp = 0;
            for(int i = 0; i<arr.length; i++){
                temp += Integer.parseInt(arr[i]);
            }
            if(temp == 10){
                return true;
            }
            return false;
        }

        return false;
    }
}
