package LAB_1;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        boolean flag = false;
        int count = 0;

        for(int i = 0; i < 10; i++){
            int num = sc.nextInt();
            if(num > 0 && num % 2 != 0){
                 count += 1;
                flag = true;
                if(num > max){
                    max = num;
                }
                if(num < min){
                    min = num;
                }
                sum += num;

            }

        }
        if(!flag){
            System.out.println("No odd positive numbers found.");
        }
        float avg =(float) sum / count;
        System.out.println("Sum "+sum);
        System.out.println("Maximum "+max);
        System.out.println("Minimum "+min);
        System.out.println("Average "+avg);







    }
}
