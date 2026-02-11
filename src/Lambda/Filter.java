package Lambda;

import java.util.*;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println(filterOdd(arr));
    }

    public static List<Integer> filterOdd(int[] arr) {
        List<Integer> a = new ArrayList<Integer>();
/*
 for(int b : arr){
     if(b%2 == 0){
         a.add(b);
     }
 }
*/
        IntPredicate intpredicate = (int value)->{
            return value%2==0;
        };

        return Arrays.stream(arr).filter(intpredicate).boxed().toList();
    }
}
