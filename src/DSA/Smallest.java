package DSA;

public class Smallest {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int []arr = {5,2,5,7,6};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("The smallest element in the array is "+ min);
    }
}
