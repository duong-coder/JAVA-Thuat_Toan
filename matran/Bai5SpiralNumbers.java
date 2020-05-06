//Cho số nguyên dương n. Hãy tạo ra ma trận vuông kích thước n*n chứa các số từ 1 tới n*n tăng dần theo hình xoắn ốc, xuất phát từ ô trên trái và đi theo theo theo chiều kim đồng hồ
//
//        Ví dụ
//
//        Với n = 3, kết quả
//
//        spiralNumbers(n) = [[1, 2, 3],
//        [8, 9, 4],
//        [7, 6, 5]]
//        Đầu vào/đầu ra
//
//        [Thời gian chạy] 0.5 giây
//
//        [Đầu vào] integer n
//        Độ dài của ma trận
//        Điều kiện:
//        3 ≤ n ≤ 100.
//
//        [Đầu ra] matrix.integer

package matran;

import java.util.Arrays;

public class Bai5SpiralNumbers {
    static int[][] spiralNumbers(int n) {
        int index = 1;
        int indexColR = n - 1;
        int indexColL = 0;
        int indexRowUp = 0;
        int indexRowDown = n - 1;
        int[][] resuilt = new int[n][n];
        while(true) {
            for (int j = indexColL; j <= indexColR; j++) {
                resuilt[indexRowUp][j] = index;
                index++;
            }
            indexRowUp ++;
            for(int j = indexRowUp; j<=indexRowDown; j++) {
                resuilt[j][indexColR] = index;
                index++;
            }
            indexColR --;
            for(int z = indexColR; z >=indexColL; z--){
                resuilt[indexRowDown][z] = index;
                index++;
            }
            indexRowDown --;

            for(int j = indexRowDown; j>=indexRowUp; j--){
                resuilt[j][indexColL] = index;
                index++;
            }
            indexColL ++;
            if(index > n*n){
                break;
            }
        }

        return resuilt;
    }

    public static void main(String[] args) {
        int[][] a = spiralNumbers(4);
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[0].length; j++){
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
    }
}
