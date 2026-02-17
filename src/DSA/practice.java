package DSA;
import java.util.*;
public class practice {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        int [] numbers = new int[size];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter "+ size + " numbers of the array");
        for(int i = 0; i<size;i++){
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        int x =0;
        int y =0;
        System.out.println("Enter the values for X and Y");
        x = scanner.nextInt();
        y = scanner.nextInt();
        if(x+y == size){
            System.out.println("there are "+ (numbers[y] - numbers[y-1] - 1 )+ " numbers that satify the given condition");
        }else{
            System.out.println("The x and y do nnot fulfill the conddition.");
        }


    }
}
