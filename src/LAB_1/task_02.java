package LAB_1;

import java.util.Scanner;

public class task_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers to of the range: ");
        int first = sc.nextInt();
        int end = sc.nextInt();
        int result = primeCount(first,end);
        System.out.println("There are 2 prime numbers between "+first+ " and "+ end);
    }
    static int primeCount(int first, int end){

        int primeNumCount = 0;
        for(int i = first; i < end; i++){
            int count = 0;
            boolean flag = true;
            for(int j = 1; j <= i; j++){
                if(i % j == 0 ){
                    count += 1;
                    if(count > 2){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                primeNumCount += 1;
            }

        }
        return primeNumCount;
    }

}
