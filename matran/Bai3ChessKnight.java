//Cho biết vị trí của con mã trên bàn cờ vua, hãy tìm số vị trí khác nhau mà con mã có thể thực hiện nước nhảy
//
//        Một con mã có thể nhảy tới 1 vị trí cách vị trí hiện tại 2 ô theo chiều ngang và 1 ô theo chiều dọc,
//        hoặc 2 ô theo chiều dọc và 1 ô theo chiều ngang. Nước đi của con mã tạo ra hình dáng giống như 1 chữ L

        package matran;

public class Bai3ChessKnight {
    static int chessKnight(String Cell) {
        int[] arrCell1 = {2, -2};
        int[] arrCell2 = {1, -1};
        int resuilt = 0;
        char[] arrCell = Cell.toCharArray();
        arrCell[0] = (char)((int)arrCell[0] - 48);
        int cellL = Integer.parseInt(String.valueOf(arrCell[0]));
        int cellR = Integer.parseInt(String.valueOf(arrCell[1]));
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++) {
                int cellNewL = cellL + arrCell1[i];
                int cellNewR = cellR + arrCell2[j];
                if (cellNewL >= 1 && cellNewL <= 8 && cellNewR >= 1 && cellNewR <= 8) {
                    resuilt++;
                }
                cellNewL = cellL + arrCell2[i];
                cellNewR = cellR + arrCell1[j];
                if (cellNewL >= 1 && cellNewL <= 8 && cellNewR >= 1 && cellNewR <= 8) {
                    resuilt++;
                }
            }
        }
        return resuilt;
    }

    public static void main(String[] args) {
        System.out.println(chessKnight("g6"));
    }
}
