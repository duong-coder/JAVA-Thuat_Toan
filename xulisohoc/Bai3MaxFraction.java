package xulisohoc;

public class Bai3MaxFraction {
    public static  int maxFraction(int[] numerators, int[] denominators) {
        float[] resuilt = new float[numerators.length];
        for(int i = 0; i < numerators.length ; i++){
            float x =  numerators[i];
            float y = denominators[i];
            resuilt[i] = x/y;
        }
        float max = resuilt[0];
        int index = 0;
        for(int i = 1; i<resuilt.length; i++ ){
            if(max < resuilt[i]){
                max = resuilt[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = {4,3};
        System.out.println(maxFraction(a, b));
    }
}
