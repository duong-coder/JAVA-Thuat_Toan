package timkiem;

import java.util.*;
import java.util.stream.Collectors;

public class ElementSearch {
    public static void main(String[] args) {
        int[] a = {100, 100, 99, 98, 102, 103};
        int b = 4;
        System.out.println(searchElement(a, b));
    }
    static int searchElement(int[] a, int n) {
        int length = a.length;
        if(n == 0 || n > length){
            return -1;
        }
        List<Integer> list = new ArrayList<>();
        for(int num : a){
            if(list.indexOf(num) < 0){
                list.add(num);
            }
        }
//        Collections.sort(list);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 > o2 ? -1 : 1;
            }
        });
//        Collections.reverse(list);
        return list.get(n-1);
    }
}
