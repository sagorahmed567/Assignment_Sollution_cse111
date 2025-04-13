package LAB_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task_06_second_approach {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();
        int [] arr = new int[len];

        // insert element in the array
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }

        /* Find the number of unique elements for creating an array of unique elements.*/

        int unique_element_count = 0;
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count+=1;
                }
            }
            if(count == 0){
                unique_element_count += 1;
            }
        }


        // create an array of unique elements
        //  outer loop takes an element and if its unique then add it to the unique_arr.
        // the inner loop keeps checking the unique_array if an element already exist

        int [] unique_arr = new int[unique_element_count];
        int unique_array_tracker = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i == 0){ // if it's the first element then just insert it because no other element is there
                unique_arr[unique_array_tracker] = arr[i];
                unique_array_tracker+=1;
            }else{
                // iterating on inner loop for any duplicate value
                boolean flag = false;
                for(int j = 0; j < unique_array_tracker; j++){
                    if(unique_arr[j] == arr[i]){
                        flag = true;
                    }
                }

                if (!flag) {
                    unique_arr[unique_array_tracker] = arr[i];
                    unique_array_tracker += 1;
                }
            }
        }

        for(int i = 0; i < unique_arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(unique_arr[i] == arr[j]){
                    count+=1;
                }
            }
            System.out.println(unique_arr[i]+" - "+count+" times");
        }


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(unique_arr));

    }
}
