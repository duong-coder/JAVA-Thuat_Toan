//Cho một bảng có n hàng và m cột
//
//        Mỗi một ô trong bảng ở hàng i và cột j chứa 1 số  có giá trị bằng i * j (chỉ số hàng và cột đều được đếm bắt đầu từ 1)
//
//        Cho trước n và m, hãy tìm số lượng các số nguyên khác nhau nằm trong bảng
//
//        Ví dụ:
//
//        Với n = 3 và m = 2, thì kết quả differentValuesInMultiplicationTable2(n, m) = 5.
//        Có 5 giá trị khác nhau nằm trong bảng là: 1, 2, 3, 4, 6
//        Đầu vào/Đầu ra:
//
//        [Thời gian chạy] 0.5 giây
//
//        [Đầu vào] integer n,m
//
//        Điều kiện:
//        1 ≤ n ≤ 20
//
//        [Đầu ra] integer

package xulidem;

import java.util.HashSet;
import java.util.Set;

public class Bai2DifferentValues {
    static int differentValuesInMultiplicationTable2(int n, int m) {
        int[][] mang = new int[n][m];
        Set<Integer> arraySet = new HashSet<Integer>();
//        int resuilt = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                mang[i][j] = (i+1)*(j+1);
                arraySet.add(mang[i][j]);
            }
        }
        return arraySet.size();
    }

    public static void main(String[] args) {
        System.out.printf("kq: " + differentValuesInMultiplicationTable2(3,2));
    }
}
