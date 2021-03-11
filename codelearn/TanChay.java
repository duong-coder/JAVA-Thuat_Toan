package codelearn;

import java.util.ArrayList;

public class TanChay {
    public static void main(String[] args) {
        int[] tao = {5, 2, 3};
        int[] chay = {4, 4, 4};
        int du = 0;
        int kq = 0;
        int temp = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<tao.length; i++){
            if(du - chay[i] > 0){
                kq = chay[i];
            }else{
                kq = du;
            }
            if(tao[i] - chay[i] > 0){
                du = chay[i];
                arr.add(du + kq);
            }else{
                du = 0;
                temp = tao[i];
                arr.add(temp + kq);
            }
            System.out.println(du+kq);

        }
    }
}
