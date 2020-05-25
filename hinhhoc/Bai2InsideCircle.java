//Cho tọa độ tâm và bán kính của một đường tròn cùng tọa độ của một điểm trên mặt phẳng 2 chiều
//
//        Kiểm tra xem điểm có nằm trong (hoặc nằm trên viền) của đường tròn hay không?
//
//        Ví dụ
//
//        Với point = [1, 1], center = [2, 2], và radius = 1, kết quả insideCircle(point, center, radius) = false.
//
//
//
//        Với point = [1, 1], center = [0, 0], và radius = 3, kết quả insideCircle(point, center, radius) = true.
//
//
//
//        Đầu vào/Đầu ra
//
//        [Thời gian chạy] 0.5 giây
//
//        [Đầu vào] array.integer point
//        Mảng 2 phần tử thể hiện tọa độ của điểm cần kiểm tra.
//        Điều kiện:
//        -100 ≤ point[i] ≤ 100.
//
//        [Đầu vào] array.integer center
//        Mảng 2 phần tử thể hiện tọa độ tâm của đường tròn
//        Điều kiện:
//        -10 ≤ center[i] ≤ 10.
//
//        [Đầu vào] integer radius
//        Bán kính đường tròn.
//        Điều kiện:
//        1 ≤ radius ≤ 5.
//
//        [Đầu ra] boolean
//
//        true nếu point nằm trong đường tròn, false nếu ngược lại.

package hinhhoc;

public class Bai2InsideCircle {
    static boolean insideCircle(int[] point, int[] center, int radius) {
        int[]vector = new int[2];
        vector[0] = center[0] - point[0];
        vector[1] = center[1] - point[1];
        double a = Math.pow(vector[0], 2);
        double b = Math.pow(vector[1], 2);
        double range = Math.sqrt(a + b);

        if(range - radius > 0){
            return false;
        } else{
            return true;
        }
    }

    public static void main(String[] args) {
        int[] point = {1, 1};
        int[] center = {2, 2};
        System.out.println(insideCircle(point, center,1));
    }
}
