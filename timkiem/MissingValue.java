package timkiem;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingValue {
    static int[] missingValue(int[] a, int[] b) {
        Integer[] aI = Arrays.stream( a ).boxed().toArray( Integer[]::new );
        Integer[] bI = Arrays.stream( b ).boxed().toArray( Integer[]::new );

        Set<Integer> aS = new HashSet<>(Arrays.asList(aI));
        Set<Integer> bS = new HashSet<>(Arrays.asList(bI));

        Set<Integer> res = new HashSet<>();

        Iterator<Integer> iterator = bS.iterator();
        while (iterator.hasNext()){
            Integer num = iterator.next();
            if(!aS.contains(num)){
                res.add(num);
            }
        }
        int[] r = new int[res.size()];
        int i = 0;
        for(Integer set : res){
            r[i] = set;
            i++;
        }
        return r;
    }

    public static void main(String[] args) {
        int[] a = {11, 4, 11, 7, 13, 4, 12, 11, 10, 14};
        int[] b = {1, 4, 11, 7, 3, 7, 10, 13, 4, 8, 12, 11, 10, 14, 12};

        int[] res = missingValue(a, b);
        for(int n : res){
            System.out.print(n + " ");
        }
    }
}
