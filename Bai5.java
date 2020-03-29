import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//Cho số tự nhiên product
//        Hãy tìm số nguyên dương nhỏ nhất (lớn hơn 0) mà tích các chữ số của số đó bằng product. Nếu không có số thỏa mãn, trả ra -1.
//
//        Ví dụ
//
//        Với product = 12, thì kết quả digitsProduct(product) = 26;
//        Với product = 19, thì kết quả digitsProduct(product) = -1.
//        Đầu vào/đầu ra:
//
//        [Thời gian chạy] 0.5 giây
//        [Đầu vào] integer product
//        Điều kiện:
//        0 ≤ product ≤ 600.
//        [Đầu ra] integer
public class Bai5 {
    static int digitsProduct(int product) {
        if(product==0){return  10;}
        else if(product > 0 && product < 10){
            return product;
        };

        if(isSNT(product)){
            return -1;
        }
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i <=20; i++){
            for(int j = 9; j >= 1; j--){
                if (product%j==0){
                    product /= j;
                    numbers.add(j);
                    System.out.println(product +" "+ j );
                    break;
                }
            }
            if(product == 1){
                break;
            }
        }
//        Collections.sort(numbers);
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2){
                    return 1;
                } else if(o1 < o2){
                    return -1;
                } else{
                    return 0;
                }
            }
        });
        String s = "";
        for(Integer number:numbers ){
            s += number;
        }
        return Integer.parseInt(s);
    }
    static boolean isSNT(int number){
        for(int i = 2; i<number; i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a = digitsProduct(450);
        System.out.println(a);
    }
}
