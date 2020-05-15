package matran;

public class Bai7FindPath {
    static boolean findPath(int[][] matrix) {
        int count = 2;
        int column = matrix[0].length;
        int row = matrix.length;
        int startL = -1;
        int startR = -1;

        for(int i = 0; i<row; i++){
            for(int j = 0; j<column; j++){
                if(matrix[i][j] == 1){
                    startL = i;
                    startR = j;
                    break;
                }
            }
        }

        if(startL == -1 && startR == -1){
            return false;
        }

        while (count <= column * row){
            if(startL + 1 < row && matrix[startL + 1][startR] == count){
                startL ++;
                count ++;
            } else if(startR + 1 < column && matrix[startL][startR + 1] == count){
                startR ++;
                count ++;
            } else if(startL - 1 >= 0 && matrix[startL - 1][startR] == count){
                startL --;
                count ++;
            } else if(startR - 1>=0 && matrix[startL][startR - 1] == count){
                startR --;
                count ++;
            } else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 4, 5}, {2, 3, 6}};
        int[][] b = {{1, 3 ,6}, {2, 4, 5}};
        System.out.println(findPath(a) + "\n" + findPath(b));
    }
}
