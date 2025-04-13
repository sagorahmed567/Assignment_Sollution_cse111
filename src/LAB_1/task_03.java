package LAB_1;
import java.util.Scanner;
public class task_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String st1 = sc.nextLine();
        String st2 = sc.nextLine();
        String newString = st1+" "+st2;
        int sum = 0;
        for(int i = 0; i < newString.length(); i++){
            int x = (int)newString.charAt(i);
         if( x >= 97 &&  x <= 122  || x >= 65 && x <= 90){
             sum += x;
         }
        }
        System.out.println(newString);
        System.out.println(sum);
    }
}
