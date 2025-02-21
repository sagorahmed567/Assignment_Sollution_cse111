package LAB;
import java.util.Scanner;
import java.util.Arrays;

public class Assignment_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();
        int [] arr = new int[len];
        // taking input in the array

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }

        boolean[] bool = new boolean[arr.length];

        // finding unique element count and updating the boolean array according to it. The array here is default false value . updating it would make the duplicate elements true.

        // In Outer loop I am taking  value from the start one by one and also initialized a boolean array of same length, and it's default value is false
        // first I'll update the boolean array which will change the boolean value to false if a Duplicate value is  found
        // If false, it means it was counted before so I don't need to check again
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!bool[i] ){
                count += 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == arr[i]) {
                        bool[j] = true;
                    }
                }
            }
        }

        //creating unique array
        int arr_count = 0; // index of the unique element array
        int[] new_array = new int[count];
        for(int i = 0; i < bool.length; i++){
            if(!bool[i]){
                new_array[arr_count] = arr[i];
               arr_count++;
            }
        }

        // Counting the unique elements
        System.out.println("Output: ");
        for(int i = 0; i < new_array.length;i++){
            int element_count = 0;
           int element = new_array[i];
            for(int j = 0; j < arr.length; j++){
                if(element == arr[j]){
                    element_count += 1;
                }
            }
            System.out.println(element+" - "+element_count+" times");
        }


        System.out.println("Updated Boolean Array: "+(Arrays.toString(bool)));
        System.out.println("Unique Elements: "+count);
        System.out.println("Updated Array of Unique Elements: "+Arrays.toString(new_array));

    }
}
