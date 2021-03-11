package codelearn;

public class Sum {
    public static void main(String[] args) {
        int n = 7;
        long s = 0;
        for(int i=1; i<=7; i++){
            s += (long) Math.pow((2*i -1),3);
            s =s%((long) Math.pow(10,9) + 7);
        }


    }
}
