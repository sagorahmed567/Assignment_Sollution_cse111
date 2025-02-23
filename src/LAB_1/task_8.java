package LAB_1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class task_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int [][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("2D Array");
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("1D Array: ");
        int [] arr1 = new int[row*column];
        int tracker = 0;
//        for(int i = 0; i < row; i++){
//            for(int j = 0; j < column; j++){
//                arr1[tracker] = arr[i][j];
//                tracker++;
//            }
//        }

        // if I print it column wise can I use the same process as before
        for(int i = 0; i < row; i++){
            for(int j = 0; j <= i; j++){
                arr1[tracker] = arr[i][j];
                tracker++;
            }
        }
        System.out.println(Arrays.toString(arr1));


    }
}
