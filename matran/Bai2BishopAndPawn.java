//Bàn cờ vua là một bảng có 8*8 ô vuông
//        Mỗi ô trên bàn cờ được kí hiệu bằng 2 kí tự - 1 kí tự chữ cái và 1 kí tự số
//
//        Các cột hàng dọc được gán nhãn từ trái sang phải bằng các kí tự chữ cái từ 'a' tới 'h'
//        Các hàng ngang được đánh số từ 1 tới 8 từ phía dưới lên trên
//        Vị trí mỗi một ô trên bàn cờ được thể hiện bằng xâu có 2 kí tự: kí tự đầu tiên thể hiện cột,
//        kí tự thứ hai thể hiện hàng. Ví dụ như a8, b3, c2, ...
//        Cho tọa độ tượng trắng bishop và tốt đen pawn trên bàn cờ tiêu chuẩn,
//        kiểm tra xem tượng trắng có thể ăn tốt đen trong một nước đi hay không?
//        Với bishop = "a1" và pawn = "c3", kết quả bishopAndPawn(bishop, pawn) = true.
//        Với bishop = "h1" và pawn = "h3", kết quả bishopAndPawn(bishop, pawn) = false.

package matran;

import java.util.ArrayList;
import java.util.List;

public class Bai2BishopAndPawn {
    static boolean bishopAndPawn(String bishop, String pawn) {
        char[] arrBishop = bishop.toCharArray();
        char[] arrPawn = pawn.toCharArray();
        arrBishop[0] = (char)((int)arrBishop[0] - 48);
        arrPawn[0] = (char)((int)arrPawn[0] - 48);

        String movePawn = String.valueOf(arrPawn[0]) + String.valueOf(arrPawn[1]);
        List<String> moveBishops = new ArrayList<String>();
        int indexMove = 1;
//        boolean flag = false;
        int arrBishopL = Integer.parseInt(String.valueOf(arrBishop[0]));
        int arrBishopR = Integer.parseInt(String.valueOf(arrBishop[1]));


        while(true){
            int moveBishopIL = arrBishopL + indexMove;
            int moveBishopIR = arrBishopR + indexMove;
            if( moveBishopIL>8){
                indexMove = 1;
                break;
            }
            indexMove ++;
            String moveBishop = String.valueOf(moveBishopIL) + String.valueOf(moveBishopIR);
            moveBishops.add(moveBishop);
        }

        while(true){
            int moveBishopIIIL = arrBishopL - indexMove;
            int moveBishopIIIR = arrBishopR - indexMove;
            if(moveBishopIIIR<1){
                indexMove = 1;
                break;
            }
            indexMove ++;
            String moveBishop = String.valueOf(moveBishopIIIL) + String.valueOf(moveBishopIIIR);
            moveBishops.add(moveBishop);
        }

        while(true){
            int moveBishopIVL = arrBishopL + indexMove;
            int moveBishopIVR = arrBishopR - indexMove;
            if(moveBishopIVR<1){
                indexMove = 1;
                break;
            }
            indexMove ++;
            String moveBishop = String.valueOf(moveBishopIVL) + String.valueOf(moveBishopIVR);
            moveBishops.add(moveBishop);
        }

        while(true){
            int moveBishopIIL = arrBishopL - indexMove;
            int moveBishopIIR = arrBishopR + indexMove;
            if(moveBishopIIR>8){
                break;
            }
            indexMove ++;
            String moveBishop = String.valueOf(moveBishopIIL) + String.valueOf(moveBishopIIR);
            moveBishops.add(moveBishop);
        }

        for(String move:moveBishops){
            if(move.equals(movePawn)){
                return true;
            }
        }

        return false;
    }

//    static boolean check(List<String> moveBishops, String movePawn){
//        for(String move:moveBishops){
//            if(move.equals(movePawn)){
//                return true;
//            }
//        }
//        return false;
//    }

    public static void main(String[] args) {
        System.out.println(bishopAndPawn("e4", "h1"));
    }
}
