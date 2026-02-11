package DSA.Rexursion;

import java.util.Arrays;

public class RecursionSample {
    public static void reverseprintNumbers(int a ){
        if(a==0) return;
        System.out.println(a);
        reverseprintNumbers(a-1);
    }
    public static void printNumbers(int a ){
        if(a==0) return;
        printNumbers(a-1);
        System.out.println(a);
    }
    public static int fact(int a ){
        if ((a==0) || (a==1)) return 1;
        return a * fact(a-1);
    }
    public static int sum(int a ){
        if ((a==1) ) return a;
        return a + sum(a-1);
    }
    public static void printArr(int[] arr, int a ){
        if(a==-1){
            return;
        }
        printArr(arr,a-1);
        System.out.println(arr[a]);
    }
    public static int power(int a , int n){
        if(n==0){
            return 1;
        }
        return a * power(a,n-1);
    }
    public static int fibonacci(int a ){
        if(a==0) return 0;
        else if (a==1 || a==2) return 1;
        int e =0;
        int b = 1;
        int c = e+b;
        int d =2;
        while(d<a){
            c=e+b;
            e=b;
            b=c;
            d++;
        }
        return d;
    }
    public static int recurFibo(int a ){
        if(a==0) return 0;
        if(a==1) return 1;
        return recurFibo(a-1)+recurFibo(a-2);
    }
    public static void main(String[] args) {
//        int[] art = {1,2,3,4,5,6};
//        System.out.println(Arrays.toString(art));
//        int a=5;
//        printNumbers(a);
//        int b = fact(a);
//        System.out.println(b);
//        printArr(art,art.length -1);
//        System.out.println(sum(10));
//        System.out.println(power(10,2));
        System.out.println(fibonacci(5));
        System.out.println(recurFibo(50));
    }
}
