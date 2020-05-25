//Bạn được cho 4 điểm trên mặt phẳng hai chiều: points = [[x1, y1], [x2, y2], [x3, y3], [x4, y4]].
//
//        Bạn nối các điểm đó theo thứ tự đã cho, và nối điểm thứ 4 ngược về điểm đầu tiên.
//
//        Viết chương trình kiểm tra xem hình được tạo bởi cách nối các điểm đã cho theo thứ tự có tạo thành hình chữ nhật hay không?
//
//        Ví dụ
//
//        Với points = [[0, 0], [2, 0], [2, 1], [0, 1]], thì kết quả isRectangle(points) = true.
//        Hình dưới đây là một hình chữ nhật
//
//
//        Với points = [[0, 0], [2, 1], [2, 0], [0, 1]], thì kết quả isRectangle(points) = false.
//        Hình bên dưới không phải là một hình chữ nhật
//
//
//        Với points = [[0, 0], [1, 1], [0, 2], [-1, 1]], thì kết quả isRectangle(points) = true.
//        Hình bên dưới là một hình vuông (dạng đặc biệt của hình chữ nhật), mặc dù các cạnh của nó không song song với trục tọa độ
//
//
//
//        Đầu vào/Đầu ra
//
//        [Thời gian chạy] 0.5 giây
//
//        [Đầu vào] array.array.integer points
//
//        Tọa độ các điểm đầu vào theo định dạng [[x1, y1], [x2, y2], [x3, y3], [x4, y4]].
//
//        Điều kiện:
//        points.length == 4,
//        points[i].length == 2,
//        points[i] ≠ points[j], i ≠ j,
//        -10 ≤ points[i][j] ≤ 10.
//
//        [Đầu ra] boolean
//
//        true nếu 4 điểm được cho theo thứ tự tạo thành hình chữ nhật, ngược lại trả về false.
//        Lý thuyết
//        2 vector u(xU, yU) và v(xV, yV) vuông góc với nhau khi và chỉ khi u * v = 0, tức là xU * xV + yU * yV = 0

package hinhhoc;

public class Bai3IsRectangle {
    boolean isRectangle(int[][] points) {
        int[] points1 = points[0];
        int[] points2 = points[1];
        int[] points3 = points[2];
        int[] points4 = points[3];
        double d1 = getRange(points1, points2);
        double d2 = getRange(points3, points4);
        double r1 = getRange(points2, points3);
        double r2 = getRange(points3, points1);

        if(d1 == d2 || r1 == r2){
            int[] vectorD = getVector(points1, points2);
            int[] vectorR = getVector(points4, points1);
            int resuilt = vectorD[0] * vectorR[0] + vectorD[1] * vectorR[1];
            if(resuilt == 0){
                return true;
            } else{
                return false;
            }
        } else{
            return false;
        }
    }

    double getRange(int[] c1, int[] c2){
        int[] vector = getVector(c1, c2);
        double range = Math.sqrt(Math.pow(vector[0], 2) + Math.pow(vector[1], 2));
        return range;
    }
    int[] getVector(int[] c1, int[] c2){
        int[] vector = new int[2];
        vector[0] = c2[0] - c1[0];
        vector[1] = c2[1] - c1[1];
        return vector;
    }

    public static void main(String[] args) {
        Bai3IsRectangle isRectangle = new Bai3IsRectangle();
        int[][] a = {{0,0},   {2,0},   {2,1},   {0,1}};

        System.out.println(isRectangle.isRectangle(a));
    }
}
