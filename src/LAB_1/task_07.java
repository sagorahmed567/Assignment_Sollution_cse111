package LAB_1;

import java.util.Arrays;
import java.util.Scanner;

public class task_07 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();
        double [] arr = new double[len];

        // taking input in the array
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextDouble();
        }
// count the elements without consecutive number
        int count = 1; // it'll keep track of the element number without consecutive numbers
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]){
                count+=1;
            }else{
                continue;
            }
           // System.out.println(count);
        }

        // Now create an array without consecutive elements
        double [] new_array = new double[count];
        int tracker = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(i == 0) {
                new_array[tracker] = arr[i];
                tracker++;
            }else{
                if(arr[i] != arr[i-1]){
                    new_array[tracker] = arr[i];
                    tracker++;
                }else{
                    continue;
                }
            }
        }
        System.out.println("New Array: "+Arrays.toString(new_array));
        System.out.print("Removed Elements: "+(arr.length-new_array.length));

    }
}
