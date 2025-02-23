import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string in small letter: ");
        String st = sc.nextLine().toLowerCase();
        String result = "";
        for(int i = 0; i < st.length(); i++){
            int ch = st.charAt(i);
            if( ch == 97){
                result += (char) 122;
            }
            else{
                result += (char) (ch-1);
            }
        }
        System.out.println(result);
    }
}
