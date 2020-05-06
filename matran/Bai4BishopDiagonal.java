package matran;

import java.util.ArrayList;
import java.util.List;

public class Bai4BishopDiagonal {

    static int arrBishopL;
    static int arrBishopR;
    static int arrBishop2L;
    static int arrBishop2R;

    static String[] BishopDiagonal(String bishop1, String bishop2) {
        char[] arrBishop1 = bishop1.toCharArray();
        char[] arrBishop2 = bishop2.toCharArray();
        arrBishop1[0] = (char)((int)arrBishop1[0] - 48);
        arrBishop2[0] = (char)((int)arrBishop2[0] - 48);

        String moveBishop2 = String.valueOf(arrBishop2[0]) + String.valueOf(arrBishop2[1]);
        List<String> moveBishops = new ArrayList<String>();

        int indexMove = 1;
        arrBishopL = Integer.parseInt(String.valueOf(arrBishop1[0]));
        arrBishopR = Integer.parseInt(String.valueOf(arrBishop1[1]));
        arrBishop2L = Integer.parseInt(String.valueOf(arrBishop2[0]));
        arrBishop2R = Integer.parseInt(String.valueOf(arrBishop2[1]));

        while(true){
            int moveBishopIL = arrBishopL + indexMove;
            int moveBishopIR = arrBishopR + indexMove;
            if( moveBishopIL>8 || moveBishopIR>8){
                indexMove = 1;
                break;
            }
            indexMove ++;
            String moveBishop = String.valueOf(moveBishopIL) + String.valueOf(moveBishopIR);

            if(moveBishop.equals(moveBishop2)){
                arrBishopL -= (arrBishopR - 1);
                arrBishopR = 1;

                arrBishop2R += (8 - arrBishop2R);
                arrBishop2L = 8;

                return convert();
            }
//            moveBishops1.add(moveBishop);
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

            if(moveBishop.equals(moveBishop2)){
                arrBishopR += (8 - arrBishopR);
                arrBishopL = 8;

                arrBishop2L -= (arrBishop2R - 1);
                arrBishop2R = 1;


                return convert();
            }
//            moveBishops2.add(moveBishop);
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

            if(moveBishop.equals(moveBishop2)){
                arrBishopL -= (arrBishopR - 1);
                arrBishopR = 8;

                arrBishop2R += (8 - arrBishop2L);
                arrBishop2L = 8;

                return convert();
            }
//            moveBishops3.add(moveBishop);
        }

        while(true){
            int moveBishopIIL = arrBishopL - indexMove;
            int moveBishopIIR = arrBishopR + indexMove;
            if(moveBishopIIR>8){
                break;
            }
            indexMove ++;
            String moveBishop = String.valueOf(moveBishopIIL) + String.valueOf(moveBishopIIR);
            if(moveBishop.equals(moveBishop2)){
                arrBishopL -= (arrBishopR - 1);
                arrBishopR = 1;

                arrBishop2R += (8 - arrBishop2R);
                arrBishop2L = 8;

                return convert();
            }
//            moveBishops4.add(moveBishop);
        }

        String[] a = {"a", "b"};
        return a;
    }

    static String[] convert(){
        String bishop1 = String.valueOf((char)(arrBishopL + 48)) + String.valueOf((char)(arrBishopR + 48));
        String bishop2 = String.valueOf((char)(arrBishop2L + 48)) + String.valueOf((char)(arrBishop2R + 48));
        String[] resuilt = {bishop1, bishop2};
        return resuilt;
    }

    public static void main(String[] args) {

    }
}
