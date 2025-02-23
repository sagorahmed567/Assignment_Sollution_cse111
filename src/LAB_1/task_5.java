package LAB_1;
import java.util.Scanner;
import java.util.Arrays;

public class task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int endPointer = arr.length - 1;
        for (int startPointer = 0; startPointer < endPointer; startPointer++) {
                int temp = arr[startPointer];
                arr[startPointer] = arr[endPointer];
                arr[endPointer] = temp;
                startPointer++;
                endPointer--;

        }
        System.out.println(Arrays.toString(arr));
    }
}
