package hinhhoc;

public class Bai1FindSquareSide {
    static int findSquareSide(int[] x, int[] y) {
        int toaDoX = x[0];
        int toaDoY = y[0];
        int toaDo1X = x[1];
        int toaDo1Y = y[1];
        int toaDo2X = x[2];
        int toaDo2Y = y[2];
        int toaDo3X = x[3];
        int toaDo3Y = y[3];

        double vector1X = Math.pow((toaDo1X - toaDoX), 2);
        double vector1Y = Math.pow((toaDo1Y - toaDoY), 2);
        double canh1 = Math.sqrt( vector1X + vector1Y );

        double vector2X = Math.pow((toaDo2X - toaDoX), 2);
        double vector2Y = Math.pow((toaDo2Y - toaDoY), 2);
        double canh2 = Math.sqrt( vector2X + vector2Y );

        double vector3X = Math.pow((toaDo3X - toaDoX), 2);
        double vector3Y = Math.pow((toaDo3Y - toaDoY), 2);
        double canh3 = Math.sqrt( vector3X + vector3Y );

        if(canh1 == canh2){
            return (int) (canh1 * canh1);
        } else if(canh1 == canh3) {
            return (int)(canh1 * canh1);
        } else{
            return (int) (canh2 * canh2);
        }


    }

    public static void main(String[] args) {
        int[] x = {0, 1, 0, 1};
        int[] y = {0, 1, 1, 0};
        System.out.println(findSquareSide(x, y));
    }
}
