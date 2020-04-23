//
//Cho một ma trận chữ nhật chứa các chữ số (0-9)
//
//        Hãy tính số lượng các hình vuông 2 × 2 khác nhau tồn tại trong ma trận
//
//        Ví dụ
//
//        Với matrix = [[1, 2, 1],
//        [2, 2, 2],
//        [2, 2, 2],
//        [1, 2, 3],
//        [2, 2, 1]] thì kết quả differentSquares(matrix) = 6.
//
//        Dưới đây là 6 hình vuông 2 × 2 khác nhau:
//        1 2
//        2 2
//        2 1
//        2 2
//        2 2
//        2 2
//        2 2
//        1 2
//        2 2
//        2 3
//        2 3
//        2 1
//        Đầu vào/Đầu ra:
//
//        [Thời gian chạy] 0.5 giây
//        [Đầu vào] array.array.integer matrix
//        Điều kiện:
//        1 ≤ matrix.length ≤ 100
//        1 ≤ matrix[i].length ≤ 100
//        0 ≤ matrix[i][j] ≤ 9
//        [output] integer
//        Số các hình vuông 2 × 2 khác nhau tồn tại trong ma trận.

package xulidem;

import java.util.HashSet;
import java.util.Set;

public class Bai7DifferentSquares {
    static int differentSquares(int[][] matrix) {
        Set<String> hashSet = new HashSet<String>();
        for (int j = 0; j + 1 < matrix.length; j++) {
            for (int i = 0; i + 1 < matrix[0].length; i++) {
              String square = matrix[j][i] + "" + matrix[j][i+1]
                      + "" + matrix[j+1][i] + "" + matrix[j+1][i+1];
              hashSet.add(square);
//                System.out.println(square);
            }
        }
        return hashSet.size();
    }

    public static void main(String[] args) {
        String[][] arr = {{"a", "b", "c"}, {"e", "r", "t"}};
        System.out.println();
        System.out.println(arr.length + "\n" + arr[0].length);
        int[][] intArr = {{9,9,9,9,9},   {9,9,9,9,9},   {9,9,9,9,9},   {9,9,9,9,9},   {9,9,9,9,9},   {9,9,9,9,9}};
        int a = differentSquares(intArr);
        System.out.println(a);
    }
}
