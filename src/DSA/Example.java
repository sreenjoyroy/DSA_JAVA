package DSA;

import java.util.Arrays;

public class Example {
    Example(){

    }
    public static void sum(int a , int b){
        System.out.println(a+b);
    }
    public static int[] rev(int [] arr1){
        int temp=0;
        int s=0;
        int e=arr1.length-1;
        while(e>=s){
            temp = arr1[s];
            arr1[s]=arr1[e];
            arr1[e]= temp;
            s++;
            e--;
        }
        return arr1;
    }
    public static void main(String args[]){
//        System.out.println("This is an example class");
//        sum(3 , 4);
        int []arr1=new int[4];
        arr1[0] = 12;
        arr1[1]=23;
        arr1[2]=24;
        arr1[3]=25;
//        for(int i =0;i<arr1.length;i++){
//            System.out.println(arr1[i]);
//        }
//        System.out.println("==========================================================================");
//        for(int element:arr1){
//            System.out.println(element);
//        }
//        System.out.println("==========================================================================");
//        System.out.println(Arrays.toString(arr1));
//        System.out.println("==========================================================================");
//        for(int i=arr1.length-1;i>=0;i--){
//            System.out.println(arr1[i]);
//        }
        System.out.println("==========================================================================");
        int []arr2=rev(arr1);
        for(int element:arr2){
            System.out.println(element);
        }
    }
}
