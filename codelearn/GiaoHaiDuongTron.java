package codelearn;

public class GiaoHaiDuongTron {
    public static void main(String[] args) {
        int[] a = {0, 0, 4};
        int[] b = {3, 4, 5};
        System.out.println(cuttingCirlce(a, b));
    }
    static boolean cuttingCirlce(int[] center, int[] point) {
        int[] temp = new int[3];
        if(center[2] < point[2]){
            temp = center;
            center = point;
            point = temp;
        }

        int[]vector = new int[2];
        vector[0] = center[0] - point[0];
        vector[1] = center[1] - point[1];
        int a = (int) Math.pow(vector[0], 2);
        int b = (int) Math.pow(vector[1], 2);
        int rangeAB = (int) Math.sqrt(a + b);
        System.out.println("AB" + rangeAB);
        System.out.println("RA" + center[2]);
        System.out.println("RB" + point[2]);
        if(center[2] + point[2] > rangeAB){
            return false;
        }
        if(rangeAB + point[2] < center[2] && center[2] > point[2]){
            return false;
        }

        return true;
    }
}
