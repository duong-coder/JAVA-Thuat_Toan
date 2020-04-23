//Cho địa chỉ hai ô trên bàn cờ vua tiêu chuẩn, hãy kiểm tra chúng cùng màu hay khác màu
//
//        Ví dụ:
//
//        Với cell1 = "A1" và cell2 = "C3", kết quả là chessBoardCellColor(cell1, cell2) = true
//        Đầu vào/Đầu ra
//
//        [Thời gian chạy] 0.5 giây
//
//        [Đầu vào] string cell1, cell2
//        Điều kiện:
//        cell1.length = cell2.length = 2
//        'A' ≤ cell1[0], cell2[0] ≤ 'H'
//        1 ≤ cell1[1], cell2[1] ≤ 8.
//
//        [Đầu ra] boolean
//
//        true nếu 2 ô chung màu false nếu ngược lại.

package matran;


public class Bai1ChessBoardCellColor {
    static boolean chessBoardCellColor(String cell1, String cell2) {

        char[] cell1Str = cell1.toCharArray();
        char[] cell2Str = cell2.toCharArray();
        cell1Str[0] = (char)((int)cell1Str[0] - 17);
        cell2Str[0] = (char)((int)cell2Str[0] - 17);

        boolean resuilt = true;
        boolean resuiltCell1 = false, resuiltCell2 = false;

        boolean temp1R = Integer.parseInt(String.valueOf(cell1Str[0]))%2 != 0;
        boolean temp1L = Integer.parseInt(String.valueOf(cell1Str[1]))%2 != 0;
        boolean temp2R = Integer.parseInt(String.valueOf(cell2Str[0]))%2 != 0;
        boolean temp2L = Integer.parseInt(String.valueOf(cell2Str[1]))%2 != 0;
        if(temp1L == temp1R){
            resuiltCell1 = true;
        }
        if(temp2L == temp2R){
            resuiltCell1 = true;
        }
        return resuiltCell1 == resuiltCell2;
    }

    public static void main(String[] args) {
        String s = "asdawd";
        char[] a = s.toCharArray();
        System.out.println(a[0]);
        System.out.println(chessBoardCellColor("A1", "C3"));
    }
}
