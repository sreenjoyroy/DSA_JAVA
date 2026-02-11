package DSA;

import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        int [][] a= {
                {1,2,3},
                {2,3,4}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an element:");
        int ele = sc.nextInt();
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[0].length;j++){
                if(a[i][j]==ele){
                    a[i][j]=Integer.MIN_VALUE;
                }
            }
        }
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
